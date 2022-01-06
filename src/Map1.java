import java.util.HashMap;

public class Map1 {

	public static void main(String[] args) {
		HashMap<String, String> map =new HashMap<>(); //HashMap 사용 
		map.put("people", "사람"); // put 사용 (key값 , value값)
		map.put("baseball", "야구");
		
		System.out.println(map.get("people")); // 사람 출력
	
		System.out.println(map.getOrDefault("java","자바")); // getOrDefault 사용 -> 자바 출력
		
		System.out.println(map.containsKey("people")); // people 이 포함되어있는지 -> true
		
		System.out.println(map.remove("baseball")); // baseball key 값 삭제 
		
		System.out.println(map.size()); // baseball 삭제되어 1 출력 
		
		
		map.put("baseball","야구1");
		System.out.println(map.keySet()); // 키값들만 출력 -> [people . baseball]
	}

}
