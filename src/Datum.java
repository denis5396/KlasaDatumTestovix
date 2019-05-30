public class Datum implements Comparable<Datum>{
    private int dan, mjesec, godina;
    private boolean jesuLiDatumiJednaki(Datum d1, Datum d2){
        //kod
        return false; //ovo izbrisati pa svoje ubaciti
    }

    private Datum(){
        //ovdje nista ne upisivati,
        //konstruktor bez parametara je oznacen kao private
        // i služi da zabrani kreiranje "prazog" datuma naredbom :
        // Datum d = new Datum();
        // Za kreiranje objekata ce se samo koristiti konstruktor sa 3 parametra
        // koji se nalazi ispod!
    }

    public Datum(int dan, int mjesec, int godina) throws Exception{
        //kod
    }


    public void pomjeriZaJedanDanUnaprijed(){
        //kod
    }
    public void pomjeriZaJedanDanUnazad(){
        //kod
    }


    @Override
    public String toString(){
        //kod
        return ""; //ovo izbrisati pa svoje ubaciti
    }

    @Override
    public boolean equals(Object o){
        //ovu funkciju ne prepravljati!
        if(o == null) return false;
        else{
            Datum d = (Datum) o;
            return jesuLiDatumiJednaki(this, d);
        }
    }

    @Override
    public int compareTo(Datum d){
        //kod
        return 5; //ovo izbrisati pa svoje ubaciti
    }
}