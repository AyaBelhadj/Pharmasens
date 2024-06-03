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

public class visage extends  mainProjet {
	private JFrame framee ;
	private ImageIcon fondImg;
	private JLabel myLabel;
	private JButton retour ;
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
	
	
	public visage()
	{
		
		super(); 
		fondImg = new ImageIcon(this.getClass().getResource("recources/produitsvisages.jpg"));
		myLabel= new JLabel(fondImg);
		//myLabel.setSize(534,800);
		myLabel.setSize(1031,770);
		framee=new JFrame("Visage");
		framee.add(myLabel);
		framee.setSize(1031,780);
		framee.setLayout(null);
		framee.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		framee.setVisible(true);
		framee.setLocationRelativeTo(null);
		framee.setResizable(false);
		Color c=new Color(251,251,251);
		framee.setBackground(c);
		
		
		
		//button retour 
		retour = new JButton();
		retour.setBounds(869,45,65,45);                  
		retour.setOpaque(false); 								
		retour.setContentAreaFilled(false);						
		retour.setBorderPainted(true);
		myLabel.add(retour);
		
		//link logo 
		
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
		Bproduit1.setBounds(150,104,180,190);                  
		Bproduit1.setOpaque(false); 								
		Bproduit1.setContentAreaFilled(false);						
		Bproduit1.setBorderPainted(false);
		myLabel.add(Bproduit1);
		
		
		
		
		ajoutPanier1 = new JButton();
		ajoutPanier1.setBounds(184,360,110,20);                  
		ajoutPanier1.setOpaque(false); 								
		ajoutPanier1.setContentAreaFilled(false);						
		ajoutPanier1.setBorderPainted(false);
		myLabel.add(ajoutPanier1);
		
		
		Bproduit2 = new JButton();
		Bproduit2.setBounds(345,104,180,195);                  
		Bproduit2.setOpaque(false); 								
		Bproduit2.setContentAreaFilled(false);						
		Bproduit2.setBorderPainted(false);
		myLabel.add(Bproduit2);
		
		ajoutPanier2 = new JButton();
		ajoutPanier2.setBounds(379,360,110,20);                  
		ajoutPanier2.setOpaque(false); 								
		ajoutPanier2.setContentAreaFilled(false);						
		ajoutPanier2.setBorderPainted(false);
		myLabel.add(ajoutPanier2);
		
		
		Bproduit3 = new JButton();
		Bproduit3.setBounds(544,104,180,195);                  
		Bproduit3.setOpaque(false); 								
		Bproduit3.setContentAreaFilled(false);						
		Bproduit3.setBorderPainted(false);
		myLabel.add(Bproduit3);
		
		
		

		ajoutPanier3 = new JButton();
		ajoutPanier3.setBounds(580,360,110,20);                  
		ajoutPanier3.setOpaque(false); 								
		ajoutPanier3.setContentAreaFilled(false);						
		ajoutPanier3.setBorderPainted(false);
		myLabel.add(ajoutPanier3);
		
		
		
		Bproduit4 = new JButton();
		Bproduit4.setBounds(738,104,178,195);                  
		Bproduit4.setOpaque(false); 								
		Bproduit4.setContentAreaFilled(false);						
		Bproduit4.setBorderPainted(false);
		myLabel.add(Bproduit4);
		
		
		
		
		ajoutPanier4 = new JButton();
		ajoutPanier4.setBounds(770,366,110,20);                  
		ajoutPanier4.setOpaque(false); 								
		ajoutPanier4.setContentAreaFilled(false);						
		ajoutPanier4.setBorderPainted(false);
		myLabel.add(ajoutPanier4);
		
		
		Bproduit5 = new JButton();
		Bproduit5.setBounds(152,427,182,195);                  
		Bproduit5.setOpaque(false); 								
		Bproduit5.setContentAreaFilled(false);						
		Bproduit5.setBorderPainted(false);
		myLabel.add(Bproduit5);
		
		
		
		
		ajoutPanier5 = new JButton();
		ajoutPanier5.setBounds(186,681,110,22);                  
		ajoutPanier5.setOpaque(false); 								
		ajoutPanier5.setContentAreaFilled(false);						
		ajoutPanier5.setBorderPainted(false);
		myLabel.add(ajoutPanier5);
		
		Bproduit6 = new JButton();
		Bproduit6.setBounds(350,427,181,193);                  
		Bproduit6.setOpaque(false); 								
		Bproduit6.setContentAreaFilled(false);						
		Bproduit6.setBorderPainted(false);
		myLabel.add(Bproduit6);
		
		
		ajoutPanier6 = new JButton();
		ajoutPanier6.setBounds(383,680,110,20);                  
		ajoutPanier6.setOpaque(false); 								
		ajoutPanier6.setContentAreaFilled(false);						
		ajoutPanier6.setBorderPainted(false);
		myLabel.add(ajoutPanier6);
		
		Bproduit7 = new JButton();
		Bproduit7.setBounds(546,426,178,190);                  
		Bproduit7.setOpaque(false); 								
		Bproduit7.setContentAreaFilled(false);						
		Bproduit7.setBorderPainted(false);
		myLabel.add(Bproduit7);
		
		
		ajoutPanier7 = new JButton();
		ajoutPanier7.setBounds(581,681,110,20);                  
		ajoutPanier7.setOpaque(false); 								
		ajoutPanier7.setContentAreaFilled(false);						
		ajoutPanier7.setBorderPainted(false);
		myLabel.add(ajoutPanier7);
	
		
		
		Bproduit8 = new JButton();
		Bproduit8.setBounds(745,429,178,195);                  
		Bproduit8.setOpaque(false); 								
		Bproduit8.setContentAreaFilled(false);						
		Bproduit8.setBorderPainted(false);
		myLabel.add(Bproduit8);
		
		ajoutPanier8 = new JButton();
		ajoutPanier8.setBounds(780,680,110,25);                  
		ajoutPanier8.setOpaque(false); 								
		ajoutPanier8.setContentAreaFilled(false);						
		ajoutPanier8.setBorderPainted(false);
		myLabel.add(ajoutPanier8);
		
		
	/*	ajoutPanier1.addActionListener(e -> {
			   framee.dispose();
			});*/

		
		ajoutPanier1.addActionListener((ActionListener) new ActionListener() {
			
			
		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	
		    	ListProdPan.add(Vis1);
		    	Frame.infoBox("Produit Ajouté!","Success");
		    	//panier x= new panier();
		    	
		    }
		});
		
		
		/*ajoutPanier2.addActionListener(e -> {
			   framee.dispose();
			});*/

		
		ajoutPanier2.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	ListProdPan.add(Vis2);
		    	Frame.infoBox("Produit Ajouté!","Success");
		    	//panier x= new panier();
		    	
		    }
		});
		
		
		/*ajoutPanier3.addActionListener(e -> {
			   framee.dispose();
			});*/

		
		ajoutPanier3.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	ListProdPan.add(Vis3);
		    	Frame.infoBox("Produit Ajouté!","Success");
		    	//panier x= new panier();
		    	
		    }
		});
		
	/*	ajoutPanier4.addActionListener(e -> {
			   framee.dispose();
			});*/

		
		ajoutPanier4.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	ListProdPan.add(Vis4);
		    	Frame.infoBox("Produit Ajouté!","Success");
		    	//panier x= new panier();
		    	
		    }
		});
		
		
		/*ajoutPanier5.addActionListener(e -> {
			   framee.dispose();
			});*/

		
		ajoutPanier5.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	ListProdPan.add(Vis5);
		    	Frame.infoBox("Produit Ajouté!","Success");
		    	//panier x= new panier();
		    	
		    }
		});
		
		
		/*ajoutPanier6.addActionListener(e -> {
			   framee.dispose();
			});*/

		
		ajoutPanier6.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	ListProdPan.add(Vis6);
		    	Frame.infoBox("Produit Ajouté!","Success");
		    //	panier x= new panier();
		    	
		    }
		});
		
	/*ajoutPanier7.addActionListener(e -> {
			   framee.dispose();
			});*/

		
		ajoutPanier7.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	ListProdPan.add(Vis7);
		    	Frame.infoBox("Produit Ajouté!","Success");
		    	//panier x= new panier();
		    	
		    }
		});
		
		
		
		
		/*ajoutPanier8.addActionListener(e -> {
			   framee.dispose();
			});*/

		
		ajoutPanier8.addActionListener((ActionListener) new ActionListener() {

		    //@Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	ListProdPan.add(Vis8);
		    	Frame.infoBox("Produit Ajouté!","Success");
		    	//panier x= new panier();
		    	
		    }
		});
		
}
	
	public static void main(String[] args) {
	new visage();
	}

}


