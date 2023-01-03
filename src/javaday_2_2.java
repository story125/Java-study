import java.util.Scanner;

public class javaday_2_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
//		nextInt로 숫자를 받게 되면 숫자 + 엔터 키를 누를 때 엔터키로 발생하는 버퍼 때문에 nextline 부분에 출력은 엔터키로 버퍼가 생성된 공백이 출력이 된다.
//		문자열을 제외한 데이터를 입력받은 후 nextline 메소드가 싱행이 되야 한다면 키보드 버퍼의 엔터키를 읽어드리는 문제가 발생된다.
//		문자열을 제외한 데이터를 입력받은 후 키보드 버퍼를 비워주는 동작을 실행하고, nextline 메소드를 실행한다.
		sc.nextLine();
		String name = "";
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();

		
		System.out.println(name+"님은 "+age+"살 입니다.");
		
		sc.close();
}
}
