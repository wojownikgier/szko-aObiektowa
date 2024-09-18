public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Osoba OsobaJas = new Osoba("Jaś" ,"fałdek","7");

        System.out.println(OsobaJas.getImie());
        System.out.println(OsobaJas.getNazwisko());
        System.out.println(OsobaJas.getWiek());

        OsobaJas.setImie("marius");
        System.out.println(OsobaJas.getImie());
    }
}