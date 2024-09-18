public class Uczen extends Osoba{
    //poniewaz uczen ma te same wlasnosci co Osoba to będzie klasą potomną klasy Osoba
    //klasa Osoba będzie klasą bazową

    private int nr_ewidencyjny;
    static  int liczbaObiektow;

    public Uczen(String imie, String nazwisko, int wiek, int nr_ewidencyjny) {
        super(imie, nazwisko, wiek);
        //wywołanie konstruktora klasy bazowej
        this.nr_ewidencyjny = nr_ewidencyjny;
        liczbaObiektow++;
    }

    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        liczbaObiektow++;
        nr_ewidencyjny = liczbaObiektow;
    }

    Osoba text = new Osoba();

    @Override
    public String toString() {
        return "Uczen{" +
                "imie " + getImie() + "nazwisko " +getNazwisko() +
                "nr_ewidencyjny " + nr_ewidencyjny +
                '}';
    }
}