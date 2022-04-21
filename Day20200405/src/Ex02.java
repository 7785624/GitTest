
public class Ex02 {

	public static void main(String[] args) {
		
		
		float pi = 3.14159f;
		float result = (int)(pi*1000)/1000.0f;//1000f 뒤에 59값 없애기 int
				
		System.out.println(result);
		System.out.println(pi);
		//3.142
		
		
		float result2 = (int)(pi*1000+0.5f)/1000.0f;
		System.out.println(result2); //3.142
		
	
		
		
		
		char c ='a';
		// i가 0 i가 26이될때까지 1씩추가
		for(int i=0; i<26; i++) { //블럭 {}안의 문장을 26번 반복한다.
				System.out.print(c++); //'a'부터 26개의 문자를 출력한다.
		}				
		
		System.out.println(); //줄바꿈
		
        c = 'A';
		for (int i = 0; i<26; i++) {
				System.out.print(c++);
		}
		
		System.out.println();
		
		c = '0';
		for (int i=0; i<10; i++) {
			System.out.print(c++);
			
		}
		
		System.out.println();
		
		
		
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
	
	
	


