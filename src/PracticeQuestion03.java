import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class PracticeQuestion03 {
	//마지막 문제 커피 값 추출
	static void printCoffeePrice(int type) {
		HashMap<Integer,Integer> priceMap = new HashMap<>();
		priceMap.put(1, 3000);
		priceMap.put(2, 4000);
		priceMap.put(3, 5000);
		int price = priceMap.get(type);
		System.out.println(String.format("가격은 %d원 입니다.", price));
	}
	
	public static void main(String[] args) {
		// 평균 점수 구하기
		int a = 80;
		int b = 75;
		int c = 55;
		
		System.out.println((a+b+c)/3);
		
		// 주민등록번호 앞자리 뒷자리 나누기 	
		String pin = "881120-1068234";
		String yyyyMMdd = pin.substring(0,6);
		String second = pin.substring(7);
		System.out.println(yyyyMMdd);
		System.out.println(second);
		System.out.println(pin.charAt(7));
		// : 표시 #으로 변경하기
		String d = "a:b:c:d";
		String e = d.replaceAll(":", "#");
		System.out.println(e);
		// 1,3,5,4,2 역배열로 출력하기
		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,3,5,4,2));
		myList.sort(Comparator.reverseOrder());
		System.out.println(myList);
		// 리스트를 문자열로 만들어 출력하기
		ArrayList<String> myList1 = new ArrayList<>(Arrays.asList("Life","is","too","short"));
		String result = String.join(" " , myList1);
		System.out.println(result);
		// B를 출력후 제거하고 나머지 출력
		HashMap<String, Integer> grade = new HashMap<>();
		grade.put("A", 90);
		grade.put("B", 80);
		grade.put("C", 70);
		int result1 = grade.remove("B");
		System.out.println(result1);
		System.out.println(grade);
		// 중복값 제거하기
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5));
		HashSet<Integer> temp = new HashSet<>(numbers);
		System.out.println(temp);
		
		//커피 값 확인 -> 맨위 static void 확인
		printCoffeePrice(1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
