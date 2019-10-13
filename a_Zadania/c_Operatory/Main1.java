
public class Main1 {
	public static void main(String[] args) {
	boolean first=false;
	boolean second=true;
	boolean isFirstEqualSecond=(first==second);
	System.out.println(isFirstEqualSecond);
	second=!second;
	isFirstEqualSecond=(first==second);
	System.out.println(isFirstEqualSecond);
	}

}
