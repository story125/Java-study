
public class javaday_5_4 {

	public static void main(String[] args) {
		
//	 while(조건식){
//		조건이 참인 동안 실행할 문장; 
//		...;
//		}
		
		int sum = 0, i=0;
		while(i<100) {
			sum+=++i;
		}
		System.out.println("1~100 합계: "+sum);
//		do{
//		조건이 참인 동안 실행할 문장;
//		...;
//		}while(조건식);		// ";"을 빼먹으면 안된다.
		
		sum = i = 0;		// 변수를 선언할 때는 사용할 수 없다.
		
		do {
			sum+=++i;
		}while(i<100);
		System.out.println("1~100 합계: "+sum);
		
	}
	
}
