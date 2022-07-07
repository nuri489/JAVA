package Chapter_15;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Test {

	public static void main(String[] args) {
		
		HashMap<String, Employee> map = new HashMap();
		Employee e1 = new Employee(200, "권도연" , 500);
		
		map.put("사원1", new Employee(100, "김기로", 300));
		map.put("사원2", e1);
		
		System.out.println(map.get("사원1"));
		System.out.println(map.get("사원2"));
		
/*		if(map.get("사원2") instanceof Employee)
		{
			System.out.println(((Employee)map.get("사원2")).name);
		}
*/		
		// <String, Employee>로 타입을 명시했으므로 if문 불필요함
		
		map.put("사원2", e1);
		System.out.println(map.get("사원2"));
		
		System.out.println(map.keySet());
		// 키 목록을 출력
		System.out.println(map.values());
		// 저장된 모든 값을 출력
		
		Set keys = map.keySet();
		for(Object o : keys)
		{
			System.out.println(o);
		}
		// HashSet에 key 값들을 저장하고 출력

		for(Object o : keys)
		{
			System.out.println(map.get(o));
		}
		// o에 키 값들이 저장되었으니까 이를 이용하여 값들을 출력
	}

}
