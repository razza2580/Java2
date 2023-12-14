import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Colours extends JFrame implements ActionListener{
 JButton black,blue,red;
	public Colours() {
		// TODO Auto-generated constructor stub
	setSize(500,600);
	black=new JButton("BLACK");
	blue=new JButton("BLUE");
	red=new JButton("red");
	add (black);
	add (blue);
	add (red);
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	black.addActionListener(this);
	blue.addActionListener(this);
	red.addActionListener(this);
	}
 @Override
 	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==black){
	getContentPane().setBackground(Color.BLACK);
	}
	else if(e.getSource()==blue) {
		getContentPane().setBackground(Color.BLUE);
	}
	else {
		getContentPane().setBackground(Color.RED);	
	}
 }
	public static void main(String[]args) {
new Colours();
}
}

