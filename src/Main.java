public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Osoba OsobaJas = new Osoba("Jaś" ,"fałdek","7");
        //niezgodne z zasadna hermetyzacji
        System.out.println(OsobaJas.imie);
        System.out.println(OsobaJas.nazwisko);
        System.out.println(OsobaJas.wiek);
        //powino byt tak ze program nie mógł zmienic wałasnosci klas
    }

}