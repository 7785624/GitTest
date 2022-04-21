import java.util.*;
public class cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("8");
		int input = sc1.nextInt();
		
		int[]Maxdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(input >0 && input <13)	{
			 
			 System.out.printf("8월은 31 까지 입니다.", input , Maxdays[input-1]);
			 
		 }else {System.out.println("31");
		 
		 sc1.close();
		 }

	}
}

		


