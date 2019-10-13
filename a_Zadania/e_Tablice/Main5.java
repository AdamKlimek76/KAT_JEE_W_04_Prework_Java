
public class Main5 {

	public static void main(String[] args) {
		int numbers[]={-1, -3, -5, -9, -11, -15, -2, -6, -23, -4};
		int max=(-2147483648);
		for(int i=0; i<numbers.length; i++){
			if(numbers[i]>max){
				max=numbers[i];
			}
		}
		System.out.print(max);
	}

}
