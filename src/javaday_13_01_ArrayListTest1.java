import java.util.ArrayList;

public class javaday_13_01_ArrayListTest1 {

	public static void main(String[] args) {
//		�迭�� �� �� �����ϸ� ���α׷����� ũ�⸦ ������ �� ����.
		int[] data = new int[10];
//		<E> : ���׸��̶� �θ��� ArrayList�� ������ �ڷ����� �ݵ�� Ŭ������ ���´�.
//		ArrayList�� ������ �ڷᰡ �⺻ �ڷ����̶�� �⺻ �ڷ����� Ŭ����ȭ ���ѳ��� ���� Ŭ������  ����Ѵ�.
//		���� Ŭ������ �⺻ �ڷ����� ù ���ڸ� �빮�ڷ� ������ �ǰ� Character�� Integer�� Ǯ������ ����Ѵ�.
		ArrayList<Integer> list = new ArrayList<Integer>();			// JDK 1.5 ������ �ڵ� ���
//		ArrayList<Integer> list = new ArrayList<>();			// JDK 1.7 ������ �ڵ� ���
		
		for(int i=0;i<10;i++) {
			data[i] = i+1;
			list.add(i+1);
		}
		for(int i=0;i<10;i++) {
			System.out.println("data{"+ i + "} = "+ data[i]+", list.get{"+i+"} =" + list.get(i));
		}
		
		
		for(int i=10;i<20;i++) {
			list.add(i+1);
//			data[i] = i+1;
		}
		for(int i=0;i<20;i++) {
//			System.out.println("data{"+ i + "} = "+ data[i]);
			System.out.println("list{"+ i + "} = "+ list.get(i));
	}
}
}
