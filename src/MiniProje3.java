package yazılımGeliştiriciYetiştirmeKampiOdev2;

public class MiniProje3 {

	public MiniProje3() {
		int number=5;
		int total=0;
		
		for(int i=0; i<number; i++) {
			if(number % i == 0) {
				total = total + i ;
			}
		}
		
		if(total==number) {
			System.out.println("Mükemmel sayıdır");
			
		}
		else {
			System.out.println("Mükemmel sayı değildir");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
