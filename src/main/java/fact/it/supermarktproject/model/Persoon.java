package fact.it.supermarktproject.model;
//Brent Van de Staey r0793295

public class Persoon {
    private String voornaam;
    private String familienaam;
    private int geboortejaar;

    public Persoon(){}

    public Persoon(String voornaam, String familienaam){
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }
    public String getVoornaam(){ return voornaam; }
    public String getFamilienaam(){ return familienaam; }
    public int getGeboortejaar(){ return geboortejaar; }

    public void setVoornaam(String voornaam){ this.voornaam = voornaam; }
    public void setFamilienaam(String familienaam){ this.familienaam = familienaam; }
    public void setGeboortejaar(int geboortejaar){ this.geboortejaar = geboortejaar; }

    public String toString(){ return familienaam.toUpperCase() + ' ' + voornaam; }
}
