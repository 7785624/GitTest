import java.util.Arrays;

public class Vv5 {

	public static void main(String[] args) {
		int[][] score= {
							{100,100,100},
							{20,20,20},
							{30,30,30},
							{40,40,40},
							{50,50,50}
		};
		
		int[][] result = new int[score.length+1][score[0].length+1];
		for(int i =0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				result[i][j]=score[i][j];
				
				result[i][result[0].length-1]+=score[i][j];
				result[result.length-1][j]+=score[i][j];
}
		}
		for(int i =0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}
}
	
		
		
		
		
		
		
		
		
//		int[] answer= {1,4,4,3,1,4,4,2,1,3,2};
//		int[] counter = new int[4];
//		//				11��ȸ��
//		for(int i =0; i<answer.length;i++) {
//					//����0��°-1 =0 0��°��ġ ++ ����? �϶�µ�? �׷��Թݺ�?
//			counter[answer[i]-1]++; //1~4�����⶧���� 0~3���θ���
//		}
//			for(int i =0; i<counter.length; i++) {
//				//
//				System.out.print(counter[i]);
//				//
//				for(int j=0; j<counter[i]; j++)
//					System.out.print("*");
//			System.out.println();
//			}
		
		
		
	
		
		
		
		
//		for(int i=0; i<coinUnit.length; i++) {
//			int num=money/coinUnit[i];
//			
//			money%=coinUnit[i];
//			System.out.println(coinUnit[i]+"�� : "+num+"��");
//			
//
//			
//		}
//	
	
	
	
	
//		//������ 1��9������ �ߺ��������� ���ڷ� �̷���� 3�ڸ� ���ڸ� ������
//		//���α׷��̴� (1)~(2)�� �˸����ڵ带 �־� �ϼ�
//		
//		int[] ballArr= {1,2,3,4,5,6,7,8,9};
//		int[] ball3 = new int[3];
//		//�迭 ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
//		for(int i=0; i<ballArr.length; i++) {
//			int j =(int)(Math.random()*ballArr.length);
//			int tmp=0;
//			//(1)
//			tmp=ballArr[i];
//			ballArr[i]=ballArr[j];
//			ballArr[j]=tmp;
//			}
//		System.out.println(Arrays.toString(ballArr));
//		//�迭 ballArr�� �տ��� 3���� ���� �迭 ball3dmfh ����
//		//(2)
//		for(int i =0; i<3; i++)
//			ball3[i]=ballArr[i];
//		
//		for(int i=0; i<ball3.length; i++) {
//			System.out.print(ball3[i]);
//		}
	
	
//		int[][]arr= {
//						{5,5,5,5,5},
//						{10,10,10,10,10},
//						{20,20,20,20,20,20,20},
//						{30,30,30,30,30,30},
//		};
//		int total =0;
//		float average =0.0f;
//		int count=0;
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//			total+=arr[i][j];
//			count++;
//		}
//		}
//		System.out.println(total);
//		average=total/(float)(count);
//		System.out.printf("%.1f",average);
//		