import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JScrollBar;

public class panier {

	private JFrame frmPanier;
	private int x=33;
	private int y=11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panier window = new panier();
					window.frmPanier.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public panier() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPanier = new JFrame();
		frmPanier.setTitle("Panier");
		frmPanier.setSize(1053,600);
		frmPanier.setVisible(true);
		frmPanier.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPanier.setLocationRelativeTo(null);
		frmPanier.setLocationRelativeTo(null);
		frmPanier.getContentPane().setLayout(null);
		frmPanier.setResizable(false);
		
		
		//image men fou9
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1037, 117);
		lblNewLabel.setIcon(new ImageIcon(panier.class.getResource("/recources/panier1.png")));
		frmPanier.getContentPane().add(lblNewLabel);
		
		
		
		//img melouta
			JLabel lb = new JLabel("New label");
			lb.setBounds(0, 475, 1037, 86);
			lb.setIcon(new ImageIcon(panier.class.getResource("/recources/panier.png")));
			frmPanier.getContentPane().add(lb);
			
		
			
			JButton btnNewButton = new JButton("New button");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Home(frmPanier);
			}});
		//Acc
		btnNewButton.setBounds(49, 32, 92, 62);
		btnNewButton.setOpaque(false); 
		btnNewButton.setContentAreaFilled(false);						
		btnNewButton.setBorderPainted(true);
		btnNewButton.setText(null);
		lblNewLabel.add(btnNewButton);
		
		//Commander 
			JButton btnButtonComm = new JButton("New buttonn");
			btnButtonComm.setBounds(630,22, 110, 42);
			btnButtonComm.setOpaque(false); 
			btnButtonComm.setContentAreaFilled(false);						
			btnButtonComm.setBorderPainted(false);
			btnButtonComm.setText(null);
			lb.add(btnButtonComm);
			
			btnButtonComm.addActionListener(e -> {
				frmPanier.dispose();
				});

			btnButtonComm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Payment();
			}});
				
		
		//Panel affichage prod
		JPanel panel = new JPanel();
		panel.setBounds(0, 117, 1037, 329);
		frmPanier.getContentPane().add(panel);
		panel.setLayout(null);
	
		
		
		
		
		for(int i=0;i<mainProjet.ListProdPan.size();i++)
		{
			JLabel lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(mainProjet.ListProdPan.get(i).ImagePanier);
			lblNewLabel_1.setBounds(x, y, 205, 309);
			panel.add(lblNewLabel_1);
			x=x+215;
			
		}

		
		
	}
}
