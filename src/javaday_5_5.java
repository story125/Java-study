import java.util.Scanner;

public class javaday_5_5 {
	public static void main(String[] args) {
		int menu = 0;
		while(menu!=5) {
		do {
		System.out.println("==========================");
		System.out.println("1.���� 2.���� 3.���� 4.���� 5.���� ");
		System.out.println("==========================");
		System.out.println("���ϴ� �޴� ����");
		
		Scanner sc = new Scanner(System.in);
		menu = sc.nextInt();
		}while(menu<1 || menu>5);
	
		switch(menu) {
		case 1: System.out.println("�Է�"); break;
		case 2: System.out.println("����"); break;
		case 3: System.out.println("����"); break;
		case 4: System.out.println("����"); break;
//		case 5: System.out.println("����"); 
//		System.exit(0);  		// ���α׷��� ������ �����Ѵ�.
//		break;
		}
		
		}
		
		
	}
}
