package tan_tp_java_heritage;


public class Netbook extends Ordinateur {
    
    //Attributs
    private float taille; // Taille en pouce
    private float poids; // En kilogrammes
    private boolean webcam;
    private boolean lecteurCarteMemoire;
    
    public Netbook(String ref, String proc, int ram, String disque, String sys, float prix, float taille, float poids, boolean webcam, boolean carteMemoire) {
        super(ref, proc, ram, disque, sys, prix);
        this.taille = taille;
        this.poids = poids;
        this.webcam = webcam;
        this.lecteurCarteMemoire = carteMemoire;
    }
    
    public String toString() {
        String infos = super.toString();
        infos = infos + " - " + this.taille + "'' - " + this.poids + "kg - " + this.webcam + " - " + this.lecteurCarteMemoire;
        return infos;
    }
    
}
