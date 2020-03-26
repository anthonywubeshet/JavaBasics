package com.syntax.class08;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		Scanner scan; 
		scan=new Scanner(System.in); 
		int range1;
		int range2; 
		int sum=0;
		
	System.out.println("Enter range");	
	 range1=scan.nextInt();
     range2=scan.nextInt();
     int trange1=range1;
     
     for( int y=trange1;trange1<=range2;trange1++) {System.out.println(trange1);}
    
     for( int y=range1;range1<=range2;range1++) 
     if(range1%2!=0){sum=range1+sum;} 
     System.out.println(sum);
     

     int money;
     int price;
     System.out.println("Enter item you want to buy and price");
     String item=scan.nextLine();
     price=scan.nextInt();
     System.out.println("Give money");
     money=scan.nextInt();
     
     int dif=price-money;
     int change=money-price;
     if(money<price) {System.out.println("Pay "+dif);}
     if(money>price) {System.out.println("your change is "+change);}
      {System.out.println("thanks for shopping");}
     
  	
	boolean credit;
	do {System.out.println("Apply for credit card");
  	 credit=scan.nextBoolean();}while(!credit);
	
	
  	
	boolean shop=true;
	do {System.out.println("Enter item you want to buy and price");
    String item1=scan.nextLine();
    price=scan.nextInt();
    System.out.println("Are you done shooping");}while(shop);

	
		
	}

}
