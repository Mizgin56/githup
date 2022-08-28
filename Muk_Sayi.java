package Kodluyoruz;

import java.util.Scanner;

public class Muk_Sayi {

	public static void main(String[] args) {
		// Mükemmel Sayý
		
		int sayi;
		//int bol = 0;
		int toplam = 0;
		
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("Lütfen iþlem yapmak istediðiniz sayýyý giriniz : ");
		 sayi = scan.nextInt();
		 
		 if(sayi<0) {
			 System.out.print("Lütfen pozitif bir tam sayý giriniz !");
		 }else {
			 for(int i = 1; i<sayi; i++) {
				 if(sayi % i == 0) {
					 toplam += i;
				 }
			 }
			 

		 }
		 
		 if(toplam == sayi) {
			 System.out.print(sayi + " Sayýsý mükemmel bir sayýdýr :)");
		 }else {
			 System.out.print(sayi + " Sayýsý mükemmel bir sayý deðildir :( ");
		 }
		 
		 
	}

}
