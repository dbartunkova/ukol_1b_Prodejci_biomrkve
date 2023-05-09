import java.time.LocalDate;

public class Main {
    public static void main(String args[]) {
        String jmenoPrijmeni = "Dana Bartunkova";
        LocalDate datumNarozeni = LocalDate.of(1990,3,16);
        int pocetSmluv = 3;
        double mnozstviMrkve = 50;
        String mesto = "Ostrov nad Oslavou";
        String SPZ = "5AV5643";
        double spotreba = 5.5;
        String IPadresa = "192.168.48.39";

        System.out.println("Průměrný počet prodaných mrkví na jednu smlouvu je " + mnozstviMrkve/pocetSmluv + " tun. ");

    }
}