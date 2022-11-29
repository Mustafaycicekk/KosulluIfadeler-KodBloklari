import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		int dogumYili, kalan;
		String burc = "Burcunuz: ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Doğum Yılınızı Giriniz: ");
		dogumYili = sc.nextInt();

		kalan = dogumYili % 12;

		switch (kalan) {
			case 0: {
				burc = burc + "Maymun";
				break;
			}
			case 1: {
				burc = burc + "Horoz";
				break;
			}
			case 2: {
				burc = burc + "Köpek";
				break;
			}
			case 3: {
				burc = burc + "Domuz";
				break;
			}
			case 4: {
				burc = burc + "Fare";
				break;
			}
			case 5: {
				burc = burc + "Öküz";
				break;
			}
			case 6: {
				burc = burc + "Kaplan";
				break;
			}
			case 7: {
				burc = burc + "Tavşan";
				break;
			}
			case 8: {
				burc = burc + "Ejderha";
				break;
			}
			case 9: {
				burc = burc + "Yılan";
				break;
			}
			case 10: {
				burc = burc + "At";
				break;
			}
			case 11: {
				burc = burc + "Koyun";
				break;
			}
		}
		System.out.println(burc);

	}
}
