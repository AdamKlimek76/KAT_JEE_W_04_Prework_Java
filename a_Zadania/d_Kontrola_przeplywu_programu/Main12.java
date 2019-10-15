
public class Main12 {

    public static void main(String[] args) {
       // a, b, c długości boków trójkąta
        int a=6;
        int b=8;
        int c=12;
        if ((a+b>c)&&(a+c>b)&&(b+c>a)){
            System.out.print("Z bokow a, b, c o dlugosciach odpowiednio " + a + ", " + b + ", " + c + " mozna zbudowac trojkat.");
        } else {
            System.out.print("Z bokow a, b, c o dlugosciach odpowiednio " + a + ", " + b + ", " + c + " nie mozna zbudowac trojkata.");
        }
    }
}
