import java.util.Scanner;

public class javaday_2_4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String str = sc.nextLine();
		
//		length() : ������ ����� ���ڿ��� �����ϴ� ������ ������ ���´�.
		System.out.println("�Է��� ���ڿ��� ũ�� : "+str.length());
//		trim() : ���ڿ� ��, ���� ���ʿ��� ������ �����Ѵ�. (���̿� �ִ� ������ �Ұ�)
		System.out.println("�Է��� ���ڿ����� ���ʿ��� ������ ������ ���ڿ��� ũ�� : "+str.trim().length());
//		toUpperCase() : �����ڸ� ������ �빮�ڷ� �����Ѵ�.
		System.out.println("������ �빮�ڷ� ���: "+ str.toUpperCase());
//		toLowerCase() : �����ڸ� ������ �ҹ��ڷ� �����Ѵ�.
		System.out.println("������ �ҹ��ڷ� ���: "+ str.toLowerCase());
//		charAt(index) : ���ڿ����� index ��° ���� 1���ڸ� ���´�. ������ ��ġ�� 0�� ° ����
		System.out.println("3��° ����: "+str.charAt(2));
		
		
		sc.close();
		
}
}
