
public class Main8 {

	public static void main(String[] args) {

		double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, -15};
		double avg=0;
		for (int i=0; i<temps.length; i++){
			temps[i]*=1.8+32;
		}
		for (int i=0; i<temps.length; i++){
			avg+=temps[i]/temps.length;
		}
		String answer = String.format( "Srednia temperatura to: %.2f", avg );
		System.out.print(answer);
	}

}
