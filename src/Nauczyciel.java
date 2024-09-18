public sealed class Nauczyciel extends Osoba implements dyzurny permits Wychowawca {
    private String przedmiot;

    public Nauczyciel(String imie, String nazwisko, int wiek, String przedmiot) {
        super(imie, nazwisko, wiek);
        this.przedmiot = przedmiot;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "przedmiot='" + przedmiot + '\'' +
                '}';
    }

    @Override
    public void wyjonajdyzur() {
        System.out.println("dyzur wpierdolu ucznion");
    }
}
