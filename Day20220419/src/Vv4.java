
public class Vv4 {

	public static void main(String[] args) {
		int[]score = {79,88,91,33,100,55,95};
		
		int max = score[0];//�迭�� ù��°��(79)���� �ʱ�ȭ
		int min = score[0];//�迭�� ù������(79)���� �ʱ�ȭ
		//�迭 �ι�°���� �������� i�� 1�μ��� �Ƹ� �̹� 0���� �־ 1�����ϴ�?��?
		for(int i = 1; i<score.length; i++) {
			if(score[i]>max) {
				max=score[i];
			}else if(score[i]<min) {
				min=score[i];
			}
		}
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
	}
	

}
