import java.util.Scanner;

public class javaday_3_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3���� ������ �Է��ϼ��� : ");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();
		
		int total = java + jsp + spring;
		double avg = (double)total/3;
	
	//	System.out.println("��� ���� : "+avg);
		System.out.printf("��� ���� : %6.2f\n",avg);
		
		if(avg>=90) {
			System.out.println("��");
		}
		else if(80<=avg) {
			System.out.println("��");
		}
		else if(70<=avg) {
			System.out.println("��");
		}
		else if(60<=avg) {
			System.out.println("��");
		}
		else {
			System.out.println("��");
		}
				
	}
}
