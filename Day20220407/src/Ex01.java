import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
System.out.println("����� �ֹι�ȣ�� �Է��ϼ���.(011231-1111222)>");
Scanner scanner = new Scanner(System.in);
String regNo = scanner.nextLine();
char gender = regNo.charAt(7);
// 1,3���� 2,4����
switch(gender) {
	case '1':
	case '3':
	System.out.println("����������Դϴ�");
	break;
	case '2': 
	case '4':
		System.out.println("����������Դϴ�");
		break;
		default:
			System.out.println("��ȿ�������� �ֹι�ȣ�Դϴ�");
}
}

	}

