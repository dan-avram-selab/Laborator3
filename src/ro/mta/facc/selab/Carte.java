package ro.mta.facc.selab;

public class Carte implements Comparable<Carte> {
    private String titlu;
    private String autor;
    private int nrPagini;

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    @Override
    public int compareTo(Carte o) {
        if (this.nrPagini < o.nrPagini)
            return -1;
        if (this.nrPagini > o.nrPagini)
            return 1;
        return 0;

    }

    public Carte(String titlu, String autor, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.nrPagini = nrPagini;
    }

    @Override
    public String toString() {
        return this.titlu + " scrisa de " + this.autor;
    }
}
