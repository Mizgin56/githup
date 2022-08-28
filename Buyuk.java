package Kodluyoruz;

import java.util.Scanner;

public class Buyuk {

	public static void main(String[] args) {
		// Sayýyý Bulma
		
		int a,b,c,d;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen birinci sayýyý giriniz : ");
		a = scan.nextInt();
		
		System.out.print("Lütfen ikinci sayýyý sayýyý giriniz : ");
		b = scan.nextInt();
		
		System.out.print("Lütfen üçüncü sayýyý giriniz : ");
		c =scan.nextInt();
		
		System.out.print("Lütfen üçüncü sayýyý giriniz : ");
		d = scan.nextInt();
		
		if(a==b || a==c || a==d || b==c || b==d || c==d) {
			System.out.print("Lütfen girdiðiniz sayýlarýn birbirinden farklý olduðuna emin olunuz ! ");
		}else {

		if(a>b && a>c && a>d) {
			System.out.println("En büyük sayý birinci sayýdýr : " + a);
		}
		if(b>a && b>c && b>d) {
			System.out.println("En büyük sayý ikinci sayýdýr : " + b);
		}
		if(c>a && c>b && c>d) {
			System.out.println("En büyük sayý üçüncü sayýdýr : " + c);
		}
		if(d>a && d>b && d>c) {
			System.out.println("En büyük sayý dördüncü sayýdýr : " + d);
		}
		if(a<b && a<c && a<d) {
			System.out.print("En küçük sayý birinici sayýdýr : " + a);
		}
		if(b<a && b<c && b<d) {
			System.out.print("En küçük sayý ikinci  sayýdýr : " + b);
		}
		if(c<a && c<b && c<d) {
			System.out.print("En küçük sayý üçüncü sayýdýr : " + c);
		}
		if(d<a && d<b && d<c) {
			System.out.print("En küçük sayý dördüncü sayýdýr : " + d);
		}
	}
	}
}
