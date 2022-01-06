import java.util.Arrays;
import java.util.HashSet;

public class Set1 {

	public static void main(String[] args) {
		HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
		HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
		
		HashSet<Integer> cross = new HashSet<>(s1);
		cross.retainAll(s2); // retainAll ��� - > ������
		System.out.println(cross); // [4,5,6] ���
		
		HashSet<Integer> plus = new HashSet<>(s1);
		plus.addAll(s2); // addAll ��� - > ������
		System.out.println(plus); // [1,2,3,4,5,6,7,8,9] ���

		HashSet<Integer> substract = new HashSet<>(s1);
		substract.removeAll(s2); // removeAll -> ������
		System.out.println(substract); // [7,8,9] ���
		
		HashSet<String> set = new HashSet<>();
		set.add("Jump"); // add�� �̿��ؼ� �߰��ϴ� ���
 		set.add("To"); 
		set.add("Java");
		System.out.println(set);
		
		set.addAll(Arrays.asList("number","123")); // �ѹ��� ���� ���ڿ� �߰��ϱ� addAll(Arrays.asList(" " ," "...); 
		System.out.println(set);
		
	
	}

}
