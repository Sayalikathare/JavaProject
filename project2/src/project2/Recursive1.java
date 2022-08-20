package project2;

public class Recursive1 {
  static int sum(int n)
  {
	  if(n==1)
	  {
		  return 1;
	  }
	  else
	  {
		  return n+sum(n-1);
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int c=sum(4);
       System.out.println(c);
	}

}
