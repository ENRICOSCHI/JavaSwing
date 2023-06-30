import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LabelEditor extends JFrame {
    private int[] numbers; // Array di numeri
    private JLabel[] numberLabels; // Array di JLabel per visualizzare i numeri
    private JTextField[] numberFields; // Array di JTextField per modificare i numeri

    public LabelEditor() {
        // Inizializza l'array di numeri (puoi modificare questo con i tuoi numeri) oppure basta cambiarlo con gli array già presenti nel codice
        numbers = new int[]{1, 2, 3, 4, 5};

        // Inizializza gli array di JLabel e JTextField
        numberLabels = new JLabel[numbers.length];
        numberFields = new JTextField[numbers.length];

        // Imposta le proprietà del JFrame
        setTitle("Editor di Label");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1289, 80);
        setLayout(new GridLayout(0, 5)); // Utilizza una griglia per allineare le label e i campi di testo

        // Crea e aggiungi le label e i campi di testo per ciascun numero
        for (int i = 0; i < numbers.length; i++) {
            // Crea una label per il testo "Label: "
            JLabel label = new JLabel("Label: ");

            // Crea una label per il numero (inizialmente come testo)
            JLabel numberLabel = new JLabel(Integer.toString(numbers[i]));

            // Crea un campo di testo per modificare il numero
            JTextField numberField = new JTextField(Integer.toString(numbers[i]));
            numberField.setVisible(false); // Il campo di testo è inizialmente nascosto
            numberField.setPreferredSize(new Dimension(80, 25)); // Imposta le dimensioni personalizzate per il campo di testo

            // Aggiungi la label e il campo di testo al JPanel
            JPanel panel = new JPanel();
            panel.add(label);
            panel.add(numberLabel);
            panel.add(numberField);

            // Aggiungi un listener alla label per visualizzare il campo di testo quando viene cliccata
            int finalI = i; // Indice finale per utilizzarlo all'interno dell'azione
            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    numberLabel.setVisible(false);
                    numberField.setVisible(true);
                }
            });

            // Aggiungi un listener al campo di testo per applicare le modifiche quando l'utente preme "Invio"
            numberField.addActionListener(e -> {
                int newValue = Integer.parseInt(numberField.getText());
                numbers[finalI] = newValue; // Aggiorna l'array originale con il nuovo valore

                numberLabel.setText(Integer.toString(newValue)); // Aggiorna la JLabel con il nuovo valore
                numberField.setVisible(false);
                numberLabel.setVisible(true);
            });

            numberLabels[i] = numberLabel; // Aggiungi la JLabel all'array
            numberFields[i] = numberField; // Aggiungi il JTextField all'array

            add(panel); // Aggiungi il pannello al JFrame
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LabelEditor editor = new LabelEditor();
            editor.setVisible(true);
        });
    }
}
