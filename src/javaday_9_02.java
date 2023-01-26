
public class javaday_9_02 {
	//	�μ��� �⵵�� �Ѱܹ޾� ����, ����� �Ǵ��� �����̸� true, ����̸� false�� �����ϴ� �޼ҵ�
	public static boolean isLeapYear(int year) {	
		return year%4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
//	�μ��� ��,���� �Ѱܹ޾� �� ���� ������ ��¥�� �����ϴ� �޼ҵ�
public static int lastDay(int year, int month) {
	
	int m[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	m[2] = isLeapYear(year) ? 29 : 28;
	return m[month];
}
//	�μ��� ��, ��, ���� �Ѱܹ޾� 1�� 1�� 1�� ���� ������ ��¥�� �հ踦 ����� �����ϴ� �޼ҵ�

public static int totalday(int year, int month, int day) {
	
	int sum = (year-1) * 365 + (year-1)/4 - (year-1) /100 + (year-1) / 400 ;
	for(int i =0; i<month;i++) {
		sum+=lastDay(year, i);
	}
	return sum + day;
}
//	�μ��� ��, �� ���� �Ѱܹ޾� ������ ���ڷ� �����ϴ� �޼ҵ�
//	�Ͽ���(0), ������(1) ... �Ͽ���(6)

public static int weekday(int year, int month, int day) {
	return totalday(year, month, day)%7;
}

}
