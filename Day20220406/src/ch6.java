
public class ch6 {

	public static void main(String[] args) {
	//문제
	System.out.println("1"+"2"); // 12
	System.out.println(true+""); // true
	System.out.println('A'+'B'); //캐릭터변수 아스키코드 65+66
	System.out.println('1'+ 2); // 51
	System.out.println('1'+ '2'); // 아스키코드 99
	System.out.println('J'+ "ava"); //Java
	System.out.println(true + null); //null아무것도없다는뜻 에러
	
	byte b = 10;
	char ch = 'a';
	int i = 100;
	long l = 1000L;
	
	b = (byte)i; // b변수가 바이트타입인데(1)i변수는 인티저(4) 타입이라 큰걸 작은데 넣으려고 하면 오류가나서 i를 바이트로형변환필요 
	ch = (char)b; //  생략불가 캐릭터 2바이트 b1바이트 캐릭터범위가 다른?듯? 캐릭터가 0~65535 바이트 -128~127 -128부터 -1까지 캐릭터에 안들어감
	short s = (short)ch; //둘다 2바이트인데 변수끼리 저장가능 크기달라서  쇼트-32768~32767 캐릭터 0~65535 강제로변환시 손실
	i = (int)ch; //형변환업어도댐 ch는문자 해당문자는 아스키코드를형병환해서 정수형으로저장해서 정수타입변수인  i에가능
	float f = (float)i;
	//둘다4 정수를 실수로 근데 f가 실수여서 저장범위가넓어 좀 짤릴수있음
	
	byte b = 26; //저장공간초과
	char c =' ';//char형에는 반드시하나의문자를 저장해야댐 붙어져있음
	char answer ='n';
	float f = 3.14f;
	double d = 1.4e5f;
	}

}
