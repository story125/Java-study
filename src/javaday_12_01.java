
public class javaday_12_01 {


	public static void main(String[] args) { 
		
		
		javaday_12_02 vo1 = new javaday_12_02();
		javaday_12_02 vo2 = new javaday_12_02("홍길동", true, "1등 입니다.");
		
		System.out.println(vo1);
		System.out.println(vo2.toString());
//		toString: 어떤 객체안에 들어있는 내용을 출력할 때 쓰는 메소드
//		하지막 객체 출력은 자주 하기 때문에 .tostring을 붙이지 않아도 자동으로 있는걸로 간주한다.
		
		javaday_12_02 vo3 = new javaday_12_02("성춘향", false, "입니다");
		System.out.println(vo3);
		
		
		vo2.count = 100;
		System.out.println(vo3.count);
		
		
		System.out.println(vo2.getName());
		vo2.setName("임꺽정");
		System.out.println(vo2.getName());
		
	}


}
