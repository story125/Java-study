
public class javaday_12_01 {


	public static void main(String[] args) { 
		
		
		javaday_12_02 vo1 = new javaday_12_02();
		javaday_12_02 vo2 = new javaday_12_02("ȫ�浿", true, "1�� �Դϴ�.");
		
		System.out.println(vo1);
		System.out.println(vo2.toString());
//		toString: � ��ü�ȿ� ����ִ� ������ ����� �� ���� �޼ҵ�
//		������ ��ü ����� ���� �ϱ� ������ .tostring�� ������ �ʾƵ� �ڵ����� �ִ°ɷ� �����Ѵ�.
		
		javaday_12_02 vo3 = new javaday_12_02("������", false, "�Դϴ�");
		System.out.println(vo3);
		
		
		vo2.count = 100;
		System.out.println(vo3.count);
		
		
		System.out.println(vo2.getName());
		vo2.setName("�Ӳ���");
		System.out.println(vo2.getName());
		
	}


}
