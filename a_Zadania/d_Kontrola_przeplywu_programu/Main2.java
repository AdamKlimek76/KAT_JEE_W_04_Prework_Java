
public class Main2 {

	public static void main(String[] args) {
		int nr1 = 8;
		int nr2 = 11;
		int nr3 = 3;
		if((nr1 > nr2) && (nr1 > nr3)) {
			System.out.print("Z liczb " + nr1 + ", " + nr2 + ", " + nr3 + " najwieksza jest " + nr1);
		}
		else if ((nr2 > nr1) && (nr2 > nr3)) {
			System.out.print("Z liczb " + nr1 + ", " + nr2 + ", " + nr3 + " najwieksza jest " + nr2);
		}
		else if ((nr3>nr2)&&(nr3>nr1)) {
			System.out.print("Z liczb " + nr1 + ", " + nr2 + ", " + nr3 + " najwieksza jest " + nr3);
		}
		else{
			System.out.print("Z liczb " + nr1 + ", " + nr2 + ", " + nr3 + " sa dwie rowne najwieksze lub wszystkie liczby sa rowne");
		}
	}
}
