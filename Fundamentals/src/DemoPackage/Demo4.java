package DemoPackage;
import java.util.*;

public class Demo4 {
	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a value:");
		i=sc.nextInt();
		if(i<0)
			System.out.println("negative number");
	    if(i==0)
	    	System.out.println("zero");
	    if(i>0)
	    	System.out.println("positive number");
	    }
}
