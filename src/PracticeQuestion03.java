import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class PracticeQuestion03 {
	//������ ���� Ŀ�� �� ����
	static void printCoffeePrice(int type) {
		HashMap<Integer,Integer> priceMap = new HashMap<>();
		priceMap.put(1, 3000);
		priceMap.put(2, 4000);
		priceMap.put(3, 5000);
		int price = priceMap.get(type);
		System.out.println(String.format("������ %d�� �Դϴ�.", price));
	}
	
	public static void main(String[] args) {
		// ��� ���� ���ϱ�
		int a = 80;
		int b = 75;
		int c = 55;
		
		System.out.println((a+b+c)/3);
		
		// �ֹε�Ϲ�ȣ ���ڸ� ���ڸ� ������ 	
		String pin = "881120-1068234";
		String yyyyMMdd = pin.substring(0,6);
		String second = pin.substring(7);
		System.out.println(yyyyMMdd);
		System.out.println(second);
		System.out.println(pin.charAt(7));
		// : ǥ�� #���� �����ϱ�
		String d = "a:b:c:d";
		String e = d.replaceAll(":", "#");
		System.out.println(e);
		// 1,3,5,4,2 ���迭�� ����ϱ�
		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,3,5,4,2));
		myList.sort(Comparator.reverseOrder());
		System.out.println(myList);
		// ����Ʈ�� ���ڿ��� ����� ����ϱ�
		ArrayList<String> myList1 = new ArrayList<>(Arrays.asList("Life","is","too","short"));
		String result = String.join(" " , myList1);
		System.out.println(result);
		// B�� ����� �����ϰ� ������ ���
		HashMap<String, Integer> grade = new HashMap<>();
		grade.put("A", 90);
		grade.put("B", 80);
		grade.put("C", 70);
		int result1 = grade.remove("B");
		System.out.println(result1);
		System.out.println(grade);
		// �ߺ��� �����ϱ�
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5));
		HashSet<Integer> temp = new HashSet<>(numbers);
		System.out.println(temp);
		
		//Ŀ�� �� Ȯ�� -> ���� static void Ȯ��
		printCoffeePrice(1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
