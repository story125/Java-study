import java.util.Scanner;

public class javaday_3_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3과목 점수를 입력하세요 : ");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();
		
		int total = java + jsp + spring;
		double avg = (double)total/3;
	
	//	System.out.println("평균 점수 : "+avg);
		System.out.printf("평균 점수 : %6.2f\n",avg);
		
		if(avg>=90) {
			System.out.println("수");
		}
		else if(80<=avg) {
			System.out.println("우");
		}
		else if(70<=avg) {
			System.out.println("미");
		}
		else if(60<=avg) {
			System.out.println("양");
		}
		else {
			System.out.println("가");
		}
				
	}
}
