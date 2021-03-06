package fact.it.supermarktproject.model;

import java.util.ArrayList;

public class Supermarkt {
    private String naam;
    private int aantalKlanten;
    private ArrayList<Afdeling> afdelingen = new ArrayList<>();

    public Supermarkt(String naam){ this.naam = naam; }

    public void setNaam(String naam) { this.naam = naam; }

    public String getNaam() { return naam; }
    public ArrayList<Afdeling> getAfdelingen() { return afdelingen; }
    public int getAantalAfdelingen(){ return afdelingen.size(); }

    public void voegAfdelingToe(Afdeling afdeling){ afdelingen.add(afdeling); }

    public Afdeling zoekAfdelingOpNaam(String naam){
        for (Afdeling afdeling : afdelingen) {
            if (afdeling.toString().equals(naam)) {
                return afdeling;
            }
        }
        return null;
    }

    public void registreerKlant(Klant klant){
        aantalKlanten++;
        klant.setKlantenkaartnr(aantalKlanten);
    }
}
