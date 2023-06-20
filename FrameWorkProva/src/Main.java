//import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		JFrame frame = new JFrame();//creates a frame
		frame.setTitle("Titolo del JFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);//prevent frame from being resized
		frame.setSize(420, 420);// sets the dimension, y dimension of frame
		frame.setVisible(true);//make frame visible
		
		ImageIcon image = new ImageIcon("immagine.png"); //creare un icona per farlo devi inserire l'immagine nel progetto
		frame.setIconImage(image.getImage());//change icon frame
		frame.GetContentPane().setBackground(new Color(0,0,0)); //change color bakcground
		*/
		//a Label is a GUI display area for string of next text, an image, or both
		
		//ImageIcon image = new ImageIcon("logo.jpg");
		Border border = BorderFactory.createLineBorder(Color.green,3);//importing border for the label
		
		JLabel label = new JLabel();//create label
		label.setText("Frase lunga, molto lunga");//set text of label
		//label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.RIGHT);//set text LEFT,CENTER,RIGHT of imageIcon
		label.setVerticalTextPosition(JLabel.CENTER);//set text TOP,CENTER,BOTTOM of imageIcon
		label.setForeground(new Color(0xFF0000));//set color
		label.setFont(new Font("MV Boli",Font.ROMAN_BASELINE,24));//set font
		label.setBackground(Color.black); //set background color ps. that's another way to put color
		label.setOpaque(true);//show background color
		label.setBorder(border);//show it
		label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon + text within label
		label.setHorizontalAlignment(JLabel.CENTER);//set horizontal..
		label.setBounds(90,0,300,100);
		
		
		MyFrame frame = new MyFrame();
		frame.add(label);// aggiungi label al frame
		//frame.setLayout(null);//become all white
		//frame.pack();//frame get size of label
		}

}
