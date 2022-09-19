package yazılımGeliştiriciYetiştirmeKampiOdev2;

public class SwitchBloklariylaCalismak {

	public SwitchBloklariylaCalismak() {
		char grade='C';
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel Geçtiniz");
			break;
			
		case 'B':
		case 'C':
			System.out.println("İyi Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena değil Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef Kaldınız");
			break;
		}
		
	}

}
