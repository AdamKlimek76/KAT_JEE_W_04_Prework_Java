
public class Main13 {

    public static void main(String[] args) {
        int points=99;
            if (points<0) {
                System.out.print("Liczba punktow jest mniejsza niz 0");
            } else if (points>100) {
                System.out.print("Liczba punktow jest wieksza niz 100");
            } else if (points>=0 && points<=39) {
                System.out.print("Ocena niedostateczna");
            } else if (points>=40 && points<=54) {
                System.out.print("ocena dopuszczajaca");
            } else if (points>=55 && points<=69) {
                System.out.print("ocena dostateczna");
            } else if (points>=70 && points<=84) {
                System.out.print("ocena dobra");
            } else if (points>=85 && points<=98){
                System.out.print("ocena bardzo dobra");
            } else {
                System.out.print("ocena celujaca");
            }
    }

}
