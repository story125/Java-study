
public class javaday_5_4 {

	public static void main(String[] args) {
		
//	 while(���ǽ�){
//		������ ���� ���� ������ ����; 
//		...;
//		}
		
		int sum = 0, i=0;
		while(i<100) {
			sum+=++i;
		}
		System.out.println("1~100 �հ�: "+sum);
//		do{
//		������ ���� ���� ������ ����;
//		...;
//		}while(���ǽ�);		// ";"�� �������� �ȵȴ�.
		
		sum = i = 0;		// ������ ������ ���� ����� �� ����.
		
		do {
			sum+=++i;
		}while(i<100);
		System.out.println("1~100 �հ�: "+sum);
		
	}
	
}
