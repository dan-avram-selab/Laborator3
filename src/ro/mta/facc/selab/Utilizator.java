package ro.mta.facc.selab;

import java.util.ArrayList;

public class Utilizator {
    String nume;
    String prenume;
    ArrayList<Carte> cartiImprumutate;

    public Utilizator(String nume) {
        this.nume = nume;
    }
}
