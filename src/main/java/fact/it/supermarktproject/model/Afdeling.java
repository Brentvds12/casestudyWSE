package fact.it.supermarktproject.model;

public class Afdeling {
    private String naam;
    private String foto;
    private boolean gekoeld;
    private Personeelslid verantwoordelijke;

    public Afdeling(){}
    public Afdeling(String naam){ this.naam = naam; }

    public String getNaam() { return naam; }
    public String getFoto() { return foto; }
    public Personeelslid getVerantwoordelijke() { return verantwoordelijke; }
    public boolean isGekoeld(){ return gekoeld; }

    public void setNaam(String naam) { this.naam = naam; }
    public void setFoto(String foto) { this.foto = foto; }
    public void setVerantwoordelijke(Personeelslid verantwoordelijke) { this.verantwoordelijke = verantwoordelijke; }
    public void setGekoeld(boolean gekoeld) { this.gekoeld = gekoeld; }
}
