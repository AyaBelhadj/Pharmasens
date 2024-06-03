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
		Vis1 = new Produits("V1","DENSITIUM BI-S�RUM 2X15ML NUTRITION INTENSE SVR",i,5,120,"VISAGE","SVR","= 2 formules distinctes pour une concentration record. Rel�chement cutan�, perte de densit�, de volume, rides install�es. Plus puissant qu'un simple s�rum, une double formule pour une concentration record en actifs dermatologiques anti-�ge.");
		Vis2 = new Produits ("V2","DENSITIUM CONTOUR DES YEUX SVR",new ImageIcon(this.getClass().getResource("recources/Svr2Pan.png")),5,70,"VISAGE","SVR","C'est un soin anti-�ge complet du contour de l'�il : il lutte efficacement contre les rides, les cernes et les poches et agit sur le rel�chement des paupi�res.\r\n"
				+ "Particuli�rement adapt�e � la peau fine du contour des yeux.\r\n"
				+ "Agr�ablement parfum�e\r\n"
				+ "");
		
		Vis3 = new Produits ("V3","DENSITIUM CR�ME RICHE REDENSIFIANTE ULTRA NOURRISSANTE SVR",new ImageIcon(this.getClass().getResource("recources/Svr3Pan.png")),6,110,"VISAGE","SVR","Densitium Cr�me Riche est un tenseur qui renforce et redensifie la peau, r�duit les marques de l'�ge et nourrit intens�ment les peaux s�ches � tr�s s�ches.");
		Vis4 = new Produits ("V4","AMPOULE A LIFT CONCENTR� LISSANT PEAU NORMALE � GRASSE SVR",new ImageIcon(this.getClass().getResource("recources/Svr4Pan.png")),5,96,"VISAGE","SVR","L'ampoule [A] 0.3% de SVR stimule efficacement le renouvellement cellulaire pour lisser la surface de la peau. Elle augmente la synth�se du collag�ne, d'acide hyaluronique et d'�lastine. L'ampoule permet d'am�liorer la qualit� de la peau et d'estomper les signes de l'�ge. Elle est parfaite pour les peaux normales � grasses mais aussi les peaux irr�guli�res, rugueuses, avec les pores dilat�s, rides marqu�es ou encore manque de fermet�. Elle est formul�e avec de la vitamine A et un pur concentr� de R�tinol ");
		Vis5= new Produits ("V5","GEL NETTOYANT ANTI-�GE PEAU NORMALE � S�CHE HERB�OS",new ImageIcon(this.getClass().getResource("recources/Herbeos2Pan.png")),5,25,"VISAGE","HERBEOS","= Formul� � base d'un cocktail d'ingr�dients naturels et pr�cieux, ce soin est � la fois nettoyant, apaisant et liftant. Sa formule sans sulfate pr�serve le film hydro-lipidique naturel de la peau pour la nettoyer sans la dess�ch�. Il convient � tous les types de peau, en particulier les peaux s�ches et matures\r\n"
				+ "Le gel visage anti-�ge de chez Herb�os est 100% naturel sans parab�nes, sans parfum de synth�se et sans p�trochimie est enrichi � l'huile de p�pins de figue de barbarie bio. L�huile de p�pins de figue de barbarie, l�huile la plus riche en vitamine E et en om�ga 6 et om�ga 9 vient enrichir notre gel visage anti-�ge avec ses vertus nourrissantes et hydratantes.\r\n"
				+ "");
		//Vis6= new Produits ("","",,"","","");
		//Vis7 new Produits ("","",,"","","");
		Vis8= new Produits ("V8","PHYSIOPURE EAU MICELLAIRE 200ML SVR",new ImageIcon(this.getClass().getResource("recources/Svr6Pan.png")),5,29.5,"VISAGE","SVR","D�maquille et nettoie en un seul geste. �limine efficacement les impuret�s pour une peau nette et oxyg�n�e.");
		
		ListProd.add(Vis1);
		ListProd.add(Vis2);
		ListProd.add(Vis3);
		ListProd.add(Vis4);
		ListProd.add(Vis5);
		//ListProd.add(Vis6);
		//ListProd.add(Vis7);
		ListProd.add(Vis8);
		
		//Produits pour le corps 
				
		Cor1 = new Produits ("CO1","HUILE PRODIGIEUSE TOUTES PEAUX 100ML NUXE",new ImageIcon(this.getClass().getResource("recources/Nuxe1Pan.png")),5,75,"CORPS","NUXE","L'huile prodigieuse de NUXE, offre une hydratation longue dur�e du visage, du corps et des cheveux.\r\n"
				+ "Dot�e d'une action anti-oxydante, d'un effet \"bouclier anti-pollution\", elle r�duit �galement l'apparence des vergetures.\r\n"
				+ "Elle vous procure un vrai moment de plaisir gr�ce � sa texture et son parfum d�licat.\r\n"
				+ "");
		Cor2 = new Produits ("CO2","HUILE PRODIGIEUSE FLORALE TOUTES PEAUX 50ML NUXE",new ImageIcon(this.getClass().getResource("recources/Nuxe2Pan.png")),4,48,"CORPS","NUXE","Des Retrouver la nouvelle d�clinaison de la mythique Huile Prodigieuse de chez NUXE au nouveau parfum floral et d�licat.\r\n"
				+ "M�me avec une texture huile s�che, elle hydrate le corps, le visage et les cheveux.\r\n"
				+ "Votre alli� au quotidien vous offre une action anti-oxydante, un effet \"bouclier\" anti-pollution et une r�duction visible sur l'apparence des vergetures.\r\n"
				+ "Gr�ce aux notes florales et fraiches, la nouvelle signature olfactive in�dite de chez Nuxe vous offre un nouveau moment de plaisir.\r\n"
				+ "");
		Cor3 = new Produits ("CO3","HUILE PRODIGIEUSE OR TOUTES PEAUX VAPORISATEUR 100ML NUXE",new ImageIcon(this.getClass().getResource("recources/Nuxe3Pan.png")),6,92.2,"CORPS","NUXE","= L'huile prodigieuse Or de NUXE, est une version paillet�e de l'huile prodigieuse, elle nourrit, adoucit et illumine la peau et les cheveux.\r\n"
				+ "Sa texture est unique et son parfum envo�tant.\r\n"
				+ "");
		Cor4 = new Produits ("CO4","LAIT DE CORPS NUTRITION INTENSE HERBEOS",new ImageIcon(this.getClass().getResource("recources/HerbeosPan.png")),5,28,"CORPS","HERBEOS","Convient aux peaux tr�s s�ches\r\n"
				+ "Soulage des sensations de tiraillement et de d�mangeaison\r\n"
				+ "Hydrate intens�ment votre peau et l'apaise\r\n"
				+ "Ce lait de corps nutritif est un produit indispensable pour nourrir la peau en en profondeur et soulager les sensations de tiraillement et de d�mangeaison. Sa formule est tr�s riche en actifs nourrissants (beurre de karit�, beurre de cacao, huile d�amande douce et huile de p�pins de figue de barbarie) ce qui permet d�avoir une peau douce, satin�e et d�licieusement parfum�e.\r\n"
				+ "");
		Cor5 = new Produits ("CO5","CICALFATE MAINS CR�ME R�PARATRICE AVENE",new ImageIcon(this.getClass().getResource("recources/AvenePan.png")),8,28,"CORPS","SVR","La cr�me mains Cicalfate r�pare et apaise les �pidermes fragiles. \r\n"
				+ "Elle convient parfaitement aux peaux tr�s s�ches et irrit�es. \r\n"
				+ "Cette cr�me mains est tr�s riche en Eau Thermale d'Av�ne. \r\n"
				+ "Sa formule combine du sucralfate, du sulfate de cuivre et de zinc pour r�parer la peau et limiter la prolif�ration bact�rienne\r\n"
				+ "");
		Cor6 = new Produits ("CO6","NOVOPHANE CR�ME DES ONGLES ACM",new ImageIcon(this.getClass().getResource("recources/AcmPan.png")),5,31,"CORPS","ACM","La cr�me des ongles Novophane hydrate et nourrit l'ongle en profondeur. Ses actifs puissants apportent souplesse et r�sistance � vos ongles. Elle s'applique facilement et p�n�tre rapidement, tout en laissant � la surface de l'ongle un film protecteur hydratant. Son petit format est pratique, pour l'emporter partout avec vous.");
		Cor7 = new Produits ("CO7","UREAREPAIR PLUS CR�ME MAINS EUCERIN",new ImageIcon(this.getClass().getResource("recources/EucerinPan.png")),5,20,"CORPS","EUCERIN","Prenez soin de vos mains au quotidien et pr�servez-les de la s�cheresse en appliquant r�guli�rement Eucerin UreaRepair PLUS Cr�me Mains 5% d'Ur�e.\r\n"
				+ "Une cr�me mains r�paratrice pour les peaux s�ches � tr�s s�ches\r\n"
				+ "Le froid, la chaleur, les changements de temp�ratures, la toxicit� de l�air, agressent continuellement votre peau, notamment vos mains, plus expos�es que les autres parties du corps.\r\n"
				+ "");
		Cor8= new Produits ("CO8","ICTYANE LAIT HYDRATANT CORPS PEAUX NORMALES � S�CHES DUCRAY",new ImageIcon(this.getClass().getResource("recources/IcytanePan.png")),5,46,"CORPS","DUCRAY","Le lait hydratant Ictyane de Ducray permet d'hydrater en profondeur les peaux normales � s�ches. \r\n"
				+ "Il nourrit le corps afin de rendre la peau plus douce et plus souple. \r\n"
				+ "Ce lait pour le corps aide � pr�venir le dess�chement cutan�e et prot�ge la peau de la d�shydratation \r\n"
				+ "Sa formule combine un duo d'actifs Ac�fylline et de l'huile d'Abyssinie pour permettre � la peau de s'hydrater seule. \r\n"
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
		
		Ch1 = new Produits ("C1","SHAMPOOING CAMOMILLE 200ML KLORANE",new ImageIcon(this.getClass().getResource("recources/KloranePan.png")),5,19.5,"CHEVEUX","KLORANE","Ce shampooing donne progressivement des reflets dor�s tr�s naturels tout en apportant brillance et luminosit� aux cheveux.\r\n"
				+ "Il illumine donc les cheveux blonds pour un effet soleil jour apr�s jour.\r\n"
				+ "Avec sa base �mulsionnante tr�s douce et son agent d�m�lant volumateur, il permet un usage quotidien par toute la famille et convient parfaitement aux enfants.\r\n"
				+ "");
		Ch2 = new Produits ("C2","H PURIN DRY SHAMPOING ANTI PELLICULAIRE CHEVEUX SECS",new ImageIcon(this.getClass().getResource("recources/Pharma1Pan.png")),7,26.5,"CHEVEUX","PHARMACERIS","Le shampooing Pharmaceris H-Purin Dry nettoie efficacement le cuir chevelu, il lave parfaitement les cheveux et leur redonne leur beaut� naturelle.\r\n"
				+ "R�duit les d�mangeaisons et la desquamation\r\n"
				+ "Calme les irritations et les rougeurs du cuir chevelu gr�ce � la pr�sence du D-Panth�nol\r\n"
				+ "Traite les pellicules s�ches et emp�cher leur formation\r\n"
				+ "R�gule l'exfoliation des cellules mortes\r\n"
				+ "�limine les bact�ries et les champignons gr�ce � la pr�sence de la Piroctone Olamine\r\n"
				+ "R�g�n�re les cellules capillaires et cutan�es \r\n"
				+ "");
		Ch3 = new Produits ("C3","H PURIN OILY SHAMPOING ANTI PELLICULAIRE CHEVEUX GRAS PHARMACERIS",new ImageIcon(this.getClass().getResource("recources/Pharma2Pan.png")),5,26.5,"CHEVEUX","PHARMACERIS","Le shampooing Pharmaceris H-Purin Dry nettoie efficacement le cuir chevelu, il lave parfaitement les cheveux et leur redonne leur beaut� naturelle.\r\n"
				+ "R�duit les d�mangeaisons et la desquamation\r\n"
				+ "Calme les irritations et les rougeurs du cuir chevelu gr�ce � la pr�sence du Tea tree oil\r\n"
				+ "Traite les pellicules s�ches et emp�cher leur formation\r\n"
				+ "R�gule l'exfoliation des cellules mortes\r\n"
				+ "�limine les bact�ries et les champignons gr�ce � la pr�sence de la Manuka oilhas et du Thyme oil\r\n"
				+ "R�g�n�re les cellules capillaires et cutan�es\r\n"
				+ "");
		Ch4 = new Produits ("C4","FEMINA APR�S SHAMPOING ANTI CHUTE BIOXSINE",new ImageIcon(this.getClass().getResource("recources/BioPan.png")),8,33,"CHEVEUX","BIOXSINE","Le shampoooing BIOXSINE FEMINA cheveux gras � base de plantes est sp�cialement formul� pour les femmes qui pr�sentent une chute de cheveux ou souhaitant pr�server la sant� de leurs cheveux. Bioxsine femina p�n�tre et fortifie les follicules capilaires. Il se caract�rise par une base v�g�tale qui est control�e cliniquement sans effets secondaires et il ne contient aucun colorant. Il pr�serve l'�quilibre nutritif et l'ydratation naturelle de la peau. Il poss�de un pH respectueux du cuir chevelu et de la peau. Il prot�ge la flore naturelle du cuir chevelu. Il est test� dermatologiquement");
		Ch5 = new Produits ("C5","\r\n"
				+ "H STIMULINUM SOIN STIMULANT POUSSE APR�S SHAMPOING PHARMACERIS",new ImageIcon(this.getClass().getResource("recources/Pharma3Pan.png")),7,35,"CHEVEUX","PHARMACERIS","H-Stimulinum\r\n"
						+ "Soin Stimulant Pousse des cheveux");
		Ch6 = new Produits ("C6","PACK PROGRAMME ANTI CHUTE - STIMULANT POUSSE CHEVEUX",new ImageIcon(this.getClass().getResource("recources/Pharma4Pan.png")),6,97,"CHEVEUX","PHARMACERIS","Ce pack contient une routine compl�te compos�e de produits d�velopp�s par la marque PHARMACERIS qui freinent la chute des cheveux d�e � des facteurs diverses et stimulent la repousse. Elle contient un shampoing, un apr�s shampoing et une lotion � pulv�riser sur les cheveux.");
		Ch7 = new Produits ("C7","SESKAVEL PLUS COMPL�MENT CHEVEUX ET ONGLES SESDERMA",new ImageIcon(this.getClass().getResource("recources/SesdermaPan.png")),7,74,"CHEVEUX","SESDERMA","Compl�ment alimentaire contenant des acides amin�s soufr�s, des vitamines et des min�raux.\r\n"
				+ "Recommand� pour le soin des cheveux fragiles et fins, et des ongles cassants. P�riodes d'augmentation de la perte de cheveux (post-partum, variations saisonni�res)\r\n"
				+ "");
		Ch8 = new Produits ("C8","HUILE PRODIGIEUSE TOUTES PEAUX 100ML NUXE",new ImageIcon(this.getClass().getResource("recources/Nuxe1Pan.png")),7,75,"CHEVEUX","NUXE","L'huile prodigieuse de NUXE, offre une hydratation longue dur�e du visage, du corps et des cheveux.\r\n"
				+ "Dot�e d'une action anti-oxydante, d'un effet \"bouclier anti-pollution\", elle r�duit �galement l'apparence des vergetures.\r\n"
				+ "Elle vous procure un vrai moment de plaisir gr�ce � sa texture et son parfum d�licat.\r\n"
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
