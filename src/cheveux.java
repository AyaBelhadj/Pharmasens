
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class cheveux extends mainProjet{ 
	private JFrame framee ;
	private ImageIcon fondImg;
	private JLabel myLabel;
	private JButton retour;
	private JButton ajoutPanier1;
	private JButton Bproduit1;
	private JButton ajoutPanier2;
	private JButton Bproduit2;
	private JButton ajoutPanier3;
	private JButton Bproduit3;
	private JButton ajoutPanier4;
	private JButton Bproduit4;
	private JButton ajoutPanier5;
	private JButton Bproduit5;
	private JButton ajoutPanier6;
	private JButton Bproduit6;
	private JButton ajoutPanier7;
	private JButton Bproduit7;
	private JButton ajoutPanier8;
	private JButton Bproduit8;
	
	private Produits P1 ;
	
	
	
	public cheveux()
	{
		
		
		fondImg = new ImageIcon(this.getClass().getResource("recources/cheveux.png"));
		myLabel= new JLabel(fondImg);
		//myLabel.setSize(534,800);
		myLabel.setSize(1000,790);
		framee=new JFrame("Cheveux");
		framee.add(myLabel);
		framee.setSize(1000,790);
		framee.setLayout(null);
		framee.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		framee.setVisible(true);
		framee.setLocationRelativeTo(null);
		framee.setResizable(false);
		Color c=new Color(251,251,251);
		framee.setBackground(c);
		
		
		
		
		//button retour 
				retour = new JButton();
				retour.setBounds(889,48,65,45);                  
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
		
		
		
		
		
		
		Bproduit1 = new JButton();
		Bproduit1.setBounds(148,122,180,192);                  
		Bproduit1.setOpaque(false); 								
		Bproduit1.setContentAreaFilled(false);						
		Bproduit1.setBorderPainted(true);
		myLabel.add(Bproduit1);
		
		
		ajoutPanier1 = new JButton();
		ajoutPanier1.setBounds(185,377,110,22);                  
		ajoutPanier1.setOpaque(false); 								
		ajoutPanier1.setContentAreaFilled(false);						
		ajoutPanier1.setBorderPainted(false);
		myLabel.add(ajoutPanier1);
		
		Bproduit2 = new JButton();
		Bproduit2.setBounds(347,122,180,192);                  
		Bproduit2.setOpaque(false); 								
		Bproduit2.setContentAreaFilled(false);						
		Bproduit2.setBorderPainted(true);
		myLabel.add(Bproduit2);
		
		ajoutPanier2 = new JButton();
		ajoutPanier2.setBounds(384,378,110,22);                  
		ajoutPanier2.setOpaque(false); 								
		ajoutPanier2.setContentAreaFilled(false);						
		ajoutPanier2.setBorderPainted(false);
		myLabel.add(ajoutPanier2);
		
		
		Bproduit3 = new JButton();
		Bproduit3.setBounds(546,122,180,192);                  
		Bproduit3.setOpaque(false); 								
		Bproduit3.setContentAreaFilled(false);						
		Bproduit3.setBorderPainted(true);
		myLabel.add(Bproduit3);
		

		ajoutPanier3 = new JButton();
		ajoutPanier3.setBounds(583,378,110,22);                  
		ajoutPanier3.setOpaque(false); 								
		ajoutPanier3.setContentAreaFilled(false);						
		ajoutPanier3.setBorderPainted(false);
		myLabel.add(ajoutPanier3);
		
		
		
		Bproduit4 = new JButton();
		Bproduit4.setBounds(753,119,180,192);                  
		Bproduit4.setOpaque(false); 								
		Bproduit4.setContentAreaFilled(false);						
		Bproduit4.setBorderPainted(true);
		myLabel.add(Bproduit4);
		
		
		ajoutPanier4 = new JButton();
		ajoutPanier4.setBounds(787,374,110,22);                  
		ajoutPanier4.setOpaque(false); 								
		ajoutPanier4.setContentAreaFilled(false);						
		ajoutPanier4.setBorderPainted(false);
		myLabel.add(ajoutPanier4);
		
		
		Bproduit5 = new JButton();
		Bproduit5.setBounds(148,448,180,192);                  
		Bproduit5.setOpaque(false); 								
		Bproduit5.setContentAreaFilled(false);						
		Bproduit5.setBorderPainted(true);
		myLabel.add(Bproduit5);
		
		
		ajoutPanier5 = new JButton();
		ajoutPanier5.setBounds(185,703,110,22);                  
		ajoutPanier5.setOpaque(false); 								
		ajoutPanier5.setContentAreaFilled(false);						
		ajoutPanier5.setBorderPainted(false);
		myLabel.add(ajoutPanier5);
		

		Bproduit6 = new JButton();
		Bproduit6.setBounds(347,448,180,192);                  
		Bproduit6.setOpaque(true); 								
		Bproduit6.setContentAreaFilled(false);						
		Bproduit6.setBorderPainted(true);
		myLabel.add(Bproduit6);
		
		
		ajoutPanier6 = new JButton();
		ajoutPanier6.setBounds(384,703,110,22);                  
		ajoutPanier6.setOpaque(false); 								
		ajoutPanier6.setContentAreaFilled(false);						
		ajoutPanier6.setBorderPainted(false);
		myLabel.add(ajoutPanier6);
		
		Bproduit7 = new JButton();
		Bproduit7.setBounds(546,448,180,192);                  
		Bproduit7.setOpaque(false); 								
		Bproduit7.setContentAreaFilled(false);						
		Bproduit7.setBorderPainted(true);
		myLabel.add(Bproduit7);
		
		
		ajoutPanier7 = new JButton();
		ajoutPanier7.setBounds(583,703,110,22);                  
		ajoutPanier7.setOpaque(false); 								
		ajoutPanier7.setContentAreaFilled(false);						
		ajoutPanier7.setBorderPainted(false);
		myLabel.add(ajoutPanier7);
		
		Bproduit8 = new JButton();
		Bproduit8.setBounds(753,443,180,192);                  
		Bproduit8.setOpaque(false); 								
		Bproduit8.setContentAreaFilled(false);						
		Bproduit8.setBorderPainted(true);
		myLabel.add(Bproduit8);
		
		
		ajoutPanier8 = new JButton();
		ajoutPanier8.setBounds(787,698,110,22);                  
		ajoutPanier8.setOpaque(false); 								
		ajoutPanier8.setContentAreaFilled(false);						
		ajoutPanier8.setBorderPainted(false);
		myLabel.add(ajoutPanier8);
		
		
	
		
		

		Produits Ch1 = new Produits ("C1","SHAMPOOING CAMOMILLE 200ML KLORANE",new ImageIcon(this.getClass().getResource("recources/KloranePan.png")),5,19.5,"CHEVEUX","KLORANE","Ce shampooing donne progressivement des reflets dorés très naturels tout en apportant brillance et luminosité aux cheveux.\r\n"
				+ "Il illumine donc les cheveux blonds pour un effet soleil jour après jour.\r\n"
				+ "Avec sa base émulsionnante très douce et son agent démêlant volumateur, il permet un usage quotidien par toute la famille et convient parfaitement aux enfants.\r\n"
				+ "");
		
		ajoutPanier1.addActionListener((ActionListener) new ActionListener() {
			
		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	mainProjet.ListProdPan.add(Ch1);
		    	Frame.infoBox("Produit Ajouté!","Success");
		    	
		    }
		});

		
		
		
		ajoutPanier2.addActionListener((ActionListener) new ActionListener() {

			
			//@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	mainProjet.ListProdPan.add(mainProjet.Ch2);
		    	Frame.infoBox("Produit Ajouté!","Success");
		    	
		    }
		});
		
		

		
		ajoutPanier3.addActionListener((ActionListener) new ActionListener() {

			
			//@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	mainProjet.ListProdPan.add(mainProjet.Ch3);
		    	Frame.infoBox("Produit Ajouté!","Success");
		    	
		    }
		});
		
		
		
		ajoutPanier4.addActionListener((ActionListener) new ActionListener() {

			
			//@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	mainProjet.ListProdPan.add(mainProjet.Ch4);
		    	Frame.infoBox("Produit Ajouté!","Success");
		    	
		    }
		});
		
	
		
		ajoutPanier5.addActionListener((ActionListener) new ActionListener() {

			
			//@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	mainProjet.ListProdPan.add(mainProjet.Ch5);
		    	Frame.infoBox("Produit Ajouté!","Success");
		    	
		    }
		});
		

		
		
		ajoutPanier6.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	mainProjet.ListProdPan.add(mainProjet.Ch6);
		    	Frame.infoBox("Produit Ajouté!","Success");
		    	
		    }
		});
		

		
		ajoutPanier7.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	mainProjet.ListProdPan.add(mainProjet.Ch7);
		    	Frame.infoBox("Produit Ajouté!","Success");
		    }
		});
		
		
		
		

		
		ajoutPanier8.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	
		    	ListProdPan.add(mainProjet.Ch8);
		    	Frame.infoBox("Produit Ajouté!","Success");
		    	
		    	
		    	
		    }
		});
		

		
}
	
	public static void main(String[] args) {
	
	new cheveux();
	}

}

