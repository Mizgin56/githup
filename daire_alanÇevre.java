package Kodluyoruz;

import java.util.Scanner;

public class kod5 {

	public static void main(String[] args) {
      // Daire alan� , �evresini ve daire dilim alan� bulma
		
		int a,r;
		double sonuc1,sonuc2,sonuc3,pi = 3.14;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen yar��ap � giriniz : ");
		r = scan.nextInt();
		
		
		System.out.print("L�tfen a de�erini giriniz : ");
		a = scan.nextInt();
		
		sonuc1 = (r*r) + pi ;
		
		System.out.println("Alan Sonu� : " + sonuc1);
		
		sonuc2 = 2*pi*r;
		System.out.println("�evre Sonu� : " + sonuc2);
		
		sonuc3 = (pi*(r*r)*a)/360;
		System.out.print("Daire Dilim Sonu� : " + sonuc3);
		
		
		
		
		
	}

}
