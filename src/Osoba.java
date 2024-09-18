import java.util.Scanner;

public class Osoba {
private String imie;
private String nazwisko;
private String wiek;
// prywatnosci własnosci sa nie dostenpne w innych klaszach
    //konstruktor to metoda wywołania w momencie tworzenia osoby

    public Osoba(String imie, String nazwisko, String wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        //wypisywanie hasła z klawiatury
        return imie;
    }

    public void setImie(String imie) {
        Scanner klawiatura = new Scanner(System.in);
        String haslo = klawiatura.next();

        //jezeli hasło qwe123 to zmnien w
        this.imie = imie;
        if (haslo.equals("qwe123")){
            this.imie =imie;
        }else {
            System.out.println("nie masz prawo zmieniać");
        }

    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getWiek() {
        return wiek;
    }

    public void setWiek(String wiek) {
        this.wiek = wiek;
    }

}
