package Kodluyoruz;

import java.util.Scanner;

public class kod5 {

	public static void main(String[] args) {
      // Daire alaný , çevresini ve daire dilim alaný bulma
		
		int a,r;
		double sonuc1,sonuc2,sonuc3,pi = 3.14;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen yarýçap ý giriniz : ");
		r = scan.nextInt();
		
		
		System.out.print("Lütfen a deðerini giriniz : ");
		a = scan.nextInt();
		
		sonuc1 = (r*r) + pi ;
		
		System.out.println("Alan Sonuç : " + sonuc1);
		
		sonuc2 = 2*pi*r;
		System.out.println("Çevre Sonuç : " + sonuc2);
		
		sonuc3 = (pi*(r*r)*a)/360;
		System.out.print("Daire Dilim Sonuç : " + sonuc3);
		
		
		
		
		
	}

}
