import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	JTextField t = new JTextField(20);
	JButton b = new JButton();
	public static void main(String[] args) {
		BinaryConverter binary = new BinaryConverter();
		binary.converter();
		
		
	}
	
	void converter() {
		f.add(p);
		p.add(b);
		p.add(t);
		p.add(l);
		f.setVisible(true);
		b.addActionListener(this);
		b.setText("convert");
		f.pack();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String newS = convert(t.getText());
		l.setText(newS);
		f.pack();
		
	}
	

	
}
