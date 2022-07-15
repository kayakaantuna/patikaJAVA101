import java.util.*;

public class main {
    public static void main(String[] args)
    {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mat notunuz: ");
        mat = scanner.nextInt();
        System.out.println("Fizik notunuz: ");
        fizik = scanner.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya = scanner.nextInt();
        System.out.println("Turkce notunuz: ");
        turkce = scanner.nextInt();
        System.out.println("Tarih notunuz: ");
        tarih = scanner.nextInt();
        System.out.println("Muzik notunuz: ");
        muzik = scanner.nextInt();

        double sonuc = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("Ortalama: " + sonuc);

        String gectiKaldi = sonuc > 60 ? "Sinifi Gecti" : "Sinifta Kaldi";

        System.out.println(gectiKaldi);
    }
}
