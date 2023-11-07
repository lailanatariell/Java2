package methodCreation;

public class MethodCreation {
    public static void main(String[] args) {

        //ornek 1 calistirma

        int sonuc1 = carpma(3,5);
        System.out.println("sonuc1 = " + sonuc1); //sonuc1 = 15

        //ornek 2 calistirma

        int sonuc2 = carpTopla(4,4,2);
        System.out.println("sonuc2 = " + sonuc2); //sonuc2 = 18

        //ornek 3 calistirma
        yaz("Ali Can");

    } //main disi

    //ornek 1: 2 sayiyi carpan bir method olusturunuz
    //protected bu class'tan erisilebilir, bir de sadece miras alinan class'lardan erisilebilir
    static int carpma(int a, int b){
        return a * b;
    }

    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz
    private static int carpTopla(int a, int b, int c){
        //private : Bu erisim belirleyici, bu elemanlara yalnizca ayni class icersinden erisilmesine izin verir
        return a * b + c;
    }

    //Odev : //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void)
    public static void yaz(String str) {
        //Eger method yeni data uretmiyor ise return type'i void olur
        //body icine return yazilmaz
        //Not: Method parantezi icine yazilanlara parametre,
        //main icinde yapilan "method call" da kullanilan degerlere (carpma(3,5)) arguman denir
        System.out.println(str); //Ali Can
    }

    }
