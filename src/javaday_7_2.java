import java.util.Scanner;

public class javaday_7_2 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 13자리를'-' 없이 입력하세요: ");
		String jumin = sc.nextLine();
		
//		i :         0 1 2 3 4 5 6   7 8 9 10 11 12
//		주민등록번호 : 8 3 0 4 2 2 1	1 8 5 6 0 0 
//					* * * * * * *   * * * * * 
//		가중치 :		2 3 4 5 6 7 8   9 2 3 4 5
//					= = = = = = =   = = = = = 
//					16 + 9 + 0 + 20 + 12 + 14 + 8 + 9 + 16+ 15 + 24 + 0 = 	143	
//		143 % 11 = 0	11 - 0 = 11		11에서 나머지를 뺀 결과가 2자리 숫자면 10자리는 버리고 1자리만 취한다.
//				   1	11 - 1 = 10
//		           2	11 - 2 = 9
//		           10	11 - 10 = 1
	
		
		String check = "234567892345";
	int sum = 0;
	for(int i = 0; i<12;i++) {
//		문자를 곱셈 연산하면 문자의 유니 코드 값으로 곱한다.
//		sum += (jumin.charAt(i)-48) * (check.charAt(i)- '0');
		sum += (jumin.charAt(i)-48) * (i<8? i + 2 : i-6);
	}
	int result = (11 - sum % 11) % 10; 
	if(result == jumin.charAt(12)-48) {
		System.out.println("정상");
	}else
		System.out.println("오류");
	
	}
}
