import java.util.ArrayList;

public class javaday_13_03_ArrayListTest2 {

	public static void main(String[] args) {
		
//		javaday_13_02_Person person1 = new javaday_13_02_Person();
//		System.out.println(person1);
//		javaday_13_02_Person person2 = new javaday_13_02_Person("홍길동",20);
//		System.out.println(person2);
		
		ArrayList<javaday_13_02_Person> list = new ArrayList<javaday_13_02_Person>();
		
		list.add(new javaday_13_02_Person("홍길동",20));	//add(value) :  ArrayList에 value를 맨뒤에 추가한다
		list.add(new javaday_13_02_Person("임꺽정",40));
		list.add(new javaday_13_02_Person("일지매",30));
		list.add(new javaday_13_02_Person("임꺽정",40));	// 중복되는 데이터도 입력된다.
		
		System.out.println(list.size()+" : "+list);		// size() : ArrayList에 저장된 데이터의 개수를 얻어온다.
	
		list.add(1,new javaday_13_02_Person("포청천",48));// add(index, value) :  ArrayList에 index번째 위치에 value를 삽입한다.
		System.out.println(list.size()+" : "+list);		

		System.out.println(list.get(1));				// get(index) : ArrayList에 index번째 위치에 value를 얻어온다.

		list.set(2, new javaday_13_02_Person("춘향",16)); // set(index, value) :  ArrayList에 index번째 위치에 value를 수정한다.
		System.out.println(list.size()+" : "+list);
		
		
		list.remove(2);									// remove(index) : ArrayList에 index번째 위치에 value를삭제한다..
		System.out.println(list.size()+" : "+list);
		
		list.clear();									// clear() : ArrayList에 모든 데이터를 제거한다.
		System.out.println(list.size()+" : "+list);
	}
}
