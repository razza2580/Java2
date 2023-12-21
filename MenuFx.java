import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuFx extends JFrame implements ActionListener,MouseListener{
	JPopupMenu file; 
	JMenuItem i1,i2,i3;
	JLabel label;
	public MenuFx() {
	setSize(400,500);
	label=new JLabel();
	add(label);
	file=new JPopupMenu("file");
	add (file);
	i1=new JMenuItem("Item 1");
	i2=new JMenuItem("Item 2");
	i3=new JMenuItem("Item 3");
	file.add(i1);
	file.add(i2);
	file.addSeparator();
	file.add(i3);
	label.setBounds(200, 150, 100, 70);
	setLayout(null);
	setVisible(true);
	i1.addActionListener(this);
	i2.addActionListener(this);
	i3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
	String i=e.getActionCommand();
	label.setText(i);
	}
	public void mouseClicked(MouseEvent e) {
	file.show(this,e.getX(),e.getY());	
	}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public static void main (String[]args) {
	new MenuFx();	
	}
	}

