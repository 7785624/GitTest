
public class ch6 {

	public static void main(String[] args) {
	//����
	System.out.println("1"+"2"); // 12
	System.out.println(true+""); // true
	System.out.println('A'+'B'); //ĳ���ͺ��� �ƽ�Ű�ڵ� 65+66
	System.out.println('1'+ 2); // 51
	System.out.println('1'+ '2'); // �ƽ�Ű�ڵ� 99
	System.out.println('J'+ "ava"); //Java
	System.out.println(true + null); //null�ƹ��͵����ٴ¶� ����
	
	byte b = 10;
	char ch = 'a';
	int i = 100;
	long l = 1000L;
	
	b = (byte)i; // b������ ����ƮŸ���ε�(1)i������ ��Ƽ��(4) Ÿ���̶� ū�� ������ �������� �ϸ� ���������� i�� ����Ʈ������ȯ�ʿ� 
	ch = (char)b; //  �����Ұ� ĳ���� 2����Ʈ b1����Ʈ ĳ���͹����� �ٸ�?��? ĳ���Ͱ� 0~65535 ����Ʈ -128~127 -128���� -1���� ĳ���Ϳ� �ȵ�
	short s = (short)ch; //�Ѵ� 2����Ʈ�ε� �������� ���尡�� ũ��޶�  ��Ʈ-32768~32767 ĳ���� 0~65535 �����κ�ȯ�� �ս�
	i = (int)ch; //����ȯ����� ch�¹��� �ش繮�ڴ� �ƽ�Ű�ڵ带����ȯ�ؼ� ���������������ؼ� ����Ÿ�Ժ�����  i������
	float f = (float)i;
	//�Ѵ�4 ������ �Ǽ��� �ٵ� f�� �Ǽ����� ����������о� �� ©��������
	
	byte b = 26; //��������ʰ�
	char c =' ';//char������ �ݵ���ϳ��ǹ��ڸ� �����ؾߴ� �پ�������
	char answer ='n';
	float f = 3.14f;
	double d = 1.4e5f;
	}

}
