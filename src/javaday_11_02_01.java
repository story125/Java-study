
public class javaday_11_02_01 {

	public static void main(String[] args) {
		
		
		javaday_11_02 vo1 = new javaday_11_02();
		javaday_11_02 vo2 = new javaday_11_02("홍길동", true, "1등 입니다.");
		
		System.out.println(vo1);
		System.out.println(vo2.toString());
	}
}
