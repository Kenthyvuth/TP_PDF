package tan_tp_java_heritage;


public class OrdiBureau extends Ordinateur {
    
    //Attributs
    private String carteGraphique;
    private String chipset;
    private String clavier;
    
    public OrdiBureau(String ref, String proc, int ram, String disque, String sys, float prix, String cg, String chipset, String clavier) {
        super(ref, proc, ram, disque, sys, prix);
        this.carteGraphique = cg;
        this.chipset = chipset;
        this.clavier = clavier;
    }
    
    public String toString() {
        String infos = super.toString();
        infos = infos + " - " + this.carteGraphique + " - " + this.chipset + " - " + this.clavier;
        return infos;
    }
    
}
