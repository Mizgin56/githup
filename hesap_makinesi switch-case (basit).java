package Kodluyoruz;

import java.util.Scanner;

public class kod9 {

	public static void main(String[] args) {
		// HESAP MAKÝNESÝ SWÝtCH-CASE
		
		System.out.println("HESAP MAKÝNESÝ \n1.ÝÞLEM : TOPLAMA \n2.ÝÞLEM : ÇIKARMA \n3:ÝÞLEM : ÇARPMA \n4:ÝÞLEM : BÖLME");
		
		int a,b;
		int islem;
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen yapmak isttediðiniz iþlem numarasýný giriniz : ");
		islem = scan.nextInt();
		
		System.out.print("Lütfen iþlem yapmak istediðiniz ilk sayýyý giriniz : ");
		a = scan.nextInt();
		
		System.out.print("Lütfen iþlem yapmak istediðiniz iþlem numarasýný giriniz : ");
		b = scan.nextInt();
		
		
		    
	    switch (islem) {    
	        case 1 :
			    System.out.print("ÝÞLEM SONUCU : " + (a+b));
			    break;
		    case 2 :
		    	System.out.print("ÝÞLEM SONUCU : " + (a-b));
		    	break;
		    case 3 :
		    	System.out.print("ÝÞLEM SONUCU : " + (a*b));
		    	break;
		    case 4 : 
		    	System.out.print("ÝÞLEM SONUCU : " + (a/b));
		    	break;
		    default :
		    	System.out.print("GEÇERSÝZ ÝÞLEM !!!");
	         
		
			
		}
		
		
		
		
		

	}

}
