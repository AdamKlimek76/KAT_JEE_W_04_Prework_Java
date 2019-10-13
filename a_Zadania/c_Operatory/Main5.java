
public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
		System.out.println(++a); //zwiększa a o 1 i wypisuje 2
		System.out.println(a++); //Wypisuje a=2 i zwiększa o 1 czyli a=3
		System.out.println(a); //Wypisuje 3
		b=a++; // do zmiennej b przypisuje a=3 czyli b=3 i zwiększa a o 1 czyli a=4
		System.out.println(b); //Wypisuje b=3
		b=++a; // zwiększa a o 1 czyli a=5 i przypisuje tą wartość to b czyli b=5
		System.out.println(++a); //zwiększa a o 1 i wypisuje czyli a=6
	}

}
