import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
public class marques1 {
	private JFrame framee ;
	private ImageIcon marques;
	private JLabel myLabel;
	private JButton retour ;
	private JButton acm ;
	private JButton avene ;
	private JButton bioxsine ;
	private JButton ducray ;
	private JButton eucerin ;
	private JButton eyecare;
	private JButton herbeos;
	private JButton klorane;
	private JButton nuxe ;
	private JButton pharmaceris ;
	private JButton sesderma;
	
	public marques1(){
		marques = new ImageIcon(this.getClass().getResource("recources/marques.png"));
		myLabel= new JLabel(marques);
		myLabel.setSize(954,855);
		
		framee=new JFrame("Marques");
		framee.add(myLabel);
		framee.setSize(954,855);
		framee.setLayout(null);
		framee.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		framee.setVisible(true);
		framee.setLocationRelativeTo(null);
		framee.setResizable(false);
		
		
		//button retour 
		retour = new JButton();
		retour.setBounds(838,32,65,45);                  
		retour.setOpaque(false); 								
		retour.setContentAreaFilled(false);						
		retour.setBorderPainted(true);
		myLabel.add(retour);
		
		//link retour 
		//link 
				retour.addActionListener(e -> {
					framee.dispose();
					});

				
				retour.addActionListener((ActionListener) new ActionListener() {

				    //@Override
				    public void actionPerformed(ActionEvent e) {
				    	
				    	new Home(framee); // Home : classe 
				    	
				    }
				});
	

}

}
