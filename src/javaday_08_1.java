import java.lang.reflect.Method;

//		메인 클래스
public class javaday_08_1 {

	public static void main(String[] args) {
		
//		total 메소드는 javaday_08_02클래스에 정의된 메소드이기 때문에 클래스의 객체를 생성해야한다.
//		생성하지 않고 total(); 메소드로 사용을 하려면 static을 사용하여 정적 메소드로 만들어야 한다.
//		javaday_08_02 javaday_08_02 = new javaday_08_02();
		System.out.println("1~ 100 합: "+javaday_08_02.total());
		
//		static 사용하면 클래스 객체 생성은 하지 않지만, 출력은 "클래스.메소드" 로 호출한다.
		System.out.println("1~ 100 합: "+javaday_08_02.total());
		
		
	}
}
