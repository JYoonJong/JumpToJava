import java.util.HashMap;

public class Map1 {

	public static void main(String[] args) {
		HashMap<String, String> map =new HashMap<>(); //HashMap ��� 
		map.put("people", "���"); // put ��� (key�� , value��)
		map.put("baseball", "�߱�");
		
		System.out.println(map.get("people")); // ��� ���
	
		System.out.println(map.getOrDefault("java","�ڹ�")); // getOrDefault ��� -> �ڹ� ���
		
		System.out.println(map.containsKey("people")); // people �� ���ԵǾ��ִ��� -> true
		
		System.out.println(map.remove("baseball")); // baseball key �� ���� 
		
		System.out.println(map.size()); // baseball �����Ǿ� 1 ��� 
		
		
		map.put("baseball","�߱�1");
		System.out.println(map.keySet()); // Ű���鸸 ��� -> [people . baseball]
	}

}
