import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Confirm extends WindowAdapter{
	JFrame f;
	public Confirm() {
		f=new JFrame();
		f.setSize(500,500);
		f.setVisible(true);
		f.addWindowListener(this);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
	}
	public void windowClosing(WindowEvent e) {
	int choice=JOptionPane.showConfirmDialog(f,"Do you want to exist ?");
	if(choice==JOptionPane.YES_OPTION) {
	System.exit(0);
	
	}

}
public static void main(String[]args) {
	new Confirm();
}
}