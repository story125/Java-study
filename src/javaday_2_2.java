import java.util.Scanner;

public class javaday_2_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
//		nextInt�� ���ڸ� �ް� �Ǹ� ���� + ���� Ű�� ���� �� ����Ű�� �߻��ϴ� ���� ������ nextline �κп� ����� ����Ű�� ���۰� ������ ������ ����� �ȴ�.
//		���ڿ��� ������ �����͸� �Է¹��� �� nextline �޼ҵ尡 ������ �Ǿ� �Ѵٸ� Ű���� ������ ����Ű�� �о�帮�� ������ �߻��ȴ�.
//		���ڿ��� ������ �����͸� �Է¹��� �� Ű���� ���۸� ����ִ� ������ �����ϰ�, nextline �޼ҵ带 �����Ѵ�.
		sc.nextLine();
		String name = "";
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();

		
		System.out.println(name+"���� "+age+"�� �Դϴ�.");
		
		sc.close();
}
}
