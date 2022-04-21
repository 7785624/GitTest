import java.util.Scanner;
public class ch06 {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	int sum=0;
	for(int i = 1; i <= 100; i++) {
		if(sum>100)
			break;
		sum+=i;
	}
	 System.out.println("sum : "+ sum);
	 
	}
}
