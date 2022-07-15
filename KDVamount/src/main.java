import java.util.*;

public class main {
    public static void main(String[] args)
    {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucret tutarini giriniz: ");
        tutar = scanner.nextDouble();
        kdvOran = (tutar < 1000) && (tutar > 0) ? 0.18 : 0.8;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Orani: " + kdvOran);
        System.out.println("KDV Tutari: " + kdvTutar);
        System.out.println("KDV'li Tutari: " + kdvliTutar);
    }
}
