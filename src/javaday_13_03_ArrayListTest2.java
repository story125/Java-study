import java.util.ArrayList;

public class javaday_13_03_ArrayListTest2 {

	public static void main(String[] args) {
		
//		javaday_13_02_Person person1 = new javaday_13_02_Person();
//		System.out.println(person1);
//		javaday_13_02_Person person2 = new javaday_13_02_Person("ȫ�浿",20);
//		System.out.println(person2);
		
		ArrayList<javaday_13_02_Person> list = new ArrayList<javaday_13_02_Person>();
		
		list.add(new javaday_13_02_Person("ȫ�浿",20));	//add(value) :  ArrayList�� value�� �ǵڿ� �߰��Ѵ�
		list.add(new javaday_13_02_Person("�Ӳ���",40));
		list.add(new javaday_13_02_Person("������",30));
		list.add(new javaday_13_02_Person("�Ӳ���",40));	// �ߺ��Ǵ� �����͵� �Էµȴ�.
		
		System.out.println(list.size()+" : "+list);		// size() : ArrayList�� ����� �������� ������ ���´�.
	
		list.add(1,new javaday_13_02_Person("��ûõ",48));// add(index, value) :  ArrayList�� index��° ��ġ�� value�� �����Ѵ�.
		System.out.println(list.size()+" : "+list);		

		System.out.println(list.get(1));				// get(index) : ArrayList�� index��° ��ġ�� value�� ���´�.

		list.set(2, new javaday_13_02_Person("����",16)); // set(index, value) :  ArrayList�� index��° ��ġ�� value�� �����Ѵ�.
		System.out.println(list.size()+" : "+list);
		
		
		list.remove(2);									// remove(index) : ArrayList�� index��° ��ġ�� value�������Ѵ�..
		System.out.println(list.size()+" : "+list);
		
		list.clear();									// clear() : ArrayList�� ��� �����͸� �����Ѵ�.
		System.out.println(list.size()+" : "+list);
	}
}
