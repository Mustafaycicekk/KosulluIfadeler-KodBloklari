import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		int sicaklik;
		Scanner sc = new Scanner(System.in);

		System.out.print("Sıcaklık Derecesini Giriniz: ");
		sicaklik = sc.nextInt();

		if (sicaklik < 5) {
			System.out.println("Tam Kayak Yapma Havasi ");
		} else if (sicaklik <= 25) {
			if (sicaklik <= 15) {
				System.out.println("Kayakta Yapılmaz Piknikte En İyisi Sinemaya Git");
			}
			if (sicaklik >= 10) {
				System.out.println("Yok mu Güzel Bir Mangal Yakmamız");
			}
		} else {
			System.out.println("Deniz Kum Güneş Havası Canım");
		}

	}
}
