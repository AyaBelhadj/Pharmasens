
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Payment {

	private JFrame framee ;
	private ImageIcon IconP;
	private JLabel myLabel;
	
	
	

	public Payment()
	{
		
		
		IconP = new ImageIcon(this.getClass().getResource("recources/payment.png"));
		myLabel= new JLabel(IconP);
		
		myLabel.setSize(907,285);
		
		framee=new JFrame("Payments");
		framee.add(myLabel);
		framee.setSize(907,320);
		framee.setLayout(null);
		framee.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		framee.setVisible(true);
		framee.setLocationRelativeTo(null);
		framee.setResizable(false);
	}
}

