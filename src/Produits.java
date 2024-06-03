import java.util.Vector;

import javax.swing.ImageIcon;

public class Produits{

        private String ID ;
        private String Libelle ;
        public ImageIcon ImagePanier;
        private int Quantite  ;
        private double Prix; 
        private String Categorie  ;
        private String Marque;
        private String Description ; 

        Produits(String i, String l, ImageIcon x, int qte , double  p , String cat ,String m, String d )
        {
            ID= i;
            Libelle = l ;
            ImagePanier =x;
            Quantite= qte;
            Prix =p ;
            Categorie = cat ;
            Marque = m ;
            Description = d ;
        }
        
        public String getLib()
        {
        	return Libelle;
        }
}