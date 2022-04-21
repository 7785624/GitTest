import java.util.*;
public class Ex3 {
	public static void main(String[] args) {
int sum = 0;
int count=0;
//인트 아이는 1 아이가 100보다 같거나 작으면
for(int i=1; i<=100; i++) {
//
	if(i%2==0 && i%7==0) {
		count++;
	}
}
int[] nArr = new int [count];
int j=0;
for(int i=1; i<=100; i++) {
	if(i%2==0 && i%7==0) {
		sum+=i;
		nArr[j++]=i;
	}
}
System.out.printf("\nsum : %d, count : %d",sum,count);
System.out.println("\n"+Arrays.toString(nArr));
	
}
}