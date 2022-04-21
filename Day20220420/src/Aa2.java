import java.util.Scanner;
public class Aa2 {

	public static void main(String[] args) {
	int year = 0, month = 0, ttdays = 0, endDay = 0, endDay2 = 0;
	int i = 0, j = 0;
	
	//-------------------------------------------------
	Scanner sc = new Scanner(System.in);
	System.out.print("연도를 입력해주세요");
	year = sc.nextInt();
	System.out.println("월을 입력해주세요");
	month = sc.nextInt();
	//--------------------------------------------------
	
	//월 끝자리 계산
	switch (month) {
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		endDay = 31;
		break;
	case 2:
		if((year%4==0))

		break;
	}
	
	
	
	
	
	
	
	
	
	
	}

}
