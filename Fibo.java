package Kodluyoruz;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// Fibonacci say�lar� bulma
		
		int ilkSayi,sonSayi;
		int a = 0 , b = 1 , c = 0;
		int sayac = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen i�lem yapmak istedi�iniz fibonacci say�s�n� ilk aral���n� giriniz : ");
		ilkSayi = scan.nextInt();
		
		System.out.print("L�tfen i�lem yapmak istedi�iniz fibonacci say�s�n� son aral���n� giriniz : ");
		sonSayi = scan.nextInt();
		

		while(c<sonSayi) {
			c = a + b;
			if(c>ilkSayi && c<sonSayi) {
				System.out.println(sayac + ". Ad�mdaki Fibonacci say� : " + c);
			}
			sayac++;
			a = b;
			b = c;
		
			
		}
	}

}
