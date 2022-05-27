    import java.util.Scanner;
    public class test {
    public static void main(String[] args) {
    /* Dairenin Alanını ve Çevresini Hesaplayan Program
    Alan Formülü : π * r * r;
    Çevre Formülü : 2 * π * r  */


        int r;
        double pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir deger girin:");
        r= input.nextInt();

        System.out.println("yari cap: "+r);


        double alan = pi*r*r;
        System.out.println("dairenin alani : "+ alan);

        double cevre = 2*pi*r;
        System.out.println("dairenin cevresi : "+ cevre);

    }
}


