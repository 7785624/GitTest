import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		int count = 0;
		{
			File file = new File("data/data1.txt");
			FileInputStream src = new FileInputStream(file);
			Scanner sc = new Scanner(src);
		
			while(sc.hasNext()) {
				String tmp = sc.next();///������ �ϳ��ϳ� �о���� ����
				System.out.printf("%s " , tmp );
				count++;

			}
			System.out.println("\ncount :" + count);
	
			sc.close();
			src.close();
		
			}
		
		int[] nums = new int[count];
		{
			
			File file = new File("data/data1.txt");

			FileInputStream src = new FileInputStream(file);
			Scanner sc = new Scanner(src);
			
			for(int i = 0; i<count; i++) {
				String tmp = sc.next();
				nums[i]= Integer.parseInt(tmp);

			}
			//System.out.println("num : " + Arrays.toString(nums));
			//�迭���� Ư�� ���� ã��
			
			
				//�ݺ��ؼ� ã�ƾ� �Ѵ�. 88��° ���° �ִ��� ���
			{
				int index = -1;
				for(int i=0; i<count; i++)
					if(88 == nums[i]) {
						index = i;
				break;
			
			}
			System.out.println("index:" + index);
			}
		}
		//index ��ġ ���� >>> 0 <--> 5 ��ġ ��ȯ
		
		{
			int tmp;
			tmp = nums[0];
			nums[0] = nums[5];
			nums[5] = tmp;
			System.out.println("nums : " + Arrays.toString(nums));
		}
		
		//�ݺ������� i <> i+1�� ��ȯ
		{
			for(int i = 0; i<count-1; i++) {
				int tmp;
				tmp = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = tmp;
				
				Thread.sleep(1000);
			
			for(int j=0; j<50; j++)
				System.out.println();
			
			for(int j=0; j<count; j++)
				if(j == i+1 || j == i+0)
					System.out.printf("[%d]", nums[j]);
				else
				System.out.printf("%d", nums[j]);
			
			}
			//System.out.println("after : " + Arrays.toString(nums));
			
		}
	}
}
	


