package yazılımGeliştiriciYetiştirmeKampiOdev2;

public class MiniProje5 {

	public MiniProje5() {
		int [] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMi=false;
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Sayı mevcuttur");
		}
		else {
			
			System.out.println("Sayı mevcut değildir");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
