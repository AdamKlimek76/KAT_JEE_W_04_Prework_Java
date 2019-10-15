
public class Main16 {

    public static void main(String[] args) {
        int pierwszaLiczba=420;
        int drugaLiczba=288;
        int a=pierwszaLiczba;
        int b=drugaLiczba;
        if (a < 1 || b < 1) {
            System.out.print ("Pierwsza lub druga liczba jest mniejsza niz 1");
        }

        while (b != 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        System.out.print("dla liczb " + pierwszaLiczba + " i " + drugaLiczba  + " GDC: to " + a);
    }
}
