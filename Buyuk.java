package Kodluyoruz;

import java.util.Scanner;

public class Buyuk {

	public static void main(String[] args) {
		// Say�y� Bulma
		
		int a,b,c,d;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen birinci say�y� giriniz : ");
		a = scan.nextInt();
		
		System.out.print("L�tfen ikinci say�y� say�y� giriniz : ");
		b = scan.nextInt();
		
		System.out.print("L�tfen ���nc� say�y� giriniz : ");
		c =scan.nextInt();
		
		System.out.print("L�tfen ���nc� say�y� giriniz : ");
		d = scan.nextInt();
		
		if(a==b || a==c || a==d || b==c || b==d || c==d) {
			System.out.print("L�tfen girdi�iniz say�lar�n birbirinden farkl� oldu�una emin olunuz ! ");
		}else {

		if(a>b && a>c && a>d) {
			System.out.println("En b�y�k say� birinci say�d�r : " + a);
		}
		if(b>a && b>c && b>d) {
			System.out.println("En b�y�k say� ikinci say�d�r : " + b);
		}
		if(c>a && c>b && c>d) {
			System.out.println("En b�y�k say� ���nc� say�d�r : " + c);
		}
		if(d>a && d>b && d>c) {
			System.out.println("En b�y�k say� d�rd�nc� say�d�r : " + d);
		}
		if(a<b && a<c && a<d) {
			System.out.print("En k���k say� birinici say�d�r : " + a);
		}
		if(b<a && b<c && b<d) {
			System.out.print("En k���k say� ikinci  say�d�r : " + b);
		}
		if(c<a && c<b && c<d) {
			System.out.print("En k���k say� ���nc� say�d�r : " + c);
		}
		if(d<a && d<b && d<c) {
			System.out.print("En k���k say� d�rd�nc� say�d�r : " + d);
		}
	}
	}
}
