import java.util.Scanner;

//		������ ä���
//�迭�� Ex)	1	2	3	4	5
//			16	17	18	19	6
//			15	24	25	20	7
//			14	23	22	21	8
//			13	12	11	10	9	������ ä���

public class java_10_01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ������ Ȧ���� �Է��ϼ���");
		int n = sc.nextInt();
		
		int [][] a = new int[n][n];
//		count: 1���� 25���� �����ϴ� ����, i: ��, j: ��, sw: ��ȣ ����, k: �ݺ�Ƚ�� ��� ��� 
		int count = 0, i = 0, j = -1, sw = 1, k = n;

		while(true) {
//			�� ���� ä���
			for(int p =0; p<k;p++) {
				j+=sw;
				a[i][j] = ++count;
			}
			
		if(--k == 0) {
			break;
		}
//		�� ���� ä���
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
