
import java.util.Scanner;

public class test {
    /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran
         programı yazın.
        Meyveler ve KG Fiyatları
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
     */
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double Armut=2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlican=5;
        int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        double sonuc=0;

        System.out.print("Armut kac kilo?");
        armutKg=inp.nextInt();
        System.out.print("Elma kac kilo?");
        elmaKg=inp.nextInt();
        System.out.print("Domates kac kilo?");
        domatesKg=inp.nextInt();
        System.out.print("Muz kac kilo?");
        muzKg=inp.nextInt();
        System.out.print("Patlıcan kac kilo?");
        patlicanKg=inp.nextInt();

        if (armutKg>0)
            sonuc+=(Armut*armutKg);
        if (elmaKg>0)
            sonuc+=(Elma*elmaKg);
        if (domatesKg>0)
            sonuc+=(Domates*domatesKg);
        if (muzKg>0)
            sonuc+=(Muz*muzKg);
        if (patlicanKg>0)
            sonuc+=(Patlican*patlicanKg);

        System.out.println("Toplam Tutar: "+sonuc);
    }
}
