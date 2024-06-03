import java.util.Vector;

import javax.swing.ImageIcon;

public class mainProjet {
	static  Vector<Produits> ListProd = new Vector<Produits>(); ;
	static   Vector<Produits> ListProdPan=new Vector<Produits>(); ;

	static protected Produits Vis1 ; 
	static protected Produits Vis2; 
	static protected Produits Vis3 ; 
	static protected Produits Vis4;
	static protected Produits Vis5 ;
	static protected Produits Vis6 ;
	static protected Produits Vis7 ;
	static protected Produits Vis8 ; 
	
	static protected Produits Cor1 ; 
	static protected Produits Cor2; 
	static protected Produits Cor3 ; 
	static protected Produits Cor4;
	static protected Produits Cor5 ;
	static protected Produits Cor6 ;
	static protected Produits Cor7 ;
	static protected Produits Cor8 ; 
	
	static protected Produits Ch1 ; 
	static protected Produits Ch2; 
	static protected Produits Ch3 ; 
	static protected Produits Ch4;
	static protected Produits Ch5 ;
	static protected Produits Ch6 ;
	static protected Produits Ch7 ;
	static protected Produits Ch8 ; 
	
	
	
	public mainProjet()
	{
		
		
		ImageIcon i =new ImageIcon(this.getClass().getResource("recources/Svr1Pan.png"));
		
		// Produits pour le visage 
		Vis1 = new Produits("V1","DENSITIUM BI-SÉRUM 2X15ML NUTRITION INTENSE SVR",i,5,120,"VISAGE","SVR","= 2 formules distinctes pour une concentration record. Relâchement cutané, perte de densité, de volume, rides installées. Plus puissant qu'un simple sérum, une double formule pour une concentration record en actifs dermatologiques anti-âge.");
		Vis2 = new Produits ("V2","DENSITIUM CONTOUR DES YEUX SVR",new ImageIcon(this.getClass().getResource("recources/Svr2Pan.png")),5,70,"VISAGE","SVR","C'est un soin anti-âge complet du contour de l'œil : il lutte efficacement contre les rides, les cernes et les poches et agit sur le relâchement des paupières.\r\n"
				+ "Particulièrement adaptée à la peau fine du contour des yeux.\r\n"
				+ "Agréablement parfumée\r\n"
				+ "");
		
		Vis3 = new Produits ("V3","DENSITIUM CRÈME RICHE REDENSIFIANTE ULTRA NOURRISSANTE SVR",new ImageIcon(this.getClass().getResource("recources/Svr3Pan.png")),6,110,"VISAGE","SVR","Densitium Crème Riche est un tenseur qui renforce et redensifie la peau, réduit les marques de l'âge et nourrit intensément les peaux sèches à très sèches.");
		Vis4 = new Produits ("V4","AMPOULE A LIFT CONCENTRÉ LISSANT PEAU NORMALE À GRASSE SVR",new ImageIcon(this.getClass().getResource("recources/Svr4Pan.png")),5,96,"VISAGE","SVR","L'ampoule [A] 0.3% de SVR stimule efficacement le renouvellement cellulaire pour lisser la surface de la peau. Elle augmente la synthèse du collagène, d'acide hyaluronique et d'élastine. L'ampoule permet d'améliorer la qualité de la peau et d'estomper les signes de l'âge. Elle est parfaite pour les peaux normales à grasses mais aussi les peaux irrégulières, rugueuses, avec les pores dilatés, rides marquées ou encore manque de fermeté. Elle est formulée avec de la vitamine A et un pur concentré de Rétinol ");
		Vis5= new Produits ("V5","GEL NETTOYANT ANTI-ÂGE PEAU NORMALE À SÈCHE HERBÈOS",new ImageIcon(this.getClass().getResource("recources/Herbeos2Pan.png")),5,25,"VISAGE","HERBEOS","= Formulé à base d'un cocktail d'ingrédients naturels et précieux, ce soin est à la fois nettoyant, apaisant et liftant. Sa formule sans sulfate préserve le film hydro-lipidique naturel de la peau pour la nettoyer sans la desséché. Il convient à tous les types de peau, en particulier les peaux sèches et matures\r\n"
				+ "Le gel visage anti-âge de chez Herbéos est 100% naturel sans parabènes, sans parfum de synthèse et sans pétrochimie est enrichi à l'huile de pépins de figue de barbarie bio. L’huile de pépins de figue de barbarie, l’huile la plus riche en vitamine E et en oméga 6 et oméga 9 vient enrichir notre gel visage anti-âge avec ses vertus nourrissantes et hydratantes.\r\n"
				+ "");
		//Vis6= new Produits ("","",,"","","");
		//Vis7 new Produits ("","",,"","","");
		Vis8= new Produits ("V8","PHYSIOPURE EAU MICELLAIRE 200ML SVR",new ImageIcon(this.getClass().getResource("recources/Svr6Pan.png")),5,29.5,"VISAGE","SVR","Démaquille et nettoie en un seul geste. Élimine efficacement les impuretés pour une peau nette et oxygénée.");
		
		ListProd.add(Vis1);
		ListProd.add(Vis2);
		ListProd.add(Vis3);
		ListProd.add(Vis4);
		ListProd.add(Vis5);
		//ListProd.add(Vis6);
		//ListProd.add(Vis7);
		ListProd.add(Vis8);
		
		//Produits pour le corps 
				
		Cor1 = new Produits ("CO1","HUILE PRODIGIEUSE TOUTES PEAUX 100ML NUXE",new ImageIcon(this.getClass().getResource("recources/Nuxe1Pan.png")),5,75,"CORPS","NUXE","L'huile prodigieuse de NUXE, offre une hydratation longue durée du visage, du corps et des cheveux.\r\n"
				+ "Dotée d'une action anti-oxydante, d'un effet \"bouclier anti-pollution\", elle réduit également l'apparence des vergetures.\r\n"
				+ "Elle vous procure un vrai moment de plaisir grâce à sa texture et son parfum délicat.\r\n"
				+ "");
		Cor2 = new Produits ("CO2","HUILE PRODIGIEUSE FLORALE TOUTES PEAUX 50ML NUXE",new ImageIcon(this.getClass().getResource("recources/Nuxe2Pan.png")),4,48,"CORPS","NUXE","Des Retrouver la nouvelle déclinaison de la mythique Huile Prodigieuse de chez NUXE au nouveau parfum floral et délicat.\r\n"
				+ "Même avec une texture huile sèche, elle hydrate le corps, le visage et les cheveux.\r\n"
				+ "Votre allié au quotidien vous offre une action anti-oxydante, un effet \"bouclier\" anti-pollution et une réduction visible sur l'apparence des vergetures.\r\n"
				+ "Grâce aux notes florales et fraiches, la nouvelle signature olfactive inédite de chez Nuxe vous offre un nouveau moment de plaisir.\r\n"
				+ "");
		Cor3 = new Produits ("CO3","HUILE PRODIGIEUSE OR TOUTES PEAUX VAPORISATEUR 100ML NUXE",new ImageIcon(this.getClass().getResource("recources/Nuxe3Pan.png")),6,92.2,"CORPS","NUXE","= L'huile prodigieuse Or de NUXE, est une version pailletée de l'huile prodigieuse, elle nourrit, adoucit et illumine la peau et les cheveux.\r\n"
				+ "Sa texture est unique et son parfum envoûtant.\r\n"
				+ "");
		Cor4 = new Produits ("CO4","LAIT DE CORPS NUTRITION INTENSE HERBEOS",new ImageIcon(this.getClass().getResource("recources/HerbeosPan.png")),5,28,"CORPS","HERBEOS","Convient aux peaux très sèches\r\n"
				+ "Soulage des sensations de tiraillement et de démangeaison\r\n"
				+ "Hydrate intensément votre peau et l'apaise\r\n"
				+ "Ce lait de corps nutritif est un produit indispensable pour nourrir la peau en en profondeur et soulager les sensations de tiraillement et de démangeaison. Sa formule est très riche en actifs nourrissants (beurre de karité, beurre de cacao, huile d’amande douce et huile de pépins de figue de barbarie) ce qui permet d’avoir une peau douce, satinée et délicieusement parfumée.\r\n"
				+ "");
		Cor5 = new Produits ("CO5","CICALFATE MAINS CRÈME RÉPARATRICE AVENE",new ImageIcon(this.getClass().getResource("recources/AvenePan.png")),8,28,"CORPS","SVR","La crème mains Cicalfate répare et apaise les épidermes fragiles. \r\n"
				+ "Elle convient parfaitement aux peaux très sèches et irritées. \r\n"
				+ "Cette crème mains est très riche en Eau Thermale d'Avène. \r\n"
				+ "Sa formule combine du sucralfate, du sulfate de cuivre et de zinc pour réparer la peau et limiter la prolifération bactérienne\r\n"
				+ "");
		Cor6 = new Produits ("CO6","NOVOPHANE CRÈME DES ONGLES ACM",new ImageIcon(this.getClass().getResource("recources/AcmPan.png")),5,31,"CORPS","ACM","La crème des ongles Novophane hydrate et nourrit l'ongle en profondeur. Ses actifs puissants apportent souplesse et résistance à vos ongles. Elle s'applique facilement et pénètre rapidement, tout en laissant à la surface de l'ongle un film protecteur hydratant. Son petit format est pratique, pour l'emporter partout avec vous.");
		Cor7 = new Produits ("CO7","UREAREPAIR PLUS CRÈME MAINS EUCERIN",new ImageIcon(this.getClass().getResource("recources/EucerinPan.png")),5,20,"CORPS","EUCERIN","Prenez soin de vos mains au quotidien et préservez-les de la sécheresse en appliquant régulièrement Eucerin UreaRepair PLUS Crème Mains 5% d'Urée.\r\n"
				+ "Une crème mains réparatrice pour les peaux sèches à très sèches\r\n"
				+ "Le froid, la chaleur, les changements de températures, la toxicité de l’air, agressent continuellement votre peau, notamment vos mains, plus exposées que les autres parties du corps.\r\n"
				+ "");
		Cor8= new Produits ("CO8","ICTYANE LAIT HYDRATANT CORPS PEAUX NORMALES À SÈCHES DUCRAY",new ImageIcon(this.getClass().getResource("recources/IcytanePan.png")),5,46,"CORPS","DUCRAY","Le lait hydratant Ictyane de Ducray permet d'hydrater en profondeur les peaux normales à sèches. \r\n"
				+ "Il nourrit le corps afin de rendre la peau plus douce et plus souple. \r\n"
				+ "Ce lait pour le corps aide à prévenir le dessèchement cutanée et protège la peau de la déshydratation \r\n"
				+ "Sa formule combine un duo d'actifs Acéfylline et de l'huile d'Abyssinie pour permettre à la peau de s'hydrater seule. \r\n"
				+ "");
		
		
		ListProd.add(Cor1);
		ListProd.add(Cor2);
		ListProd.add(Cor3);
		ListProd.add(Cor4);
		ListProd.add(Cor5);
		ListProd.add(Cor6);
		ListProd.add(Cor7);
		ListProd.add(Cor8);
		
		
		//Produits pour les cheveux  
		
		Ch1 = new Produits ("C1","SHAMPOOING CAMOMILLE 200ML KLORANE",new ImageIcon(this.getClass().getResource("recources/KloranePan.png")),5,19.5,"CHEVEUX","KLORANE","Ce shampooing donne progressivement des reflets dorés très naturels tout en apportant brillance et luminosité aux cheveux.\r\n"
				+ "Il illumine donc les cheveux blonds pour un effet soleil jour après jour.\r\n"
				+ "Avec sa base émulsionnante très douce et son agent démêlant volumateur, il permet un usage quotidien par toute la famille et convient parfaitement aux enfants.\r\n"
				+ "");
		Ch2 = new Produits ("C2","H PURIN DRY SHAMPOING ANTI PELLICULAIRE CHEVEUX SECS",new ImageIcon(this.getClass().getResource("recources/Pharma1Pan.png")),7,26.5,"CHEVEUX","PHARMACERIS","Le shampooing Pharmaceris H-Purin Dry nettoie efficacement le cuir chevelu, il lave parfaitement les cheveux et leur redonne leur beauté naturelle.\r\n"
				+ "Réduit les démangeaisons et la desquamation\r\n"
				+ "Calme les irritations et les rougeurs du cuir chevelu grâce à la présence du D-Panthénol\r\n"
				+ "Traite les pellicules sèches et empêcher leur formation\r\n"
				+ "Régule l'exfoliation des cellules mortes\r\n"
				+ "Élimine les bactéries et les champignons grâce à la présence de la Piroctone Olamine\r\n"
				+ "Régénère les cellules capillaires et cutanées \r\n"
				+ "");
		Ch3 = new Produits ("C3","H PURIN OILY SHAMPOING ANTI PELLICULAIRE CHEVEUX GRAS PHARMACERIS",new ImageIcon(this.getClass().getResource("recources/Pharma2Pan.png")),5,26.5,"CHEVEUX","PHARMACERIS","Le shampooing Pharmaceris H-Purin Dry nettoie efficacement le cuir chevelu, il lave parfaitement les cheveux et leur redonne leur beauté naturelle.\r\n"
				+ "Réduit les démangeaisons et la desquamation\r\n"
				+ "Calme les irritations et les rougeurs du cuir chevelu grâce à la présence du Tea tree oil\r\n"
				+ "Traite les pellicules sèches et empêcher leur formation\r\n"
				+ "Régule l'exfoliation des cellules mortes\r\n"
				+ "Élimine les bactéries et les champignons grâce à la présence de la Manuka oilhas et du Thyme oil\r\n"
				+ "Régénère les cellules capillaires et cutanées\r\n"
				+ "");
		Ch4 = new Produits ("C4","FEMINA APRÈS SHAMPOING ANTI CHUTE BIOXSINE",new ImageIcon(this.getClass().getResource("recources/BioPan.png")),8,33,"CHEVEUX","BIOXSINE","Le shampoooing BIOXSINE FEMINA cheveux gras à base de plantes est spécialement formulé pour les femmes qui présentent une chute de cheveux ou souhaitant préserver la santé de leurs cheveux. Bioxsine femina pénétre et fortifie les follicules capilaires. Il se caractérise par une base végétale qui est controlée cliniquement sans effets secondaires et il ne contient aucun colorant. Il préserve l'équilibre nutritif et l'ydratation naturelle de la peau. Il posséde un pH respectueux du cuir chevelu et de la peau. Il protége la flore naturelle du cuir chevelu. Il est testé dermatologiquement");
		Ch5 = new Produits ("C5","\r\n"
				+ "H STIMULINUM SOIN STIMULANT POUSSE APRÈS SHAMPOING PHARMACERIS",new ImageIcon(this.getClass().getResource("recources/Pharma3Pan.png")),7,35,"CHEVEUX","PHARMACERIS","H-Stimulinum\r\n"
						+ "Soin Stimulant Pousse des cheveux");
		Ch6 = new Produits ("C6","PACK PROGRAMME ANTI CHUTE - STIMULANT POUSSE CHEVEUX",new ImageIcon(this.getClass().getResource("recources/Pharma4Pan.png")),6,97,"CHEVEUX","PHARMACERIS","Ce pack contient une routine complète composée de produits développés par la marque PHARMACERIS qui freinent la chute des cheveux dûe à des facteurs diverses et stimulent la repousse. Elle contient un shampoing, un après shampoing et une lotion à pulvériser sur les cheveux.");
		Ch7 = new Produits ("C7","SESKAVEL PLUS COMPLÉMENT CHEVEUX ET ONGLES SESDERMA",new ImageIcon(this.getClass().getResource("recources/SesdermaPan.png")),7,74,"CHEVEUX","SESDERMA","Complément alimentaire contenant des acides aminés soufrés, des vitamines et des minéraux.\r\n"
				+ "Recommandé pour le soin des cheveux fragiles et fins, et des ongles cassants. Périodes d'augmentation de la perte de cheveux (post-partum, variations saisonnières)\r\n"
				+ "");
		Ch8 = new Produits ("C8","HUILE PRODIGIEUSE TOUTES PEAUX 100ML NUXE",new ImageIcon(this.getClass().getResource("recources/Nuxe1Pan.png")),7,75,"CHEVEUX","NUXE","L'huile prodigieuse de NUXE, offre une hydratation longue durée du visage, du corps et des cheveux.\r\n"
				+ "Dotée d'une action anti-oxydante, d'un effet \"bouclier anti-pollution\", elle réduit également l'apparence des vergetures.\r\n"
				+ "Elle vous procure un vrai moment de plaisir grâce à sa texture et son parfum délicat.\r\n"
				+ "");
		ListProd.add(Ch1);
		ListProd.add(Ch2);
		ListProd.add(Ch3);
		ListProd.add(Ch4);
		ListProd.add(Ch5);
		ListProd.add(Ch6);
		ListProd.add(Ch7);
		ListProd.add(Ch8);
		
	
	
	}
	
	static public void AjoutDProd(Produits D)
	{
		ListProd.add(D);
	}
	public void AjoutDProdPan(Produits D)
	{
		ListProdPan.add(D);
	}

	
}
