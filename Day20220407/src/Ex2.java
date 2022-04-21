import java.util.*;
public class Ex2 {
	public static void main(String[] args) {
		int sum = 0; //합계저장변수
		float ave = 0;
	
		for(int i=1; i <= 100; i++) {
			sum+=i;
		}
			System.out.println(sum);
			ave =(float)sum/100;
		System.out.println(ave);
		
		int sum2 = 0;
		int count = 0;
		for(int num =8; num<=100; num++) {
			if(num%2==0 && num%7==0) {
				count++;
				sum2+=num;
			}	
			for(int i=1; i <= 100; i++) {
				
				sum+=i;
			}
			
		}
		System.out.println("합계 :" + sum2);
		System.out.println("개수 :" + count);
		
}

	}


