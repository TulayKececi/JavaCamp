public class MiniProje1 {

	public MiniProje1() {
		int number=-25;
		int remainder= number %2;
		
		System.out.println(remainder);
		boolean isPrime =false;
		
		if(number==1) {
			System.out.println("Sayı asal değildir");

		}
		
		if(number<1) {
			System.out.println("Geçersiz sayı");

		}
		
		for(int i=2; i<number; i++) {
			if(number%2==0) {
				isPrime=false;
			}
		}
		
		if(isPrime) {
			System.out.println("Sayı asaldır");
		}
		else {
			System.out.println("Sayı asal değildir");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
