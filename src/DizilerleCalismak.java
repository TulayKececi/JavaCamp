public class DizilerleCalismak {

	public static void main(String[] args) {
		String ogrenci1="Tülay";
		String ogrenci2="Alparslan";
		String ogrenci3="Alya";
		String ogrenci4="Furkan";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		String [] ogrenciler = new String [3];
		ogrenciler[0]="Tülay";
		ogrenciler[1]="Alparslan";
		ogrenciler[2]="Alya";

		for(int i=0; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[1]);
		}

		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);

		}
	}

}
