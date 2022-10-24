package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CreateAccount extends Login implements ActionListener  {
	
	
	protected String userName;
	protected String password;
	
	public CreateAccount(String userName, String password)
	{
		this.userName = userName;
		this.password = password;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (accCount == 0)
		{
			user = userText.getText();
			password = passwordText.getText();
			
			CreateAccount newAcc = new CreateAccount(user, password);
			accArr[accCount] = newAcc;
			accCount++;
			System.out.println("account created");
		}
		
		else
		{
			boolean accountFound = false;
			user = userText.getText();
			password = passwordText.getText();
			for (int i = 0; i < accCount; i++)
			{
				if (accArr[i].getUser().equals(user))
				{
					System.out.println("Username already in use. Account not Created");
					accountFound =true;
					break;
				}
			}
			
			if (accountFound == false)
			{
				user = userText.getText();
				password = passwordText.getText();
				CreateAccount newAcc = new CreateAccount(user, password);
				accArr[accCount] = newAcc;
				accCount++;
				System.out.println("Account created");
			}
			
		}
		
	}
	
	public String getUser()
	{
		return this.userName;
	}
	
	public String getPass()
	{
		return this.password;
	}

}
