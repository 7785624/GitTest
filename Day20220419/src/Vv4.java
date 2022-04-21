
public class Vv4 {

	public static void main(String[] args) {
		int[]score = {79,88,91,33,100,55,95};
		
		int max = score[0];//배열의 첫번째값(79)으로 초기화
		int min = score[0];//배열이 첫번쨰값(79)으로 초기화
		//배열 두번째부터 읽을려고 i는 1로설정 아마 이미 0값을 넣어서 1부터하는?듯?
		for(int i = 1; i<score.length; i++) {
			if(score[i]>max) {
				max=score[i];
			}else if(score[i]<min) {
				min=score[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
	

}
