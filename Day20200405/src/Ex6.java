
public class Ex6 {

	public static void main(String[] args) {
		
	int x = 0xAB, y = 0xF;
	//��Ʈ������ 2���� �޽�� toBianaryString
	System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
	System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(x));
	System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x|y));
	System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x&y));
	System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x^y));
	System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x ^ y ^ y, toBinaryString(x^y^y));
	
	
			
		
		
		
		
		
		
		
		
		
//		int a = 30;
//				int b = 5; 
//	//||�� ���� ���̸� �ڿ�������				//1�ð��ɸ��°� �ڷ� �տ��� ����ð�ª����
//				if(a>20 || b>5) //if(a>20(1�ð�) && b>5 (5��))
//					System.out.println("����");
//				
//			System.out.println("�Ҹ���");
//		
		
		
		
//		
//		char ch = 90;
//		
////�ƽ�Ű�ڵ� ch��97~122 ���̼��� �� �Ѥ������ų� || ch��65~90���� ���� ������� Ʈ�� �ƴϸ� �޽�
//System.out.println((('a'<=ch && ch >= 'z') || ('A'<=ch && ch <= 'Z')));
//		
		
		
		
//		int a = 1; 
//		int  b = 0;
//		int i = 20;
//		
//		System.out.println(a>0 && b>0);
//		System.out.println(a>0 || b>0);
//		System.out.println(!(a>0 || b>0));
//		//i�� 2�� ������ 0�̴� i���� 3����  ������ 0�̴� i�� 6���� ������ 0�̴�
//							//6,12,18..���ÿ� ���� �ƴҰ�� 3 15 9
//		System.out.println(i%2==0 || (i%3==0|| i%6 !=0));
//		
		
		
		
		}

	private static Object toBinaryString(int x) {
		// TODO Auto-generated method stub
		return null;
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
	
	
	


