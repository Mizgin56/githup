package Kodluyoruz;

import java.util.Scanner;

public class kod9 {

	public static void main(String[] args) {
		// HESAP MAK�NES� SW�tCH-CASE
		
		System.out.println("HESAP MAK�NES� \n1.��LEM : TOPLAMA \n2.��LEM : �IKARMA \n3:��LEM : �ARPMA \n4:��LEM : B�LME");
		
		int a,b;
		int islem;
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen yapmak isttedi�iniz i�lem numaras�n� giriniz : ");
		islem = scan.nextInt();
		
		System.out.print("L�tfen i�lem yapmak istedi�iniz ilk say�y� giriniz : ");
		a = scan.nextInt();
		
		System.out.print("L�tfen i�lem yapmak istedi�iniz i�lem numaras�n� giriniz : ");
		b = scan.nextInt();
		
		
		    
	    switch (islem) {    
	        case 1 :
			    System.out.print("��LEM SONUCU : " + (a+b));
			    break;
		    case 2 :
		    	System.out.print("��LEM SONUCU : " + (a-b));
		    	break;
		    case 3 :
		    	System.out.print("��LEM SONUCU : " + (a*b));
		    	break;
		    case 4 : 
		    	System.out.print("��LEM SONUCU : " + (a/b));
		    	break;
		    default :
		    	System.out.print("GE�ERS�Z ��LEM !!!");
	         
		
			
		}
		
		
		
		
		

	}

}
