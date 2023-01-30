
public class javaday_2_3 {
	public static void main(String[] args) {
			
//		클래스로 만드는 모든 객체(변수)는 주소를 기억하는 참조형 변수이다.
//		문자열이 최초로 만들어지면 메모리 어딘가에 문자열이 생성되고 문자열이 생성된 주소값이 변수에 저장된다.
		String str1 = "AAA";	// str1에는 "AAA"가 생성된 메모리에 주소가 저장된다.
//		메모리에 같은 내용의 문자열이 있으면 다시 만들지 않고 기존에 있는 문자열의 주소값이 변수에 저장된다.
		String str2 = "AAA";	// str2에는 str1에 저장된 "AAA"의 메모리의 주소가 저장된다. 
		
//		관계 연산자 : 연산 결과는 true or false 
//		>(크다, 초과), >=(크거나 같다, 이상), <(작다, 미만), <=(작거나 같다, 이하), ==(같다), !=(같지 않다)
//		==를 사용해서 같은가 비교할 수 있는 데이터는 기본 자료형과 NULL(아무겂도 없는 상태)만 가능하다.
		
//		논리 연산자		
//		&&: 논리곱, AND, 두 조건이 모두 참일 경우에만 참		
//		:: : 논리합, OR, 두 조건중 한 개 이상 참일 경우에 참. 
//		! : 논리 부정, NOT, 
		
//		
//		if(조건식){
//		 조건식이 참일 경우 실행할 문장;
//		 ...;
//		} else{
//		 조건식이 거짓일 경우 실행할 문장;
//		 ...;
//		}
		
//		"=="을 사용해서 비교했으므로 변수에 저장된 문자열 자체를 비교하는게 아니라 
//		변수에 저장된 주소를 비교하게 된다.
		if(str1 == str2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}

//		new라는 예악어를 사용해서 객체를 생성하게되면 메모리에 같은 내용이 있나 상관하지 않고 무조건 다시 만든다.
//		따라서 새로운 주소에 저장이 된다. 
		String str3 = new String("AAA");

		if(str1 == str3) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
//		문자열을 비교하려 하는 경우 반드시 equals() 메소드를 사용해서 비교해야 한다.
		if(str1.equals(str3)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
	}
}
