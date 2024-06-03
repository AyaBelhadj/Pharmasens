import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class contact {
	private JFrame framee ;
	private ImageIcon fond;
	private JLabel myLabel;
	private JButton envoyer;
	private JTextArea sujet;
	private JTextArea email;
	private JTextArea message;
	
	public contact()
	{
		fond = new ImageIcon(this.getClass().getResource("recources/contact.png"));
		myLabel= new JLabel(fond);
		myLabel.setSize(1023,560);
		framee=new JFrame("Contact");
		framee.add(myLabel);
		framee.setSize(1023,600);
		framee.setLayout(null);
		framee.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		framee.setVisible(true);
		framee.setLocationRelativeTo(null);
		framee.setResizable(false);
		
		// bouton envoyer
		envoyer = new JButton();
		envoyer.setBounds(841,453,123,44); 
		envoyer.setOpaque(false); 								
		envoyer.setContentAreaFilled(false);						
		envoyer.setBorderPainted(false);
		myLabel.add(envoyer);
				
		Color c=new Color(255,255,255);  
		Font  f1  = new Font(Font.DIALOG, Font.ITALIC,  25);
		
		//textbox du sujet
		sujet= new JTextArea();
		sujet.setBounds(326,108,371,33);
		sujet.setBackground(c);
		sujet.setFont(f1);
		myLabel.add(sujet);
			
		//textbox de l'email
		email = new JTextArea();
		email.setBounds(333,177,368,42);
		email.setBackground(c);
		email.setFont(f1);
		myLabel.add(email);

		
		//textbox du message
	    message= new JTextArea();
	    message.setBounds(332,318,605,87);
	    message.setBackground(c);
	    message.setFont(f1);
	    myLabel.add(message);
	    
		envoyer.addActionListener(e -> {
			   framee.dispose();
			});
		
		
		envoyer.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	Statement st=Test.envoi();
		    	String sql="insert into reclamation values (null,'"+email.getText()+"','"+message.getText()+"','"+sujet.getText()+"');";
		    	try {
					st.executeUpdate(sql);
					Frame.infoBox("Votre reclamation est bien recue!","Success!");
					
					
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
		    	new Home(framee);
		    }
		});
	}
	
	public static void main(String[] args) 
	{
		new Frame();
	}

}
