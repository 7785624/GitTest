import java.util.*;
public class ch05 {

	public static void main(String[] args) {
	System.out.println("����(1),����(2),��(3), �� �ϳ��� �Է��ϼ���.>");
	 
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com= (int)(Math.random()*3)+1;//1����3������ ���� �������� ���ϱ� ������ ���ϱ�3�ѵ� int�� Ÿ�Ժ��� �� ���ϱ� 1 
	
	System.out.println("�����"+"user"+"�Դϴ�");
	System.out.println("����"+com+"�Դϴ�");
	
	switch(user-com) {
	case 2: case-1:
		System.out.println("����� �����ϴ�.");
		break;
	case 1: case -2:
		System.out.println("����� �̰���ϴ�.");
		break;
	case 0:
		System.out.println("�����ϴ�.");
		break;
	}
	
	
	
	
	
	
	}

}
