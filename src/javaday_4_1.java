import java.util.Scanner;

public class javaday_4_1 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3���� ������ �Է��ϼ��� : ");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();
		
		int total = java + jsp + spring;
		double avg = (double)total/3;
		
//		key ���� ������ ����ϴ� ���� �Ǵ� ���� ����� ������ ����, �ڹ� 1.7 ���ʹ� ���ڿ��� �����ϴ�.
//		switch(key)
//			case value:		//":"���� �����Ѵ�.
//				key�� value�� ��ġ�� ��� ������ ����;
//				...;
//				[break;]	// if���� ������ ������ ����� {}����� Ż���Ѵ�.
//			...;
//			[default:
//				key�� ��ġ�ϴ� value�� ���� ��� ������ ����;
//				...;
//				break;
		
//		���� �۾��� �ϴ� case�� ������ �� �ִ�.
//		ex) case 100: case99: case98: ... case90:
//		System.out.println("��");
		
		switch((int)avg/ 10) {
		case 10: case 9:
			System.out.println("��");
			break;
		case 8: 
			System.out.println("��");
			break;
		case 7: 
			System.out.println("��");
			break;
		case 6: 
			System.out.println("��");
			break;
		default:
			System.out.println("��");
		}
		
	}
}
