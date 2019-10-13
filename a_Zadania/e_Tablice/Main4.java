
public class Main4 {

	public static void main(String[] args) {
		int[] numbers={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int ifEvenNumb;
		int sumOdd=0;
		for (int i=0; i<numbers.length; i++){
			ifEvenNumb = numbers[i] % 2;
			if(ifEvenNumb==0){
				System.out.println(numbers[i]);
			}
			if(ifEvenNumb==1){
				sumOdd+=numbers[i];
			}
		}
		System.out.println("Suma liczb nieparzystych to: " + sumOdd);
	}

}
