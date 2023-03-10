import java.util.Scanner;
// 요일 계산
public class javaday_5_3 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요일을 계산할 년, 월, 일 : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
//		1년 1월 1일 부터 입력한 년도의 전년도 12월 31일 까지 지난 날짜를 계산한다.
		int sum = (year-1) * 365 + (year-1)/4 - (year-1) /100 + (year-1) / 400 ;
		
//		전년도 12월 31일 까지 지난 날짜수에 올해 전 달 까지 지난 날짜를 더한다.
		int[] m = {31,28,31,30,31,30,31,31,30,31,30,31};
		m[1] =year%4 ==0 && year%100 !=0 || year %400 == 0 ? 28 :29;
		for(int i =1;i<month;i++) {
			/*
			switch(i) {
			case 2:
				sum+=year%4 ==0 && year%100 !=0 || year %400 == 0 ? 28 :29;
				break;
			case 4: case 6: case 9: case 11:
				sum +=30; break;
			default:
				sum+=31;
			}
			*/
			sum+=m[i-1];
		}
		
//		전달 까지 지난 날수에 일을 더한다
		sum +=day;
		System.out.println(sum%7);
//		1년 1월 1일 부터 입력할 날짜까지 지난 날짜의 합계를 7로 나눈 나머지가 요일이다. ex) 0이면 일요일, 1이면 월요일 ...
		
/*		switch(sum%7) {
		case 0: System.out.println("일요일"); break;
		case 1: System.out.println("월요일"); break;
		case 2: System.out.println("화요일"); break;
		case 3: System.out.println("수요일"); break;
		case 4: System.out.println("목요일"); break;
		case 5: System.out.println("금요일"); break;
		case 6: System.out.println("토요일"); break;
		}
	*/	
//		배열을 선언할 때 new를 사용하지 않고 {}안에 초기치를 지정하면 초기치의 개수만큼 자동으로 배열을 만들고 초기치로 초기화 시켜준다.
		String[] week = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		System.out.println(week[sum%7]);
	}
}
