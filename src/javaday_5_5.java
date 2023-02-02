import java.util.Scanner;

public class javaday_5_5 {
	public static void main(String[] args) {
		int menu = 0;
		while(menu!=5) {
		do {
		System.out.println("==========================");
		System.out.println("1.저장 2.보기 3.수정 4.삭제 5.종료 ");
		System.out.println("==========================");
		System.out.println("원하는 메뉴 선택");
		
		Scanner sc = new Scanner(System.in);
		menu = sc.nextInt();
		}while(menu<1 || menu>5);
	
		switch(menu) {
		case 1: System.out.println("입력"); break;
		case 2: System.out.println("보기"); break;
		case 3: System.out.println("수정"); break;
		case 4: System.out.println("삭제"); break;
//		case 5: System.out.println("종료"); 
//		System.exit(0);  		// 프로그램을 강제로 종료한다.
//		break;
		}
		
		}
		
		
	}
}
