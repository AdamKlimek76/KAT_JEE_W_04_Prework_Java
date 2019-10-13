

public class Main6 {

	public static void main(String[] args) {
		int n=55;
		int i, reszta;
		String czyParz;
		for(i=0; i<=n; i++){
			reszta = i % 2;
				if (reszta==0){
					czyParz=" parzysta";
				} else{
					czyParz=" nieparzysta";
				}
			System.out.println(i+czyParz);
		}
		i=0;
		while(i<=n) {
			reszta = i % 2;
			if (reszta == 0) {
				czyParz = " parzysta";
			} else {
				czyParz = " nieparzysta";
			}
			System.out.println(i+czyParz);
			i++;
		}
	}
}
