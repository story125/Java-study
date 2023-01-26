import java.util.Random;

public class javaday_6_1 {
// 	lotto 추점기
	public static void main(String[] args) {
		
		
//		추점기를 준비한다
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
		System.out.printf("\n=======================섞기전======================\n");
//		추첨기의 공을 섞는다.
//		lotto [0]에 저장된 값과 lotto[1]~[44] 사이의 랜덤한 위치의 값을 교환한다.
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
		System.out.printf("\n=======================섞은후======================\n");
		
		
		for(int i = 0;i<6;i++) {
//			sleep() : 괄호 안에 지정된 시간(1/1000초) 만큼 프로그램을 잠깐 멈춘다
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
