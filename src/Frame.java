import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Frame {
	private JFrame framee ;
	private ImageIcon carIcon;
	private JLabel myLabel; // pour mettre dedans fond 
	private JButton connexion;
	private JButton inscription;
	private JTextArea email;
	private JPasswordField password;
	
	//pour les MessageBoxs
	public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage,titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
	
	public Frame()
	{
		
		
		carIcon = new ImageIcon(this.getClass().getResource("recources/cnx.jpg")); // init fond 
		myLabel= new JLabel(carIcon);
		myLabel.setSize(1120,617);
		
		framee=new JFrame("PharmaSens");
		framee.add(myLabel);
		framee.setSize(1120,650);
		framee.setLayout(null);//absolute positioning : null layout means absolute positioning - you have to do all the work in your code. No layout manager to help you out
		framee.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//s used to close your JFrame as well as Java process. Test it with a JFrame sample program without the setDefaultCloseOperaton. Close your jframe by clicking the windows close.
		framee.setVisible(true);
		framee.setLocationRelativeTo(null); // is commonly used to center the gui on the screen.
		
		framee.setResizable(false);
		
		
		
		// bouton transparent 
		// connexion
		connexion = new JButton();
		connexion.setBounds(446,310,223,67);                  
		connexion.setOpaque(false); 								
		connexion.setContentAreaFilled(false);						
		connexion.setBorderPainted(true);
		myLabel.add(connexion);
		
		
		// bouton transparent 
		// inscription
		inscription = new JButton();
		inscription.setBounds(407,470,330,25);                  
		inscription.setOpaque(false); 								
		inscription.setContentAreaFilled(false);						
		inscription.setBorderPainted(false);
		myLabel.add(inscription);
	
		

		Color c=new Color(250,250,250);  // arriere plan 
		Font  f1  = new Font(Font.DIALOG, Font.ITALIC, 30);
		
		//textbox de l'email
		email = new JTextArea();
		email.setBounds(330,70,448,40);
		email.setBackground(c);
		email.setFont(f1);
		myLabel.add(email);
		
		
		//textbox de mdp
		password = new 	JPasswordField();
		password.setBounds(330,175,448,40);
		password.setBackground(c);
		password.setFont(f1);
		myLabel.add(password);
		password.setBorder(javax.swing.BorderFactory.createEmptyBorder()); // pour rendre bordure invisible
		
	
		
		
		
	/* somehow that's how to link to another page */
		

		
		connexion.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	// get text from email and pass
		    	String user = email.getText();
		    	String pass = String.valueOf(password.getPassword());
		    	
		    	// début execution de la requete
		    	Statement st=Test.envoi();
		    	String sql="select * from client where ( client.email = '"+user+"' AND client.mdp = '"+pass+"' );";  // formation de la requete
		    	
		    	
		    	//pour vérifier l'existence de la combinaison mail/pass dans la base 
		    	try {
		    		
		    		ResultSet rs =st.executeQuery(sql);
		    		//si non existant
					if (!rs.next()) {
						infoBox("L'email ou le mot de passe ne sont pas valides! Veuillez réessayer.","Erreur d'authentification.");
						
					}
					//si existant
					else {
						
						new Home(framee); // Home : classe 
						
						}
		    	}
				 catch (SQLException e1) {
					e1.printStackTrace();
				}
		    	   	
		    }
		});
		
		
		
		
		inscription.addActionListener(e -> {
			   framee.dispose();
			});

		
		inscription.addActionListener((ActionListener) new ActionListener() {

		    //@Override 
		    public void actionPerformed(ActionEvent e) {
		    	
		    	new Inscri();
		    	
		    }
		});
		
		
}
	
	
	public static void main(String[] args) {
	new Frame();
	

	
	}

}
