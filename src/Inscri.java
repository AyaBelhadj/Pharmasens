/*import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Inscri {

	private JFrame framee ;
	private ImageIcon carIcon;
	private JLabel myLabel;
	
	
	

	public Inscri()
	{
		
		
		//carIcon = new ImageIcon(this.getClass().getResource("recources/warda.jpg"));
		myLabel= new JLabel(carIcon);
		myLabel.setSize(1120,617);
		
		framee=new JFrame("Creer un compte");
		framee.add(myLabel);
		framee.setSize(1120,650);
		framee.setLayout(null);
		framee.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		framee.setVisible(true);
		framee.setLocationRelativeTo(null);
		framee.setResizable(false);
	}
}*/

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Inscri {
	

	private JFrame framee ;
	private ImageIcon fond;
	private JLabel myLabel;
	private JButton enregistrer;
	private JButton montrer;
	private JTextArea nom;
	private JTextArea prenom;
	private JTextArea email;
	private JTextArea date;
	private JPasswordField password;
	
	
	public Inscri()
	{
		fond = new ImageIcon(this.getClass().getResource("recources/inscri.png"));
		myLabel= new JLabel(fond);
		myLabel.setSize(900,700);
		framee=new JFrame("Creer un compte");
		framee.add(myLabel);
		framee.setSize(900,735);
		framee.setLayout(null);
		framee.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		framee.setVisible(true);
		framee.setLocationRelativeTo(null);
		framee.setResizable(false);
		
		// bouton enregistrer
		enregistrer = new JButton();
		enregistrer.setBounds(621,621,130,41); 
		enregistrer.setOpaque(false); 								
		enregistrer.setContentAreaFilled(false);						
		enregistrer.setBorderPainted(true);
		myLabel.add(enregistrer);
		
		// bouton montrer
		montrer= new JButton();
		montrer.setBounds(501,372,90,40); 
		montrer.setOpaque(false); 								
		montrer.setContentAreaFilled(false);						
		montrer.setBorderPainted(false);
		myLabel.add(montrer);
				
		Color c=new Color(250,250,250);  
		Font  f1  = new Font(Font.DIALOG, Font.ITALIC,  25);
		
		//textbox de l'email
		email = new JTextArea();
		email.setBounds(318,318,260,30);
		email.setBackground(c);
		email.setFont(f1);
		myLabel.add(email);
		
		//textbox du nom
		nom= new JTextArea();
		nom.setBounds(318,258,260,30);
		nom.setBackground(c);
		nom.setFont(f1);
		myLabel.add(nom);
		
		//textbox du prenom
		prenom= new JTextArea();
		prenom.setBounds(318,200,260,30);
		prenom.setBackground(c);
		prenom.setFont(f1);
		myLabel.add(prenom);
		
		//textbox de la date de naissance
		date= new JTextArea();
		date.setBounds(318,438,260,30);
		date.setBackground(c);
		date.setFont(f1);
		myLabel.add(date);
		
		//textbox de mdp
		password = new 	JPasswordField();
		password.setBounds(318,377,180,30);
		password.setBackground(c);
		password.setFont(f1);
		myLabel.add(password);
		password.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		//pour aller au home
		enregistrer.addActionListener(e -> {
			   framee.dispose();
			});
		

		
		enregistrer.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	Statement st=Test.envoi();
		    	String sql="insert into client values (null,'"+nom.getText()+"','"+prenom.getText()+"','"+email.getText()+"','"+String.valueOf(password.getPassword())+"','"+date.getText()+"');";
		    	try {
					st.executeUpdate(sql);
					Frame.infoBox("Votre compte a été créé!","Success!");
					
					
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
		    	
		    	new Home(framee);
		    }
		});
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException 
	{

		
		new Frame();
	}
}
