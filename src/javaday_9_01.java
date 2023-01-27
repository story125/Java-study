import java.util.Scanner;

public class javaday_9_01 {
public static void main(String[]  args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달력을 출력할 년, 월: ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		System.out.println("================================");
		System.out.printf("    %4d년 %2d월\n",year,month);
		System.out.println("================================");
		System.out.println("  일  월  화  수  목  금  토 ");
		System.out.println("================================");
	    
//		1일의 요일 만큼 반복하며 빈 칸을 출력한다.
		for(int i =1 ; i<=javaday_9_02.weekday(year, month, 1);i++) {
			System.out.print("    ");
		}
//		1월 부터 달력을 출력할 달의 마지막 날짜 만큼 반복하며 날짜를 출력한다.
		for(int i = 1; i<=javaday_9_02.lastDay(year, month);i++) {
			System.out.printf(" %2d ", i);
			if(javaday_9_02.weekday(year, month, i)== 6) {
				System.out.println();
			}
			
		}
		
		
		
	}
}
