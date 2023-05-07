package NotOrtalamasiHesapla;

import java.util.Scanner;

public class NotHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Matematik ders notunu giriniz");
        double matNotu = input.nextDouble();
        System.out.println("Lütfen Fizik ders notunu giriniz");
        double fizikNotu = input.nextDouble();
        System.out.println("Lütfen Kimya ders notunu giriniz");
        double kimyaNotu = input.nextDouble();
        System.out.println("Lütfen Türkçe ders notunu giriniz");
        double turkceNotu = input.nextDouble();
        System.out.println("Lütfen Tarih ders notunu giriniz");
        double tarihNotu = input.nextDouble();
        System.out.println("Lütfen Müzik ders notunu giriniz");
        double muzikNotu = input.nextDouble();
        double ortalama = (matNotu+fizikNotu+kimyaNotu+turkceNotu+tarihNotu+muzikNotu)/6;
        System.out.println("Derslerin ortalaması: "+ortalama);
        String sonuc = (ortalama>= 60) ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(sonuc);
    }
}
