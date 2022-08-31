package Kodluyoruz;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// Fibonacci sayýlarý bulma
		
		int ilkSayi,sonSayi;
		int a = 0 , b = 1 , c = 0;
		int sayac = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen iþlem yapmak istediðiniz fibonacci sayýsýný ilk aralýðýný giriniz : ");
		ilkSayi = scan.nextInt();
		
		System.out.print("Lütfen iþlem yapmak istediðiniz fibonacci sayýsýný son aralýðýný giriniz : ");
		sonSayi = scan.nextInt();
		

		while(c<sonSayi) {
			c = a + b;
			if(c>ilkSayi && c<sonSayi) {
				System.out.println(sayac + ". Adýmdaki Fibonacci sayý : " + c);
			}
			sayac++;
			a = b;
			b = c;
		
			
		}
	}

}
