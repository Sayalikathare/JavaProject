package project2;
import java.util.*;
public class chapter2four
{
	public static void main(String[] args)
	{
		double v,u,a,s,result;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter value of v : ");
		v=obj.nextDouble();
		System.out.println("enter value of u : ");
		u=obj.nextDouble();
		System.out.println("enter value of a : ");
		a=obj.nextDouble();
		System.out.println("enter value of s : ");
		s=obj.nextDouble();
		result=Math.sqrt((v*v-u*u)/(2*a*s));
		System.out.println(result);
	}

}
