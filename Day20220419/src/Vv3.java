import java.util.Arrays;
//> �º���ũ�� Ʈ�� <������ Ʈ�� >=ũ�ų� ������ <=�۰ų�������

public class Vv3 {

	public static void main(String[] args) {
		int[][] score = {
						{100,100,100},
						{20,20,20},
						{30,30,30},
						{40,40,40},
						{50,50,50},
		};
		int korTotal =0, engTotal = 0, mathTotal=0;
		System.out.println("��ȣ ���� ���� ���� ���� ���");
		System.out.println("================================");
		//���̰�0	���� ���ھ�� 5���ϱ� 
		for(int i=0; i<score.length; i++) {
			int sum=0; //���κ�����
			float avg=0.0f; //���κ����
			
			korTotal += score[i][0];// 0����0��
			engTotal += score[i][1];//1��° 1��
			mathTotal += score[i][2];//2���� 2��
			System.out.printf("%3d",i+1);
			//���̰� 0
			for(int j=0; j<score[i].length; j++) {
					sum+=score[i][j]; //0��0��������
								//�ڸ�������� ����
					System.out.printf("%5d",score[i][j]);
			}
			avg=sum/(float)score[i].length;//��հ��
			System.out.printf("%5d %5.1f%n",sum,avg);
		}//���������� �ٽ� ���� �ݺ�..?
		System.out.println("============================");
		System.out.printf("����:%3d %4d %4d%n",korTotal,engTotal,mathTotal);
		
		
	}	
	}
//	int [][] score = { //��� �� �Ѵ� 4����
//						{100,100,100}, //0������ ���� ���ھ�[0].���� �ϸ� 3��
//						{20,20,20}, //1��°��
//						{30,30,30},
//						{40,40,40},
//					};
//	int sum = 0;
//			//0~4���� 4������ ���� 4���ϱ�?
//	for(int i=0; i<score.length; i++) {
//				//i �� 0�̴ϱ� 0���� ���� ���� 0��° �� 3���ϱ� 3�����
//		for(int j=0; j<score[i].length; j++)
//			System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);
////			System.out.print(score[i][j]+" ");
//		System.out.println();
//	}
//	
//	System.out.println("---------------------------");
//	//tmp�� 1��������ü 100 100 100
//	for(int[]tmp:score) { //score �迭�� ���� ������ tmp�� ����
//		for(int i : tmp) { //score 1�� 1������ ���������� ���� 100 100 100 �������� 2�� 1���̷������� 
//			sum+=i; //sum���� ����
//		}
//	}
//		System.out.printf("sum="+sum);
		
		
		
		
		
	
//		//��Ʈ�� Ŭ������ ĳ���͹迭�� ���(�޽��)�� �߰��Ѱ�
//		String src = "ABCDE";
//		
//		for(int i=0; i<src.length(); i++) {
//			char ch = src.charAt(i);//src�� i��° ���ڸ� ch�� ���� ùȸ������1��0�̴ϱ� 0��°
//			//char ch = 'A'; // i=0 �ϳ��� �����
//			System.out.println("src.charAt("+i+"):"+ch);
//		}//String�� char[]�� ��ȯ
//		char[] chArr =src.toCharArray();
//		//char�迭(char[])�� ���
//		//ĳ���͸� �迭�Է��ϸ�ٷ����� �ٸ��͵��� �� ����� ��Ʈ����ߴ�
//		System.out.println(chArr);
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		//����5-13
//		char[] hex = {'C','A','F','E'};//16����
//							//2����
//		String[] binary = {"0000","0001","0010","0011",
//						   "0100","0101","0110","0111",
//						   "1000","1001","1010","1011",
//						   "1100","1101","1110","1111" };
//
//		String result = "";
//		
//		for(int i=0; i<hex.length; i++) {//�迭 hex�� ����� ���ڸ� �ϳ�������

//			if(hex[i]>='0'&&hex[i]<='9') {//
//				result +=binary[hex[i]-'0'];//'8'-'0'�ǰ���� 8�̴�
//				}else {//A~F�̸�
//					result += binary[hex[i]-'A'+10];//'C'-'A'�ǰ���� 2 =12 12��° 2����
//				} //12��°�������� ����Ʈ��
//		}
//		System.out.println("hex : "+ new String(hex)); //String(char[] value)
//		System.out.println("binary : "+result);
		
		
		
		
	
	
//String[] name = {"Kim" ,"Park","Yi"};
//
//for(int i=0; i<name.length; i++) {
//	System.out.println("name["+i+"] :"+name[i]);
//}
//		String tmp = name[2]; //�迭 name�� 3��°��Ҹ� ����������
//		System.out.println("tmp : "+tmp);
//		
//		name[0]="Yu";//�迭 name�� ù������Ҹ� yu�κ���
//		
////		for(int i=0; i<name.length; i++) {
////			System.out.println(name[i]);
//		
//		for(String str : name)//���� ����.. ���������̶� ���� yu park yi�� �ϳ��ϳ�������
//			//�����Ұ��̾����� ���� ��������
//			System.out.println(str);

		
		
		
		
		
		
		
//		int[] numArr = new int[10];//�迭 10
//		int[] counter = new int[10];//�迭 10 �������¿뵵
//		
//		//9ȸ��
//		for(int i=0; i<numArr.length; i++) {
//			numArr[i]=(int)(Math.random()*10);//0~9�Ǽ��� numArr�� ���� �������
//			System.out.print(numArr[i]);// ���
//		}
//		System.out.println();//�ٹٲ�
//		
//		//9ȸ��
//		for(int i=0; i<numArr.length; i++) {
//			counter[numArr[i]]++;//numArr�� �Է¼����� counter[i]i�ش���� ����������
//			//ex)���࿡ numArr[0]��°�濡 9������ 9���Ź濡 ���ϳ� ����
////			System.out.println(">>>" + numArr[i]);//
////			System.out.println(">>" + counter[numArr[i]]);
//		}
//		for(int i=0; i<numArr.length; i++) {
//			System.out.println(i+"�� ���� : " + counter[i]);
//		}
	
//		int[] numArr =new int[10];//�� 10��
//		
//		//�迭�ȿ� 0~9���� ������ �迭���̰� 10�̴ϱ� 
//		for(int i=0; i<numArr.length; i++) {
//			System.out.print(numArr[i]=(int)(Math.random()*10));
//		}
//		System.out.println();
//		//numArr-1��ŭ �ݺ�?
//		for(int i =0; i<numArr.length-1; i++) {
//		//changed�� �޽����Է�
//			boolean changed = false;
//			//num[j]�� num[j+i]���� ũ�� �μ��� ��ȯ��� �̸� �迭ũ�� -i-1��ŭ�ݺ�..
//			for(int j=0; j<numArr.length-1-i; j++) {//9 ����ɶ����� -1 8 .. 7 ..
//				if(numArr[j]>numArr[j+1]) {//�����ǰ���ũ�� ���� �ٲ۴�
//					int temp = numArr[j];
//				numArr[j]=numArr[j+1];
//				numArr[j+1]=temp;
//				//���̹ٲ�� Ʈ��? �ٽ����� �ٲ�� ����ְ�
//				changed=true;
//				}
//			}//ü�������� �ٲ����ʾ����� ������ ���������?�� for���� �������? �ߺ�����
//			if(!changed)break;// ==if(changed != true)
//			//numArr���Էµ� �迭�� 0���� numArr�������
//			for(int k=0; k<numArr.length; k++)
//				System.out.println(numArr[k]);
//			System.out.println();
		
			
	
	
//		int[] code = {-4, -1, 3, 6, 11 };//�迭���� 5
//		int[] arr = new int[10];
//		
//		for(int i=0; i<arr.length; i++) {//10��ȸ�� arr�� 10���ϱ�
//			int tmp = (int)(Math.random()*code.length);//�迭���̰� 5�ϱ� code �迭0~4������ ����
//			arr[i]=code[tmp];//arr�迭�� code�迭��0~4�����Ƿ������ڸ� ����ֱ�
//		
//		}
//		System.out.println(Arrays.toString(arr));
//		
	

		
		
		
		
		
		
		
		
		
//		//45�� �� ����
//		int ball[]=new int [45];
//		// �� �濡�� 1~45����
//		for(int i=0; i<ball.length; i++)
//			ball[i]=i+1;
//		
//		//�� ������ ����
//		int tmp =0;
//		int num =0;
//		
//		//6��°���� ����??
//		for(int i=0; i<6; i++) {
//			num=(int)(Math.random()*45);
		
		
				
			
		
		
		
		
		
		
		
		
//		int sum=0; //����
//		float average=0f;//���
//		//���� �迭
//		int[]score= {100,88,100,100,90};
//		//i�� 0�̰� i�� 
//		for(int i = 0; i<score.length; i++) {
//			sum+=score[i];
//		}
//average=sum/(float)score.length;
//System.out.println("���� : " + sum);
//System.out.println("��� : " + average);
	

