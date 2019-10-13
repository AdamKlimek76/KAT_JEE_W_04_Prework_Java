
public class Main8 {

	public static void main(String[] args) {
	int black=16;
	int white=15;
	boolean blackOrWhite=(black<white); //zwraca fałsz bo 16 nie jest mniejsze niż 15
	boolean good=true;
	boolean bad=false;
	boolean goodOrBad=good||bad; // suma logiczna prawdy i fałszu to prawda
	boolean comparison=blackOrWhite&&goodOrBad; //iloczyn logiczny fałszu i prawdy to fałsz
	System.out.println(blackOrWhite);
	System.out.println(goodOrBad);
	System.out.println(comparison);
	}

}
