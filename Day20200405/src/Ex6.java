
public class Ex6 {

	public static void main(String[] args) {
		
	int x = 0xAB, y = 0xF;
	//비트연산결과 2진수 메써드 toBianaryString
	System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
	System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(x));
	System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x|y));
	System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x&y));
	System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x^y));
	System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x ^ y ^ y, toBinaryString(x^y^y));
	
	
			
		
		
		
		
		
		
		
		
		
//		int a = 30;
//				int b = 5; 
//	//||는 앞이 참이면 뒤에계산안함				//1시간걸리는걸 뒤로 앞에는 연산시간짧은거
//				if(a>20 || b>5) //if(a>20(1시간) && b>5 (5초))
//					System.out.println("만족");
//				
//			System.out.println("불만족");
//		
		
		
		
//		
//		char ch = 90;
//		
////아스키코드 ch가97~122 사이숫자 중 한ㄴ가지거나 || ch가65~90사이 숫자 가지라면 트루 아니면 펄스
//System.out.println((('a'<=ch && ch >= 'z') || ('A'<=ch && ch <= 'Z')));
//		
		
		
		
//		int a = 1; 
//		int  b = 0;
//		int i = 20;
//		
//		System.out.println(a>0 && b>0);
//		System.out.println(a>0 || b>0);
//		System.out.println(!(a>0 || b>0));
//		//i를 2로 나눠서 0이니 i으로 3으로  나눠서 0이니 i를 6으로 나눠서 0이니
//							//6,12,18..동시에 만족 아닐경우 3 15 9
//		System.out.println(i%2==0 || (i%3==0|| i%6 !=0));
//		
		
		
		
		}

	private static Object toBinaryString(int x) {
		// TODO Auto-generated method stub
		return null;
	}
		
}	
		
		
		
		
		
//	char c1 = 'a'; //아스키코드 소문자a 97
//	char c2 = (char)(c1+1);//아스키코드 소문자 b 98
//	char c3 = 'a'-32;
//	
//	
//	
//	
//	System.out.println(c1);
//	System.out.println(c2);
//	System.out.println(c3);
//	
//	
//	
	
	
	


