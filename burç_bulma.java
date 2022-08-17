package Kodluyoruz;

import java.util.Scanner;

public class kod_14 {

	public static void main(String[] args) {
	// Burc bulma
		
		int ay ;
		int gun;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen doğduğunuz ayı giriniz : ");
		ay = scan.nextInt();
		
		System.out.print("Lütfen doğduğunuz  günü giriniz : ");
		gun = scan.nextInt();
		
		switch(ay) {
		   case 1:
			if(gun >=1 && gun <=31) {
				if(gun < 22) {
					System.out.print("Oğlak Burcu ");
				}else {
					System.out.print("Kova Burcu ");
				}
			} break ;
			case 2:
				if(gun >=1 && gun <=28) {
					if(gun < 20) {
						System.out.print("Kova Burcu ");
					}else {
						System.out.print("Balık Burcu ");
					}
						
				} break;
				case 3:
					if(gun >=1 && gun <=31) {
						if(gun < 21) {
							System.out.print("Balık Burcu ");
						}else {
							System.out.print("Koç Burcu ");
						}
					} break; 
					case 4:
						if(gun >=1 && gun <=30) {
							if(gun < 21) {
								System.out.print("Koç Burcu ");
							}else {
								System.out.print("Boğa Burcu ");
							}	
						} break;
						case 5:
							if(gun >=1 && gun <=31) {
								if(gun < 22) {
									System.out.print("Boğa Burcu ");
								}else {
									System.out.print("İkizler Burcu");
								}
							 } break;
							case 6:
								if(gun >=1 && gun <=30) {
									if(gun < 23) {
										System.out.print("İkizler Burcu");
									}else {
										System.out.print("Yengeç Burcu ");
									}
								} break;
								case 7:
									if(gun >=1 && gun <=31) {
										if(gun < 23) {
											System.out.print("Yengeç Burcu ");
										}else {
											System.out.print("Aslan Burcu ");
										}
									} break;
									case 8:
										if(gun >=1 && gun <=31) {
											if(gun < 23) {
												System.out.print("Aslan Burcu ");
											}else {
												System.out.print("Başak Burcu ");
											}
										}break;
										case 9:
											if(gun >=1 && gun <=30) {
												if(gun < 23) {
													System.out.print("Başak Burcu");
											    }else {
											    	System.out.print("Terazi Burcu ");
											    }
											} break;
											case 10:
												if(gun >=1 && gun <=31) {
													if(gun < 23) {
														System.out.print("Terazi Burcu ");
													}else {
														System.out.print("Akrep Burcu ");
													}
												} break; 
												case 11:
													if(gun >= 1 && gun <=30) {
														if(gun < 22) {
															System.out.print("Akrep Burcu ");
														}else {
															System.out.print("Yay Burcu ");
														}
													} break;
													case 12:
														if(gun >= 1 && gun <=31) {
															if(gun < 22) {
																System.out.print("Yay Burcu ");
															}else {
																System.out.print("Oğlak Burcu ");
															}
														}else {
															System.out.print("Hatalı giriş yaptınız !");
														} break; 
															
														
		   }
		
		
		
	}

}
