import java.util.Scanner;

public class javaday_2 {

	public static void main(String[] args) {
//		Ű���带 ���ؼ� �����͸� �Է¹޴� ��ĳ��
		Scanner sc = new Scanner(System.in);
//		next(): ���ڿ��� �Է¹޴´�.	���� ������ �Է¹޴´�.
//		nextline(): ���ڿ��� �Է¹޴´�.	�� �� ��ü�� �Է¹޴´�.
//		nextline(): �޼ҵ�� Ű���� ���۰� ������� ��� �Է��� �䱸�ϸ� ����ϰ� Ű���� ���۰� ������� ������ ŵ�� ���� ��ü�� ������
//		�о�帰��.
		String addr = "";
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		addr = sc.nextLine();
		String name = "";
		System.out.println("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		
		System.out.println(name +"���� : "+ addr+"�� ��ϴ�.");
		
		sc.close();	//��ĳ�ʸ� ���� �ʾƵ� �۾��ϴµ� ����� ����
	}
}
