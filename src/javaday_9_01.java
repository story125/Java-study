import java.util.Scanner;

public class javaday_9_01 {
public static void main(String[]  args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�޷��� ����� ��, ��: ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		System.out.println("================================");
		System.out.printf("    %4d�� %2d��\n",year,month);
		System.out.println("================================");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  �� ");
		System.out.println("================================");
	    
//		1���� ���� ��ŭ �ݺ��ϸ� �� ĭ�� ����Ѵ�.
		for(int i =1 ; i<=javaday_9_02.weekday(year, month, 1);i++) {
			System.out.print("    ");
		}
//		1�� ���� �޷��� ����� ���� ������ ��¥ ��ŭ �ݺ��ϸ� ��¥�� ����Ѵ�.
		for(int i = 1; i<=javaday_9_02.lastDay(year, month);i++) {
			System.out.printf(" %2d ", i);
			if(javaday_9_02.weekday(year, month, i)== 6) {
				System.out.println();
			}
			
		}
		
		
		
	}
}
