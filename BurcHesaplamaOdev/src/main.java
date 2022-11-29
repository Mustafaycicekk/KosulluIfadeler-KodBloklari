import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		int gun, ay;
		String burc = "Burcunuz Bulunamamaktadır";

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Doğduğunuz Ayı Giriniz: ");
		ay = scan.nextInt();
		gun = scan.nextInt();

		if (ay >= 1 && ay <= 12) {
			if (ay == 1) {
				if (gun <= 21) {
					burc = "Oğlak Burcusunuz";
				} else if (gun >= 23 && gun <= 31) {
					burc = "Kova Burcusunuz";
				} else {
					System.out.println("Yanlış Gün Değeri Girdiniz");
				}

			}
			if (ay == 2) {
				if (gun <= 19) {
					burc = "Kova Burcusunuz";
				} else if (gun >= 20 && gun <= 31) {
					burc = "Balık Burcusunuz";
				} else {
					System.out.println("Yanlış Gün Değeri Girdiniz");
				}

			}
			if (ay == 3) {
				if (gun <= 20) {
					burc = "Balık Burcusunuz";
				} else if (gun >= 21 && gun <= 31) {
					burc = "Koç Burcusunuz";
				} else {
					System.out.println("Yanlış Gün Değeri Girdiniz");
				}
			}
			if (ay == 4) {
				if (gun <= 20) {
					burc = "Koç Burcusunuz";
				} else if (gun >= 21 && gun <= 31) {
					burc = "Boğa Burcusunuz";
				} else {
					System.out.println("Yanlış Gün Değeri Girdiniz");
				}
			}
			if (ay == 5) {
				if (gun <= 21) {
					burc = "Boğa Burcusunuz";
				} else if (gun >= 22 && gun <= 31) {
					burc = "İkizler Burcusunuz";
				} else {
					System.out.println("Yanlış Gün Değeri Girdiniz");
				}
			}
			if (ay == 6) {
				if (gun <= 22) {
					burc = "İkizler Burcusunuz";
				} else if (gun >= 23 && gun <= 31) {
					burc = "Yengeç Burcusunuz";
				} else {
					System.out.println("Yanlış Gün Değeri Girdiniz");
				}
			}
			if (ay == 7) {
				if (gun <= 22) {
					burc = "Yengeç Burcusunuz";
				} else if (gun >= 23 && gun <= 31) {
					burc = "Aslan Burcusunuz";
				} else {
					System.out.println("Yanlış Gün Değeri Girdiniz");
				}
			}
			if (ay == 8) {
				if (gun <= 22) {
					burc = "Aslan Burcusunuz";
				} else if (gun >= 23 && gun <= 31) {
					burc = "Başak Burcusunuz";
				} else {
					System.out.println("Yanlış Gün Değeri Girdiniz");
				}
			}
			if (ay == 9) {
				if (gun <= 22) {
					burc = "Başak Burcusunuz";
				} else if (gun >= 23 && gun <= 31) {
					burc = "Terazi Burcusunuz";
				} else {
					System.out.println("Yanlış Gün Değeri Girdiniz");
				}
			}
			if (ay == 10) {
				if (gun <= 22) {
					burc = "Terazi Burcusunuz";
				} else if (gun >= 23 && gun <= 31) {
					burc = "Akrep Burcusunuz";
				} else {
					System.out.println("Yanlış Gün Değeri Girdiniz");
				}
			}
			if (ay == 11) {
				if (gun <= 21) {
					burc = "Akrep Burcusunuz";
				} else if (gun >= 22 && gun <= 31) {
					burc = "Yay Burcusunuz";
				} else {
					System.out.println("Yanlış Gün Değeri Girdiniz");
				}
			}
			if (ay == 12) {
				if (gun <= 21) {
					burc = "Yay Burcusunuz";
				} else if (gun >= 22 && gun <= 31) {
					burc = "Oğlak Burcusunuz";
				} else {
					System.out.println("Yanlış Gün Değeri Girdiniz");
				}
			}
			System.out.println("Burcunuz: " + burc);
		} else {
			System.out.println("Yanlış Ay Değeri Girdiniz");

		}
	}
}
