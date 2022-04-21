import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
System.out.println("당신의 주민번호를 입력하세요.(011231-1111222)>");
Scanner scanner = new Scanner(System.in);
String regNo = scanner.nextLine();
char gender = regNo.charAt(7);
// 1,3남자 2,4여자
switch(gender) {
	case '1':
	case '3':
	System.out.println("당신은남자입니다");
	break;
	case '2': 
	case '4':
		System.out.println("당신은여자입니다");
		break;
		default:
			System.out.println("유효하지않은 주민번호입니다");
}
}

	}


