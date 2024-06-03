import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Home {

	private JFrame framee ;
	private ImageIcon IconH;
	private JLabel myLabel;
	private JButton corps;
	private JButton marques ;
	private JButton Bvisage;
	private JButton pan;
	private JButton Bcheveux;
	private JButton contact;
	private JButton cnx ;

	public Home(JFrame f)
	{
		f.dispose();
		
		IconH = new ImageIcon(this.getClass().getResource("recources/home.jpg"));
		myLabel= new JLabel(IconH);
		myLabel.setSize(1610,815);
		
		framee=new JFrame("Home");
		framee.add(myLabel);
		framee.setSize(1610,815);
		framee.setLayout(null);
		framee.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		framee.setVisible(true);
		framee.setLocationRelativeTo(null);
		framee.setResizable(false);
		
		
		//Bouton panier
		cnx = new JButton();
		cnx.setBounds(1307,40,125,50);                  
		cnx.setOpaque(false); 								
		cnx.setContentAreaFilled(false);						
		cnx.setBorderPainted(false);
		
		myLabel.add(cnx);
		
		//link logo 
		
		cnx.addActionListener(e -> {
			framee.dispose();
			});

		
		cnx.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	new Frame(); // Home : classe 
		    	
		    }
		});
		
		pan = new JButton();
		pan.setBounds(1435,33,109,52);                  
		pan.setOpaque(false); 								
		pan.setContentAreaFilled(false);						
		pan.setBorderPainted(false);
		
		myLabel.add(pan);
		
		//link logo 
		
		pan.addActionListener(e -> {
			framee.dispose();
			});

		
		pan.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	new panier(); // Home : classe 
		    	
		    }
		});
		
		
		
		// Corps button 
		corps = new JButton();
		corps.setBounds(835,139,65,57);                  
		corps.setOpaque(false); 								
		corps.setContentAreaFilled(false);						
		corps.setBorderPainted(true);
		myLabel.add(corps);
		
		//Marques  button 
		marques = new JButton();
		marques.setBounds(900,139,83,57);                  
		marques.setOpaque(false); 								
		marques.setContentAreaFilled(false);						
		marques.setBorderPainted(true);
		myLabel.add(marques);
		
		//link 
		corps.addActionListener(e -> {
			framee.dispose();
			});

		
		corps.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	new corps1(); // Home : classe 
		    	
		    }
		});
		
		
		//link marques 

		marques.addActionListener(e -> {
			   framee.dispose();
			});

		
		marques.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	new marques1();
		    	
		    }
		});
		Bvisage = new JButton();
		Bvisage.setBounds(675,140,75,56);                  
		Bvisage.setOpaque(false); 								
		Bvisage.setContentAreaFilled(false);						
		Bvisage.setBorderPainted(true);
		myLabel.add(Bvisage);
		//link of page
		Bvisage.addActionListener(e -> {
	     framee.dispose();
			});

		
		Bvisage.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		   public void actionPerformed(ActionEvent e) {
		    	
		    	new visage();
		    	
		    }
		});
		Bcheveux = new JButton();
		Bcheveux.setBounds(750,140,85,56);                  
		Bcheveux.setOpaque(false); 								
		Bcheveux.setContentAreaFilled(false);						
		Bcheveux.setBorderPainted(true);
		myLabel.add(Bcheveux);
		//link of page
		Bcheveux.addActionListener(e -> {
	     framee.dispose();
			});

		
		Bcheveux.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		   public void actionPerformed(ActionEvent e) {
		    	
		    	new cheveux();
		    	
		    }
		});
		
		// Contact button 
				contact = new JButton();
				contact.setBounds(0,0,40,141);                  
				contact.setOpaque(false); 								
				contact.setContentAreaFilled(false);						
				contact.setBorderPainted(true);
				myLabel.add(contact);
				
				//link contact 

						contact.addActionListener(e -> {
							   framee.dispose();
							});

						
						contact.addActionListener((ActionListener) new ActionListener() {

						    //@Override
						    public void actionPerformed(ActionEvent e) {
						    	
						    	new contact();
						    	
						    }
						});
				
	
	}
	


}



	