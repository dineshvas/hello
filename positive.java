package positive;
import java.util.Scanner;
public class positive {
	public static void main(String[] args){
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter the number:");
	 	int num=sc.nextInt();
	 	if(num>0){
	 		System.out.println("Num is positive:"+num);
	 	}
	 	else if(num<0){
	 		System.out.println("Num is Negative:"+num);
	 	}
	 	else{
	 		System.out.println("invalid");
	 	}
	}
}
