
public class Ex02 {

	public static void main(String[] args) {
		
		
		float pi = 3.14159f;
		float result = (int)(pi*1000)/1000.0f;//1000f �ڿ� 59�� ���ֱ� int
				
		System.out.println(result);
		System.out.println(pi);
		//3.142
		
		
		float result2 = (int)(pi*1000+0.5f)/1000.0f;
		System.out.println(result2); //3.142
		
	
		
		
		
		char c ='a';
		// i�� 0 i�� 26�̵ɶ����� 1���߰�
		for(int i=0; i<26; i++) { //�� {}���� ������ 26�� �ݺ��Ѵ�.
				System.out.print(c++); //'a'���� 26���� ���ڸ� ����Ѵ�.
		}				
		
		System.out.println(); //�ٹٲ�
		
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
		
		
		
		
		
//	char c1 = 'a'; //�ƽ�Ű�ڵ� �ҹ���a 97
//	char c2 = (char)(c1+1);//�ƽ�Ű�ڵ� �ҹ��� b 98
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
	
	
	


