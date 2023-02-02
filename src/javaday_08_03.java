//	달력을 출력하는 클래스
public class javaday_08_03 {

	public static void main(String[]  args) {
		
		System.out.println(javaday_08_04.isLeapYear(2023)?"윤년":"평년");
		System.out.println(javaday_08_04.lastDay(2023, 1));
		System.out.println(javaday_08_04.totalday(2023, 1, 25));
	    System.out.println(javaday_08_04.weekday(2023, 1, 25));
	    
	}
}
