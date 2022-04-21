import java.util.*;
public class Aa01 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	String input = sc.nextLine();
	int sum = 0;
	float ave = 0;
	
	
	
	for(int i = 0; i<=100; i++) {
		sum+=i;
	} ave=sum/100;
	System.out.println("sum:"+sum);
	

	
	}
}
//	int bus = 2500;	
//	double rate = 0.0;
//	int age = Integer.parseInt(input);
//	if(age<=3) {
//		System.out.println("할인율 100%");
//			}
//		else if(age<=13) {
//				System.out.println("할인율 50%");
//				System.out.println(bus/2);
//			}else if(age<=19) {
//				System.out.println("할인율 25%");
//				System.out.println((int)bus*0.75);
//			}else if(age<=64) {
//				System.out.println("할인율 0%");
//				System.out.println(bus);
//			}	
//			else if (age<=65){
//			System.out.println("할인율 100%");
//			System.out.println("무료");
//			}	
			
		
	
