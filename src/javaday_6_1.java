import java.util.Random;

public class javaday_6_1 {
// 	lotto ������
	public static void main(String[] args) {
		
		
//		�����⸦ �غ��Ѵ�
		int[] lotto = new int[45];
		for(int i =0;i<lotto.length;i++) {
			lotto[i]=i+1;
		}
		for(int i =0;i<lotto.length;i++) {
			System.out.printf("%2d ",lotto[i]);
			if((i+1)%10 == 0) {
				System.out.println();
			}
		}
		System.out.printf("\n=======================������======================\n");
//		��÷���� ���� ���´�.
//		lotto [0]�� ����� ���� lotto[1]~[44] ������ ������ ��ġ�� ���� ��ȯ�Ѵ�.
		Random random = new Random();
		for(int i =0; i<100;i++) {
			int r = random.nextInt(44)+1;
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}
		for(int i =0;i<lotto.length;i++) {
			System.out.printf("%2d ",lotto[i]);
			if((i+1)%10 == 0) {
				System.out.println();
			}
		}
		System.out.printf("\n=======================������======================\n");
		
		
		for(int i = 0;i<6;i++) {
//			sleep() : ��ȣ �ȿ� ������ �ð�(1/1000��) ��ŭ ���α׷��� ��� �����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.printf("%2d ",lotto[i]);
		}
	}
}
