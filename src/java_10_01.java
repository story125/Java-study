import java.util.Scanner;

//		달팽이 채우기
//배열을 Ex)	1	2	3	4	5
//			16	17	18	19	6
//			15	24	25	20	7
//			14	23	22	21	8
//			13	12	11	10	9	순서로 채우기

public class java_10_01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 차수를 홀수로 입력하세요");
		int n = sc.nextInt();
		
		int [][] a = new int[n][n];
//		count: 1에서 25까지 증가하는 변수, i: 행, j: 열, sw: 부호 번경, k: 반복횟수 제어에 사용 
		int count = 0, i = 0, j = -1, sw = 1, k = n;

		while(true) {
//			행 방향 채우기
			for(int p =0; p<k;p++) {
				j+=sw;
				a[i][j] = ++count;
			}
			
		if(--k == 0) {
			break;
		}
//		열 방향 채우기
		for(int p =0; p<k;p++) {
			i+=sw;
			a[i][j] = ++count;
		}
		sw *= -1;
		}
		for(i =0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.printf("%3d ",a[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
