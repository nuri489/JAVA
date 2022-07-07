package Chapter_15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class HashSet_Test {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add(100);
		set.add(3.14);
		set.add("SET");
		set.add(new Employee(100, "김기로", 300));
		set.add(100);
		
		System.out.println(set.size());
		// 중복된 100은 두번 저장되지 않는다.
		
		System.out.println("셋은 비어있냐? " +set.isEmpty());
		System.out.println("해당 값이 있냐? " + set.contains(100));
	
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		// Iterator 는 저장된 객체를 가져오는 반복자이다.
		// it.hasNext()는 다음 데이터가 존재하면 true 값 리턴
		
		for(Object o : set)
		{
			System.out.println(o);
		}
		// 근데 그냥 for 문 쓰는게 더 간단함

	}

}
