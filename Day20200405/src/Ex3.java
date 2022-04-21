
public class Ex3 {

	public static void main(String[] args) {
		//따옴표는 공유
		String str1 = "abc";
		//클래스        객체생성. new연산자로 생성
		String str2 = new String ("abc");
		//new연산자는 새로만들라는뜻 그래서 "abc"랑 new string("abc")랑다름
		//주소값이다름주소값주소값주소값주소값주소값주소값주소값
	
		
		
		
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc" );
		System.out.printf("str1==\"abc\"? %b%n", str1=="abc" );
		System.out.printf("str2==\"abc\"? %b%n", str2=="abc");
		                                       //equals를쓰면 주소값비교가아니라 값 비교
		System.out.printf("str1.equasls(\"abc\")?%b%n",str1.equals("abc"));
		
		System.out.printf("str2.equasls(\"abc\")?%b%n",str2.equals("abc"));
		System.out.printf("str2.equasls(\"ABC\")?%b%n",str2.equals("ABC"));
		
		System.out.printf("str2.equaslsIgnoreCase(\"ABC\")?%b%n",str2.equalsIgnoreCase("ABC"));
										
		
		
		
		
		
		
		
		
//		int x = 10;
//		int y = 8;
//		x=y; //우항을 좌항에 대입
//		System.out.println(x>y);
//		System.out.println(x<y);
//		System.out.println(x>=y);//>=허용 <=에러 좌항이기준
//		System.out.println(x<=y);
//		
//		System.out.println(x==y);//두 수가 같다
//		System.out.println(x!=y);//두 수가 같지않다
//		
//		System.out.printf("%d를 %d로 나누면, %n",x,y);
//		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n",x/y,x%y);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		double pi = 3.141592;
//		//Math.round 소수점첫째자리 반올림후 정수로 돌려주는메써드
//		double shortPi = pi*1000;
//		System.out.println(shortPi);
//		shortPi = Math.round(pi*1000);
//		System.out.println(shortPi);
//		
//		shortPi=Math.round(pi*1000)/1000.0;
//		System.out.println(shortPi);
		
		
		
		
		
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
	
	
	


