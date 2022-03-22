package tan_tp_java_heritage;

import java.util.ArrayList;

public class Ordinateur {
    
    //Attributs
    private String reference;
    private String processeur;
    private int ram;
    private String disqueDur;
    private String sysExploit;
    private double prix;
    protected ArrayList<Ordinateur> collection = new ArrayList<Ordinateur>();
    
    public Ordinateur(String ref, String proc, int ram, String disque, String sys, float prix) {
        this.reference = ref;
        this.processeur = proc;
        this.ram = ram;
        this.disqueDur = disque;
        this.sysExploit = sys;
        this.prix = prix;
    }
    
    public String toString() {
        return this.reference + " - " + this.processeur + " - " + this.ram + "Go RAM - " + this.disqueDur + " - " + this.sysExploit + " - " + this.prix + "€";
    }
    
}
