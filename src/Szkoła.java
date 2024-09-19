import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;

public class Szkoła<nazwa, klasa> {
    private static Szkoła szkoła = new Szkoła();
    private  String nazwaSzkoły;
    private ArrayList<Uczen> ucznoweie = new ArrayList<>();
    private ArrayList<Klasa> Klasza= new ArrayList<>();

    private Szkoła(String nazwaSzkoły) {
        //konstruktor jest dostepny tylko w tej klasie
        this.nazwaSzkoły = nazwaSzkoły;
    }

    public Szkoła() {

    }

    public static Szkoła getSzkoła(){
     return szkoła;
    }

    public void dodajuczniadoSzkoly(String imie,String nazwisko, int wiek) {
        Uczen uczen = new Uczen(imie,nazwisko);
        ucznoweie.add(uczen);
    }

    public void dodajklaszedoszkoły(Klasa,klasa){
        Object klasa = new Object();
        UnicodeSet klasy = null;
        klasy.add(klasa.toString());
    }

}
