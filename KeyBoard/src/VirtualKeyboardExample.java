import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VirtualKeyboardExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Virtual Keyboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextField textField = new JTextField(20);
        textField.setPreferredSize(new Dimension(300, 30)); // Imposta le dimensioni preferite per la casella di testo

        JButton clearButton = new JButton("Cancella");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        JPanel keyboardPanel = new JPanel(new GridLayout(4, 10)); // 4 righe, 10 colonne per i pulsanti

        JButton[] buttons = new JButton[36]; // 26 lettere + 10 numeri
        for (int i = 0; i < 26; i++) {
            final char letter = (char) (65 + i); // ASCII value of 'A' is 65
            buttons[i] = new JButton(String.valueOf(letter));
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText() + letter);
                }
            });
            keyboardPanel.add(buttons[i]);
        }

        for (int i = 0; i < 10; i++) {
            final int digit = i;
            buttons[26 + i] = new JButton(String.valueOf(i));
            buttons[26 + i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText() + digit);
                }
            });
            keyboardPanel.add(buttons[26 + i]);
        }

        JButton showKeyboardButton = new JButton("Mostra Tastiera");
        showKeyboardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showOptionDialog(frame, keyboardPanel, "Tastiera virtuale", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
                if (option == JOptionPane.OK_OPTION) {
                    String text = textField.getText();
                    System.out.println("Testo inserito nel popup: " + text);
                }
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(clearButton);
        buttonPanel.add(showKeyboardButton);

        frame.add(textField, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
