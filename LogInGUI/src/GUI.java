import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passWordLabel;
	private static JPasswordField passWordText;
	private static JButton button;
	private static JLabel succesLabel;




	
	
	
	

	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		
		panel.setLayout(null);
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passWordLabel = new JLabel("Password");
		passWordLabel.setBounds(10, 50, 80, 25);
		panel.add(passWordLabel);
		
		passWordText = new JPasswordField();
		passWordText.setBounds(100, 50, 165, 25);
		panel.add(passWordText);
		
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		succesLabel = new JLabel("");
		succesLabel.setBounds(10, 110, 300, 25);
		panel.add(succesLabel);
		//succesLabel.setText(null);
		
		
		frame.setVisible(true);
	

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String user = userText.getText();
		String password = passWordText.getText();
		
		if(user.equals("User") && password.equals("User")) {
			succesLabel.setText("Login succesful!");
		}
		
	}

}
