import java.util.Scanner;


public class boy {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double boy, kilo, endeks;
        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz:  ");
        boy = inp.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz:  ");
        kilo    = inp.nextDouble();
        endeks = kilo/(boy*boy);
        System.out.print("Vücut Kitle Endeksiniz:" + endeks);
    }

}
