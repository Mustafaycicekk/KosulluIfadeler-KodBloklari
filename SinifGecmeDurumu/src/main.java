import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		double matematik, fizik, turkce, kimya, muzik;
		Scanner sc = new Scanner(System.in);

		System.out.print("Matematik Notunuz: ");
		matematik = sc.nextDouble();
		if(!(matematik > 0 && matematik <= 100)){
			matematik = 0;
		}

		System.out.print("Fizik Notunuz: ");
		fizik = sc.nextDouble();
		if(!(fizik > 0 && fizik <= 100)){
			fizik = 0;
		}
		
		System.out.print("Türkçe Notunuz: ");
		turkce = sc.nextDouble();
		if(!(turkce > 0 && turkce <= 100)){
			turkce = 0;
		}
		
		System.out.print("Kimya Notunuz: ");
		kimya = sc.nextDouble();
		if(!(kimya > 0 && kimya <= 100)){
			kimya = 0;
		}
			
		System.out.print("Müzik Notunuz: ");
		muzik = sc.nextDouble();
		if(!(muzik > 0 && muzik <= 100)){
			muzik  = 0;
		}
		
		double ortalama = (matematik + fizik + turkce + kimya + muzik) / 5;
		if (ortalama <= 55) {
			System.out.println("Sınıfta Kaldın! ");
		} else {
			System.out.println("Sınıfı Geçtiniz ");
		}
		System.out.println("Ortalamanız: " + ortalama);
	}
}
