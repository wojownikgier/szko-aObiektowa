import java.util.ArrayList;

public class klasa {
    private String nazwaklasy;
    private ArrayList<Uczen> uczniowe;
    private Wychowawca wychowawca;

    public klasa(String nazwaklasy){
        this.nazwaklasy = nazwaklasy;
        uczniowe = new ArrayList<>();
    }

    public  klasa(String nazwaklasy , Wychowawca wychowawca ) {
        this.nazwaklasy = nazwaklasy;
        this.wychowawca = wychowawca;
        uczniowe = new ArrayList<>();
    }

    public void dodajuczniaklasy(Uczen uczen) {
        if (uczniowe.contains(uczen)){
            System.out.println(uczen+"jest w tej klasie");
        }else {
            uczniowe.add(uczen);
        }
    }




    @Override
    public String toString() {
        return "klasa{" +
                "nazwaklasy='" + nazwaklasy + '\'' +
                ", wychowawca=" + wychowawca +
                ", uczniowe=" + uczniowe +
                '}';
    }

}

