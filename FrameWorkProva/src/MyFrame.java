import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.ImageColor;
//import javax.swing.ImageIcon
public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	MyFrame(){
		
		button = new JButton(); 
	 	button.setBounds(150, 250, 170, 25);//set size and position of button
	 	//button.addActionListener(e -> System.out.println("pippo")); a way without adding pubblic ovveride
	 	button.addActionListener(this);//per farlo funzionare (this ovviamente è il jframe)
	 	button.setText("Schiacciami tutto");
	 	button.setFocusable(false);
	 	button.setFont(new Font("Arial", Font.BOLD,15));
	 	
	 	
	 JFrame frame = new JFrame();//creates a frame
		this.setTitle("Titolo del JFrame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);//prevent this from being resized
		this.setSize(500, 500);// sets the dimension, y dimension of this
		this.setVisible(true);//make this visible
		this.add(button);//add button to jframe
	
		/*ImageIcon image = new ImageIcon("immagine.png"); //creare un icona per farlo devi inserire l'immagine nel progetto
		frame.setIconImage(image.getImage());//change icon frame
		frame.GetContentPane().setBackground(new Color(0,0,0)); //change color bakcground
		
		
		
		*/
 }
int i =0;
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == button) {
		if(i==5) {
			System.out.println("Ancora e più forteeee!!");//message send in the cosnsole
			i++;
		}else if(i==10){
			System.out.println("Ti prego bastaaa! Non ce la faccio più");//message send in the cosnsole
			i=0;
		}else {
			System.out.println("oh, si!");//message send in the cosnsole
			i++;
		}
		
	}
}
}
