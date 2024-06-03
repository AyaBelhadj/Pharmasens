import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Nuxe1 {
	private JFrame framee ;
	private ImageIcon carIcon;
	private JLabel myLabel;
	
	
	

	public  Nuxe1()
	{
		
		
		
		
		//carIcon = new ImageIcon(this.getClass().getResource("recources/warda.jpg"));
		myLabel= new JLabel(carIcon);
		myLabel.setSize(1120,617);
		
		framee=new JFrame("Nuxe1");
		framee.add(myLabel);
		framee.setSize(1120,650);
		framee.setLayout(null);
		framee.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		framee.setVisible(true);
		framee.setLocationRelativeTo(null);
		framee.setResizable(false);
		

		try {
		    BufferedImage phone = ImageIO.read(this.getClass().getResource("recources/heart.jpg"));
		    Graphics2D g2d = phone.createGraphics();
		    g2d.setColor(Color.RED);
		    g2d.fillOval(phone.getWidth() - 17, 0, 16, 16);
		    g2d.dispose();

		    JLabel label = new JLabel("Phone");
		    label.setIcon(new ImageIcon(phone));

		    JOptionPane.showMessageDialog(null, label);
		} catch (IOException ex) {
		    ex.printStackTrace();
		}
		
	
		
		
		
		
		
		
		
	}
}
