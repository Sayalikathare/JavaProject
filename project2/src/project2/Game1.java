package project2;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("********Welcome___to___the___Game********");
       System.out.println(" \n       ###Rock__Paper__Scissor###       ");
       System.out.println("\n Choose your option \n 1)Rock \n 2)Paper \n 3)Scissor");
       Scanner sc=new Scanner(System.in);
       int user=sc.nextInt();
       if(user==1 || user==2 || user==3)
       {
    	   Random r=new Random();
    	   int computer=r.nextInt(3)+1;
    	   if(computer==1)
    	   {
    		   System.out.println("Computer chooses Rock");
    	   }
    	   else if(computer==2)
    	   {
    		   System.out.println("Computer chooses Paper");
    	   }
    	   else if(computer==3)
    	   {
    		   System.out.println("Computer chosses Scissor");
    	   }
    	   else
    	   {
    		   System.out.println("Code fails");
    	   }
    	   if(user==computer)
    	   {
    		   System.out.println("It's a Tie");
    	   }
    	   else if((user==1 && computer==3) || (user==2 && computer==1) || (user==3 && computer==2))
    	   {
    		   System.out.println("***You Win***:)");
    	   }
    	   else
    	   {
    		   System.out.println("---You Loose---:(");
    	   }
       }
       else
       {
    	   System.out.println("Wrong option chosen :(");
       }
	}

}
