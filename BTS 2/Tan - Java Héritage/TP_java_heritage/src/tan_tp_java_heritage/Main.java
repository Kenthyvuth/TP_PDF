package tan_tp_java_heritage;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        
        // Création d'une collection d'objet Ordinateurs
        ArrayList<Ordinateur> collectionOrdi = new ArrayList<Ordinateur>();
        
        // Portable
        Portable portable1 = new Portable("Acer Nitro 5 AN515-51-56UX","Intel Core i5-7300HQ",8,"Pas de disque dur","Windows",999,15.6f,2.7f,false,false);
        System.out.println("Mon pc portable: " + portable1.toString());
        collectionOrdi.add(portable1);        
      
        // Netbook
        Netbook netbook1 = new Netbook("HP EliteBook 840 G3","Intel Core i7-6600U",8,"Pas de disque dur","Windows",449,14,1.6f,false,false);
        System.out.println("Mon netbook: " + netbook1.toString());
        collectionOrdi.add(netbook1);
        
        // OrdiBureau
        OrdiBureau tour1 = new OrdiBureau("OMEN 30L GT13-0839nf","Intel Core™ i7-10700K",32,"SSD NVMe PCIe WD Black TLC M.2 1 To","Windows",4499,"NVIDIA GeForce RTX™ 3090","Intel Z490","Clavier non fourni");
        System.out.println("Mon pc de bureau: " + tour1.toString());
        collectionOrdi.add(tour1);
        
        // Ordinateur
        Ordinateur ordi1 = new Ordinateur("Asus ROG Strix GA35 GA35DX-FR192T","AMD Ryzen 9",64,"SSD libre","Windows",3999.99f);
        System.out.println("Mon ordinateur: " + ordi1.toString() + "\n");
        collectionOrdi.add(ordi1);
        
        // On liste l'ensemble des objets de notre collection
        System.out.println("Liste de tous les ordinateurs de la collection:");
        for(int i=0 ; i<collectionOrdi.size() ; i++) {
            System.out.println("\n" + collectionOrdi.get(i).toString());
            
        }
    }
    
}