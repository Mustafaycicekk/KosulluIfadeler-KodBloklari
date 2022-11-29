import java.util.Scanner;

public class driver {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);

		System.out.println("A Sayıyı Giriniz: ");
		a = sc.nextInt();

		System.out.println("B Sayıyı Giriniz: ");
		b = sc.nextInt();

		System.out.println("C Sayıyı Giriniz: ");
		c = sc.nextInt();

		if ((a < b) && (a < c)) {
			if (b < c) {
				System.out.println("Küçükten Büyüğe: " + a + " < " + b + " < " + c);
			} else {
				System.out.println("Küçükten Büyüğe: " + a + " < " + c + " < " + b);
			}
		} else if ((b < a) && (b < c)) {
			if (a < c) {
				System.out.println("Küçükten Büyüğe: " + b + " < " + a + " < " + c);
			} else {
				System.out.println("Küçükten Büyüğe: " + b + " < " + c + " < " + a);
			}
		} else {
			if (b < a) {
				System.out.println("Küçükten Büyüğe: " + c + " < " + b + " < " + a);
			} else {
				System.out.println("Küçükten Büyüğe: " + c + " < " + a + " < " + c);
			}
		}

	}
}
