package com.del;

import java.util.Scanner;

public class TravellerMain {
	public static void main(String[] args) {
		//System.out.println("Hello bangalore");
		//Vehicle v = new Car(5,"honda",100000);
		//System.out.println(v);
		//Movable m=new Bus();
    	//m.move();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a vehicle");
		String type=sc.nextLine();
    	Movable myMovable=MovableFactory.getInstance(type);
    	if(myMovable!=null)
    		myMovable.move();
    	else
    		System.out.println(type+"  not found");
    	
	}

}
