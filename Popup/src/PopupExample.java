import javax.swing.JOptionPane;
public class PopupExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Mostra un popup di messaggio semplice
        JOptionPane.showMessageDialog(null, "Questo è un popup di messaggio.");

        // Mostra un popup di input per ottenere un valore dall'utente
        String input = JOptionPane.showInputDialog(null, "Inserisci qualcosa:");

        // Mostra un popup di conferma con pulsanti "Ok" e "Annulla"
        int choice = JOptionPane.showConfirmDialog(null, "Vuoi procedere?", "Conferma", JOptionPane.OK_CANCEL_OPTION);

        // Elabora la scelta dell'utente
        if (choice == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "Hai scelto 'Ok'.");
        } else if (choice == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Hai scelto 'Annulla'.");
        } else {
            JOptionPane.showMessageDialog(null, "Hai chiuso il popup senza fare una scelta.");
        }
	}

}
