package ro.mta.facc.selab;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
    private ArrayList<Carte> listaCarti;
    private ArrayList<Utilizator> users;

    public void sort()
    {
        Collections.sort(listaCarti);
    }

    public Biblioteca() {
        listaCarti = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void removeBook(Carte carte)
    {
        listaCarti.remove(carte);
    }

    public void addUser(Utilizator u){
        users.add(u);
    }

    public void addCarte(Carte c)
    {
        listaCarti.add(c);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Biblioteca contine:\n");

        for (Carte c : listaCarti)
        {
            builder.append(c.toString());
            builder.append("\n");
        }

        return builder.toString();
    }
}
