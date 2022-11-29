import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		int mesafe, yas, yolculukTipi;
		double kmBasina = 0.10, normalTutar, yasIndirimi = 0, yasIndirimOrani = 0;
		double indirimliTutar, gidisDonusIndirimi = 0, toplamTutar;
		Scanner sc = new Scanner(System.in);

		System.out.println("Gidilecek Mesafeyi Giriniz: ");
		mesafe = sc.nextInt();
		System.out.println("Yaşınızı Giriniz: ");
		yas = sc.nextInt();
		System.out.println("Tek Yön ise(1) Gidiş Dönüş ise(2) Seçiniz: ");
		yolculukTipi = sc.nextInt();

		if (mesafe > 0 && yas > 0 && yolculukTipi == 1 || yolculukTipi == 2) {
			if (yas < 12) {
				yasIndirimOrani = 0.50;
			} else if (yas >= 12 && yas <= 24) {
				yasIndirimOrani = 0.10;
			} else if (yas > 65) {
				yasIndirimOrani = 0.30;
			} else {
				yasIndirimOrani = 0;
			}

			normalTutar = mesafe * kmBasina;
			yasIndirimi = normalTutar * yasIndirimOrani;
			indirimliTutar = normalTutar - yasIndirimi;
			if (yolculukTipi == 2) {
				gidisDonusIndirimi = indirimliTutar * 0.20;
				toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
			} else {
				toplamTutar = indirimliTutar;
			}
			System.out.println("Toplam Tutar: " + toplamTutar + " Türk Lirası");
		} else {
			System.out.println("Hatalı Veri Girdiniz");
		}
	}
}
