import java.util.Scanner;

public class test {
    /*
    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının
    "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
    Kilo (kg) / Boy(m) * Boy(m)
    */
    public static void main(String[] args) {

        // Değişkenler
        int weight;
        double size;

        // Kullanıcıdan verileri al
        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz : ");
        weight = input.nextInt();

        System.out.print("\nBoyunuzu (metre cinsinde) giriniz: ");
        size = input.nextDouble();

        // Hesaplamayı yap ve sonucu yazdır
        System.out.print("\nVücut kitle endeksiniz: " + (weight / size * size));
    }
}
