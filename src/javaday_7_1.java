import java.util.Random;
import java.util.Scanner;

public class javaday_7_1 {

	public static void main(String[] args) {
		
		
		int[] ball = {0,1,2,3,4,5,6,7,8,9};
		Random random = new Random();
		for(int i =0;i<10000;i++) {
			
		int r = random.nextInt(9)+1;
		int temp = ball[0];
		ball[0] = ball[r];
		ball[r] = temp;
		}
		System.out.print("�ڸ� ���� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();
		System.out.printf("CPU : ");
		for(int i =0;i<level;i++) {
			System.out.print(ball[i]);
		}
		System.out.println();

//		���� �� ���� �ݺ��Ѵ�
		sc.nextLine(); 			// Ű���� ���۸� ����. ����� ���ϸ� 19��° �� scanner�� ���� + ���ͷ� ���� �����߿� ���ڸ� �������⶧���� 31��° �� User �Է��� �ڵ����� �� �� ���۷� �Է��� �ȴ�.
		int count = 0;
		while(true) {
			count++;
			System.out.print("USER : ");
			String user = sc.nextLine();
			int s = 0, b = 0;
//			��Ʈ����ũ�� ���� ������ ����.
			for(int i =0;i<level;i++) {
			if(ball[i] == user.charAt(i) - 48) {
				s++;
			}
//			indexof() : ���ڿ����� ��ȣ ���� ���ڳ� ���ڿ��� ���ʷ� ��Ÿ���� ������ ���´�. ������ -1�� �����Ѵ�.
//			���ڿ��� Ư���� ���� �Ǵ� ���ڿ��� ���ԵǾ� �ִ� ���� �� �� �ִ�.
//			System.out.println(user.indexOf(ball[i]+""));
					if(user.indexOf(ball[i]+"") >=0 ) {
						b++;
					}
			
			}
			if(s == level) {
				break;
			}
		System.out.println(s+ " ��Ʈ����ũ "+ (b-s) +" ��");
		
		
		}
 	System.out.println(count + "�� ���� ����");
		
		
		
		
	}
}
