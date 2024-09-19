public class Main {
    public static void main(String[] args) {

        Osoba osobaJas = new Osoba("Jaś","Śliweczka",10);
//wywołuję konstruktor klasy Osoba
        System.out.println(osobaJas.getImie());
        System.out.println(osobaJas.getNazwisko());
        osobaJas.setImie("Jan");

        Osoba osobaAla = new Osoba("Ala", "Fala");
        System.out.println(osobaJas.getWiek());
        System.out.println(osobaAla.getWiek());
        String imie = new String();
        String nazwisko = null;
        int wiek = 0;
        Osoba osobaX = new Osoba(imie, nazwisko, wiek);

        System.out.println(osobaJas);
        System.out.println("Liczba Uczniow"+Uczen.liczbaObiektow);
        Uczen uczen = new Uczen("Daniel","Nowy");
        System.out.println("Liczba Uczniow"+Uczen.liczbaObiektow);
        Uczen uczen2 = new Uczen("Daniela","Nowa");
        System.out.println("Liczba Uczniow"+Uczen.liczbaObiektow);
        Uczen uczen3 = new Uczen("Danielo","Stary");
        System.out.println(uczen3);
        System.out.println("Liczba Uczniow"+Uczen.liczbaObiektow);



        Nauczyciel nauczycielslowik = new Nauczyciel("marek","slowik","25","matematyka");
        System.out.println(nauczycielslowik);

        nauczycielslowik.wyjonajdyzur();;
        uczen.wyjonajdyzur();

        Klasa klasa = new Klasa("3a-programista", (Wychowawca) nauczycielslowik);

        Szkoła zs10 = Szkoła.getSzkoła();
    }
}