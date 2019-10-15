
import java.util.Random;

public class Main7 {

	public static void main(String[] args) {

		int randNumbers[]=new int[100];
		int sum=0;
		Random generator = new Random();
			for(int i=0; i<100; i++){
				randNumbers[i] = generator.nextInt(21);
			}
			for (int i=0; i<100; i++){
				System.out.print(randNumbers[i] + ",");
			}
			for (int i=0; i<100; i++){
				sum+=randNumbers[i];
			}
			System.out.println("\n" + "Suma 100 losowych liczb od 0 do 20 to " + sum);
	}
}
