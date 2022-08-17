package Kodluyoruz;

import java.util.Scanner;

public class kkod_16 {

	public static void main(String[] args) {
		/*ÇİN ZODYAĞI
		 * Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
         *Doğum Tarihi %12 = 0 ➜ Maymun
         *Doğum Tarihi %12 = 1 ➜ Horoz
         *Doğum Tarihi %12 = 2 ➜ Köpek
         *Doğum Tarihi %12 = 3 ➜ Domuz
         *Doğum Tarihi %12 = 4 ➜ Fare
         *Doğum Tarihi %12 = 5 ➜ Öküz
         *Doğum Tarihi %12 = 6 ➜ Kaplan
         *Doğum Tarihi %12 = 7 ➜ Tavşan
         *Doğum Tarihi %12 = 8 ➜ Ejderha
         *Doğum Tarihi %12 = 9 ➜ Yılan
         *Doğum Tarihi %12 = 10 ➜ At
         *Doğum Tarihi %12 = 11 ➜ Koyun
		 */
		
	    int Dyil;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen doğduğunuz yılı giriniz : ");
		Dyil = scan.nextInt();
		
		if(Dyil % 12 == 0) {
			System.out.print("Çin Zodyağı : Maymun");
		
		}if(Dyil % 12 == 1) {
			System.out.print("Çin Zodyağı : Horoz");
		
		}if(Dyil % 12 == 2) {
			System.out.print("Çin Zodyağı : Köpek");
		
		}if(Dyil % 12 == 3) {
			System.out.print("Çin Zodyağı : Domuz");
		
		}if(Dyil % 12 == 4) {
			System.out.print("Çin Zodyağı : Fare");
		
		}if(Dyil % 12 == 5) {
			System.out.print("Çin Zodyağı : Öküz");
		
		}if(Dyil % 12 == 6) {
			System.out.print("Çin Zodyağı : Kaplan");
		
		}if(Dyil % 12 == 7) {
			System.out.print("Çin Zodyağı : Tavşan");
		
		}if(Dyil % 12 == 8) {
			System.out.print("Çin Zodyağı : Ejderha");
		
		}if(Dyil % 12 == 9) {
			System.out.print("Çin Zodyağı : Yılan");
		
		}if(Dyil % 12 == 10) {
			System.out.print("Çin Zodyağı : At");
		
		}if(Dyil % 12 == 11) {
			System.out.print("Çin Zodyağı : Koyun");
		
		}

	}

}
