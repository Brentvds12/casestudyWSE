package fact.it.supermarktproject.model;
//Brent Van de Staey r0793295

import java.util.ArrayList;

public class Klant extends Persoon {
    private ArrayList<String> boodschappenlijst = new ArrayList<>();
    private int klantenkaartnr;

    public Klant(String voornaam, String familinaam){
        super(voornaam, familinaam);
        klantenkaartnr = -1;
    }

    public int getKlantenkaartnr() { return klantenkaartnr; }
    public ArrayList<String> getBoodschappenlijst() { return boodschappenlijst; }

    public void setKlantenkaartnr(int klantenkaartnr) { this.klantenkaartnr = klantenkaartnr; }

    public boolean voegToeAanBoodschappenlijst(String product){
        if(boodschappenlijst.size() < 5){
            boodschappenlijst.add(product);
            return true;
        }
        else return false;
    }

    public int getAantalOpBoodschappenlijst(){ return boodschappenlijst.size(); }

    public String toString(){ return "Klant " + super.toString() + " met klantenkaartnr " + klantenkaartnr; }
}
