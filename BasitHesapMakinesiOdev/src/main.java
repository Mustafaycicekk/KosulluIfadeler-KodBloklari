import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		double sayi1, sayi2;
		int secim = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Birinci Sayıyı Giriniz: ");
		sayi1 = sc.nextDouble();

		System.out.print("İkinci Sayıyı Giriniz: ");
		sayi2 = sc.nextDouble();

		System.out.println(
				"İşlem Seçimi Yapınız:\nToplamak için:(1)\nÇıkarmak için:(2)\nÇarpmak	için: (3)\nBölmek 	için: (4)");
		secim = sc.nextInt();

		switch (secim) {
		case 1: {
			System.out.println("Sayıların Toplamı: " + (sayi1 + sayi2));
			break;
		}
		case 2: {
			System.out.println("Sayıların Toplamı: " + (sayi1 - sayi2));
			break;
		}
		case 3: {
			System.out.println("Sayıların Toplamı: " + (sayi1 * sayi2));
			break;
		}
		case 4: {
			if (sayi1 != 0) {
				System.out.println("Sayıların Toplamı: " + (sayi1 / sayi2));
			} else {
				System.out.println("Bir Sayı 0'a Bölünemez!");
			}
			break;
		}
		default:
			System.out.println("Yanlış seçim Yaptınız!");
		}
	}
}
