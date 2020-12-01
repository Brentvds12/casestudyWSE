package fact.it.supermarktproject.model;
//Brent Van de Staey r0793295

import java.time.LocalDate;

public class Personeelslid extends Persoon {

    private LocalDate inDienstSinds;

    public Personeelslid(String voornaam, String familienaam){
        super(voornaam, familienaam);
        this.inDienstSinds = LocalDate.now();
    }

    public LocalDate getInDienstSinds() { return inDienstSinds; }
    public void setInDienstSinds(LocalDate inDienstSinds) { this.inDienstSinds = inDienstSinds; }

    public String toString(){ return "Personeelslid " + super.toString() + " is in dienst sinds " + inDienstSinds; }
}
