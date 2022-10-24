package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener {
	
	protected static JTextField userText;
	protected static JPasswordField passwordText;
	protected static JFrame frame;
	protected static JPanel panel;
	protected static int accCount = 0;
	protected static CreateAccount [] accArr = new CreateAccount [10];
	protected static String user;
	protected static String password;
	
	
	
	
	
	public void login() {
		
		//Creating a frame Object
		frame = new JFrame();
		//Creating a panel Object
		panel = new JPanel();
		
		//Setting frame size
		frame.setSize(350, 200);
		//Exits the frame upon closing
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Shows or hides the window depending on the parameter
		frame.setVisible(true);
		//Add the panel in the frame
		frame.add(panel);
		
		panel.setLayout(null);
		
		
		//Creating a user label
		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10,20,80,25);
		panel.add(userLabel);
		
		//Creating the user text box
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		user = userText.getText();
		panel.add(userText);
		
		//Creating a user label 
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10,50,80,25);
		panel.add(passwordLabel);
		
		//Creating the password text box
		passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 50, 165, 25);
		password = passwordText.getText();
		panel.add(passwordText);
		
		JButton button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new Login());
		panel.add(button);
		
		JButton button2 = new JButton("Create Account");
		button2.setBounds(10, 110, 200, 25);
		button2.addActionListener(new CreateAccount(user, password));
		panel.add(button2);
		
		
		frame.setVisible(true);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int cri = 0;
		
		for (int i = 0; i < accCount; i++)
		{
			 cri  = 0;
			
			user = userText.getText();
			if (accArr[i].getUser().contentEquals(user))
			{
				cri++;
			}

			password = passwordText.getText();
			if (accArr[i].getPass().contentEquals(password))
			{
				cri++;
				
				if(cri == 2)
				{
					System.out.println("login successful");
					break;
				}
			}
		
		}
		
		if (cri < 2)
		{
			System.out.println("login not successful");
		}
		
		
	}
	
	
		
	

	

}
