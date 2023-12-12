import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double boy;
        int kilo;


        System.out.println("Kilonuzu Giriniz  : ");
        kilo = scanner.nextInt();
        System.out.println("Boyunuzu Giriniz (metre cinsinden) : ");
        boy = scanner.nextDouble();

        double KitleIndeksi = kilo / (boy * boy);
        
        System.out.println("Vücut Kitle Indeksiniz : " + KitleIndeksi);

        scanner.close();
    }
}
