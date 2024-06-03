import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class corps1 extends mainProjet {

	private JFrame framee ;
	private ImageIcon coprsIcon;
	private JLabel myLabel;
	private JButton logo ;
	private JButton retour ;
	private JButton Nuxe1 ;
	private JButton Nuxe2 ;
	private JButton Nuxe3 ;
	private JButton Avene ;
	private JButton Herb;
	private JButton acm ;
	private JButton eucer ;
	private JButton ducray ;
	


	public corps1()
	{
		super();
		coprsIcon = new ImageIcon(this.getClass().getResource("recources/coprss.png"));
		myLabel= new JLabel(coprsIcon);
		myLabel.setSize(954,855);
		
		framee=new JFrame("Corps");
		framee.add(myLabel);
		framee.setSize(954,855);
		framee.setLayout(null);
		framee.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		framee.setVisible(true);
		framee.setLocationRelativeTo(null);
		framee.setResizable(false);
		
		//button retour 
				retour = new JButton();
				retour.setBounds(847,15,71,45);                  
				retour.setOpaque(false); 								
				retour.setContentAreaFilled(false);						
				retour.setBorderPainted(true);
				myLabel.add(retour);
				
				//link logo 
				
				retour.addActionListener(e -> {
					
					});

				
				retour.addActionListener((ActionListener) new ActionListener() {

				    //@Override
				    public void actionPerformed(ActionEvent e) {
				    	
				    	new Home(framee); // Home : classe 
				    	
				    }
				});
		
		
		//button logo 
		logo = new JButton();
		logo.setBounds(5,2,80,60);                  
		logo.setOpaque(false); 								
		logo.setContentAreaFilled(false);						
		logo.setBorderPainted(false);
		myLabel.add(logo);
		
		//link logo 
		
				logo.addActionListener(e -> {
					
					});

				
				logo.addActionListener((ActionListener) new ActionListener() {

				    //@Override
				    public void actionPerformed(ActionEvent e) {
				    	
				    	new Home(framee); // Home : classe 
				    	
				    }
				});
		
				//button logoNuxe1  
				Nuxe1 = new JButton();
				Nuxe1.setBounds(17,66,206,223);                  
				Nuxe1.setOpaque(false); 								
				Nuxe1.setContentAreaFilled(false);						
				Nuxe1.setBorderPainted(true);
				myLabel.add(Nuxe1);
				
				//link logoNuxe1 
				
				
				//button logoNuxe2  
				Nuxe2 = new JButton();
				Nuxe2.setBounds(245,64,206,223);                  
				Nuxe2.setOpaque(false); 								
				Nuxe2.setContentAreaFilled(false);						
				Nuxe2.setBorderPainted(true);
				myLabel.add(Nuxe2);
				
				//link logoNuxe1 
				
				
				//button logoNuxe3  
				Nuxe3 = new JButton();
				Nuxe3.setBounds(469,65,204,219);                  
				Nuxe3.setOpaque(false); 								
				Nuxe3.setContentAreaFilled(false);						
				Nuxe3.setBorderPainted(true);
				myLabel.add(Nuxe3);
				
				//link logoNuxe3
				
				
				//button logoAvene   
				Avene = new JButton();
				Avene.setBounds(10,442,208,220);                  
				Avene.setOpaque(false); 								
				Avene.setContentAreaFilled(false);						
				Avene.setBorderPainted(true);
				myLabel.add(Avene);
				
				//link logoavene
				
				
				//button logoNuxe1  
				Herb = new JButton();
				Herb.setBounds(694,66,207,220);                  
				Herb.setOpaque(false); 								
				Herb.setContentAreaFilled(false);						
				Herb.setBorderPainted(true);
				myLabel.add(Herb);
				
				//link logoHerbeos 
				
				
				//button logoacm  
				acm = new JButton();
				acm.setBounds(240,441,206,220);                  
				acm.setOpaque(false); 								
				acm.setContentAreaFilled(false);						
				acm.setBorderPainted(true);
				myLabel.add(acm);
				
				//link logoacm
				
				
				//button logoaucer 
				eucer = new JButton();
				eucer.setBounds(471,441,207,220);                  
				eucer.setOpaque(false); 								
				eucer.setContentAreaFilled(false);						
				eucer.setBorderPainted(true);
				myLabel.add(eucer);
				
				//link logoaucer
				
				
				//button logoducray  
				ducray = new JButton();
				ducray.setBounds(692,441,207,221);                  
				ducray.setOpaque(false); 								
				ducray.setContentAreaFilled(false);						
				ducray.setBorderPainted(true);
				myLabel.add(ducray);
				
				
				
				
				//ajout panier p1
				JButton P1 = new JButton();
				P1.setBounds(58,358,130,26);                  
				P1.setOpaque(false); 								
				P1.setContentAreaFilled(false);						
				P1.setBorderPainted(false);
				myLabel.add(P1);
				
				P1.addActionListener(e -> {
					
					});

				
				P1.addActionListener((ActionListener) new ActionListener() {

				    //@Override
				    public void actionPerformed(ActionEvent e) {
				    	
				    	 // Home : classe 
				    	Frame.infoBox("Produit Ajouté!","Success");
				    	ListProdPan.add(Cor1);   //ajout produit au vector panier
				    	//System.out.println(ListProdPan.get(ListProdPan.size()-1).getLib());   
				    	}
				});
				
				
				
				
				JButton P2 = new JButton();
				P2.setBounds(290,358,130,26);                  
				P2.setOpaque(false); 								
				P2.setContentAreaFilled(false);						
				P2.setBorderPainted(false);
				myLabel.add(P2);
				
				P2.addActionListener(e -> {
					
					});

				
				P2.addActionListener((ActionListener) new ActionListener() {

				    //@Override
				    public void actionPerformed(ActionEvent e) {
				    	
				    	 // Home : classe 
				    	Frame.infoBox("Produit Ajouté!","Success");ListProdPan.add(Cor2);   //ajout produit au vector panier
				    	//System.out.println(ListProdPan.get(ListProdPan.size()-1).getLib());   
				    	}
				});
				
				
				
				JButton P3 = new JButton();
				P3.setBounds(513,358,130,26);                  
				P3.setOpaque(false); 								
				P3.setContentAreaFilled(false);						
				P3.setBorderPainted(false);
				myLabel.add(P3);
				
				P3.addActionListener(e -> {
					
					});

				
				P3.addActionListener((ActionListener) new ActionListener() {

				    //@Override
				    public void actionPerformed(ActionEvent e) {
				    	
				    	 // Home : classe 
				    	Frame.infoBox("Produit Ajouté!","Success");ListProdPan.add(Cor3);   //ajout produit au vector panier
				    	//System.out.println(ListProdPan.get(ListProdPan.size()-1).getLib());   
				    	}
				});
				
				
				
				JButton P4 = new JButton();
				P4.setBounds(740,358,130,26);                  
				P4.setOpaque(false); 								
				P4.setContentAreaFilled(false);						
				P4.setBorderPainted(false);
				myLabel.add(P4);
				
				P4.addActionListener(e -> {
					
					});

				
				P4.addActionListener((ActionListener) new ActionListener() {

				    //@Override
				    public void actionPerformed(ActionEvent e) {
				    	
				    	 // Home : classe 
				    	Frame.infoBox("Produit Ajouté!","Success");ListProdPan.add(Cor4);   //ajout produit au vector panier
				    	//System.out.println(ListProdPan.get(ListProdPan.size()-1).getLib());   
				    	}
				});
				
				
				
				
				JButton P5 = new JButton();
				P5.setBounds(58,736,130,26);                  
				P5.setOpaque(false); 								
				P5.setContentAreaFilled(false);						
				P5.setBorderPainted(false);
				myLabel.add(P5);
				
				P5.addActionListener(e -> {
					
					});

				
				P5.addActionListener((ActionListener) new ActionListener() {

				    //@Override
				    public void actionPerformed(ActionEvent e) {
				    	
				    	 // Home : classe 
				    	Frame.infoBox("Produit Ajouté!","Success");ListProdPan.add(Cor5);   //ajout produit au vector panier
				    	//System.out.println(ListProdPan.get(ListProdPan.size()-1).getLib());   
				    	}
				});
				
				
				
				
				JButton P6 = new JButton();
				P6.setBounds(286,736,130,26);                  
				P6.setOpaque(false); 								
				P6.setContentAreaFilled(false);						
				P6.setBorderPainted(false);
				myLabel.add(P6);
				
				P6.addActionListener(e -> {
					
					});

				
				P6.addActionListener((ActionListener) new ActionListener() {

				    //@Override
				    public void actionPerformed(ActionEvent e) {
				    	
				    	 // Home : classe 
				    	Frame.infoBox("Produit Ajouté!","Success");ListProdPan.add(Cor6);   //ajout produit au vector panier
				    	//System.out.println(ListProdPan.get(ListProdPan.size()-1).getLib());   
				    	}
				});
				
				
				
				
				JButton P7 = new JButton();
				P7.setBounds(515,736,130,26);                  
				P7.setOpaque(false); 								
				P7.setContentAreaFilled(false);						
				P7.setBorderPainted(false);
				myLabel.add(P7);
				
				P7.addActionListener(e -> {
					
					});

				
				P7.addActionListener((ActionListener) new ActionListener() {

				    //@Override
				    public void actionPerformed(ActionEvent e) {
				    	
				    	 // Home : classe 
				    	Frame.infoBox("Produit Ajouté!","Success");ListProdPan.add(Cor7);   //ajout produit au vector panier
				    	//System.out.println(ListProdPan.get(ListProdPan.size()-1).getLib());   
				    	}
				});
				
				
				
				
				JButton P8 = new JButton();
				P8.setBounds(734,730,130,26);                  
				P8.setOpaque(false); 								
				P8.setContentAreaFilled(false);						
				P8.setBorderPainted(false);
				myLabel.add(P8);
				
				P8.addActionListener(e -> {
					
					});

				
				P8.addActionListener((ActionListener) new ActionListener() {

				    //@Override
				    public void actionPerformed(ActionEvent e) {
				    	
				    	 // Home : classe 
				    	Frame.infoBox("Produit Ajouté!","Success");ListProdPan.add(Cor8);   //ajout produit au vector panier
				    	//System.out.println(ListProdPan.get(ListProdPan.size()-1).getLib());   
				    	}
				});
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//link 
				
				
			
			
		
	}
}
