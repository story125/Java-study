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
		System.out.print("자리 수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();
		System.out.printf("CPU : ");
		for(int i =0;i<level;i++) {
			System.out.print(ball[i]);
		}
		System.out.println();

//		맞출 때 까지 반복한다
		sc.nextLine(); 			// 키보드 버퍼를 비운다. 사용을 안하면 19번째 줄 scanner로 숫자 + 엔터로 생긴 버퍼중에 숫자만 가져가기때문에 31번째 줄 User 입력이 자동으로 한 번 버퍼로 입력이 된다.
		int count = 0;
		while(true) {
			count++;
			System.out.print("USER : ");
			String user = sc.nextLine();
			int s = 0, b = 0;
//			스트라이크와 볼의 개수를 센다.
			for(int i =0;i<level;i++) {
			if(ball[i] == user.charAt(i) - 48) {
				s++;
			}
//			indexof() : 문자열에서 괄호 안의 문자나 문자열이 최초로 나타나는 위츠를 얻어온다. 없으면 -1을 리턴한다.
//			문자열에 특정한 문자 또는 문자열이 포함되어 있는 가를 알 수 있다.
//			System.out.println(user.indexOf(ball[i]+""));
					if(user.indexOf(ball[i]+"") >=0 ) {
						b++;
					}
			
			}
			if(s == level) {
				break;
			}
		System.out.println(s+ " 스트라이크 "+ (b-s) +" 볼");
		
		
		}
 	System.out.println(count + "번 만에 정답");
		
		
		
		
	}
}
