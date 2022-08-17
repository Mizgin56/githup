package Kodluyoruz;

import java.util.Scanner;

public class kod8 {

	public static void main(String[] args) {
		//Hesap Makinesi 
		
		System.out.println("HESAP MAKÝNESÝ \n1.ÝÞLEM : TOPLAMA \n2.ÝÞLEM : ÇIKARMA \n3.ÝÞLEM : ÇARPMA \n4.ÝÞLEM : BÖLME");
		
		double a,b,islem;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen iþlem yapmak istediðiniz ilk sayýyý giriniz : ");
		a = scan.nextDouble();
		
		System.out.print("Lütfen iþlem yapmak isyediðiniz ikinci sayýsý giriniz : ");
		b = scan.nextDouble();
		
		System.out.print("Lütfen yapmak istediðiniz iþlem numarasýný giriniz : ");
		islem = scan.nextDouble();
		
		if (islem == 1) {
			System.out.print("ÝÞLEM SONUCU : " + (a+b));
		
		}else if (islem == 2) {
			System.out.print("ÝÞLEM SONUCU : " + (a-b)) ;
			
		}else if (islem == 3) {
			System.out.print("ÝÞLEM SONUCU : " + (a*b));
			
		}else if (islem == 4) {
			System.out.print("ÝÞLEM SONUCU : " + (a/b));
		}else {
			System.out.print("HATALI ÝÞLEM NUMARSI !!!");
		}
		
				
				
		
		

	}

}
