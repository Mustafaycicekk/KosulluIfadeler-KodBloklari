import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		int yil;
		boolean Degerlendirme1;
		boolean Degerlendirme2;
		boolean artikYilMi;

		Scanner sc = new Scanner(System.in);
		System.out.println("Yıl Giriniz: ");
		yil = sc.nextInt();

		Degerlendirme1 = ((yil % 100 == 0) && (yil % 400 == 0));
		Degerlendirme2 = (!(yil % 100 == 0) && (yil % 4 == 0)); 
		
		artikYilMi = Degerlendirme1 || Degerlendirme2;	

		if (artikYilMi == true) {
			System.out.println(yil + " 366 Gündür. Yani Artık Yıldır");
		} else {
			System.out.println(yil + " 365 Gündür. Artık Yıl Değildir!");
		}

	}
}
