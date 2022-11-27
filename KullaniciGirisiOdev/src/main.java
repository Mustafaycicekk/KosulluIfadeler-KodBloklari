import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		String userName, userPassword, newPassword, passwordChange;

		Scanner sc = new Scanner(System.in);

		System.out.println("Kullanıcı Adınızı Giriniz: ");
		userName = sc.nextLine();

		System.out.println("Kullanıcı Şifrenizi Giriniz: ");
		userPassword = sc.nextLine();
		
		if(userName.equals("musti") && userPassword.equals("123.")) {
			System.out.println("Giriş Tamamlandı, HoşGeldiniz..");
		}else {
			System.out.println("Parolanız Yanlış!");
			System.out.println("Parolanızı Yenilemek için:(1)\nEski Parolanıza Devam Etmek için:(2)");
			passwordChange = sc.nextLine();
			if(passwordChange.equals("1")) {
				System.out.println("Yeni Şifrenizi Giriniz: ");
				newPassword = sc.nextLine();
				
				if(newPassword.equals("123.")) {
					System.out.println("Yeni Girilen Şifre Eski Şifre İle Aynı Olamaz!");
				}else {
					System.out.println("Yeni Şifreniz Onaylandı");
					newPassword = userPassword;
				}
			}
			else {
				System.out.println("Tekrar Deneyiniz");
			}
		}		
		
		
		
	}
}
