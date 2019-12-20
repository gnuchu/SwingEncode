import javax.swing.*;
import java.awt.event.*;
import java.util.Base64;

@SuppressWarnings("serial")
public class SwingEncode extends JFrame implements ActionListener {
	
	static JFrame frame;
	static JButton button;
	static JTextArea textarea1;
	static JTextArea textarea2;
	
	SwingEncode(){
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frame = new JFrame("Base64 Encode");
		frame.setSize(600, 600);
		frame.setLocation(400, 400);
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textarea1 = new JTextArea(10,10);
		textarea2 = new JTextArea(10,10);

		button = new JButton("Submit");
		SwingEncode se = new SwingEncode();
		button.addActionListener(se);
		
		JPanel panel = new JPanel();
		panel.add(textarea1);
		panel.add(button);
		panel.add(textarea2);

		frame.add(panel);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals("Submit")) {
			String input = textarea1.getText();
			String encoded = Base64.getEncoder().encodeToString(input.getBytes());
			textarea2.setText(encoded);
		} 
	}

}
