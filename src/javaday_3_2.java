import java.util.Scanner;

public class javaday_3_2 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����/����� �Ǻ��� �⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
//		���α׷����� ������ ���Ǵ� ���� ������ ������� ����ϸ� ���ϴ�
//		������ ����ϴ� ���� ������ �����ϴ� �޼ҵ��� �̸��� "is"�� �����ϰ� �ϴ� ���� �����̴�.
		boolean isleapYear = year%4 == 0&& year%400 == 0 || year%100 != 0 ; 
		
		
//		�⵵�� 4�� ���� �������� 100���� ���� �������� �ʰų� 400���� ���� �������� ����
		if(isleapYear) {
						System.out.println(year+"���� �����Դϴ�.");
			
		}else
			System.out.println(year+"���� ����Դϴ�.");
		
//		���� ������(���� ������ ?:) 
//		if�� ������ ���� ��� ������ ���� ���� ������ �� ������ ������ ���� 1������ ��� ����ϱ� ���ϴ�.
//		���ǽ� ? ���ǽ��� ���� ��� ������ ���� : ���ǽ��� ������ ��� ������ ����
		System.out.println(year+"���� "+ (isleapYear ? "��" : "��") +"���Դϴ�.");
		
		
		
	}
}
