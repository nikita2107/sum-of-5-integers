import java.util.Scanner;
public class Main1 {

    
  public static void main(String[] args)

{       
    int i,n=0,s=0;
	{
	   
        System.out.println("Input the 5 numbers : ");  
         
	}
		for (i=0;i<5;i++)
		{
		    Scanner in = new Scanner(System.in);
		    n = in.nextInt();
		    
  		s +=n;
	}
    System.out.println("The sum of 5 integers is : " +s);
}
}