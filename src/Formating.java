
public class Formating {

	public static void main(String[] args) {
		
		System.out.println(String.format("I eat %d apples",3));  //���� ǥ��
		
		System.out.println(String.format("I eat %s apples", "five")); //���ڿ� ǥ��
		
		int number = 3; 
		System.out.println(String.format("I eat %d apples", number)); // int ���� ǥ��
		
		int number1 = 10;
		String day = "three";
		System.out.println(String.format("I eat %d apples. so I was sick for %s days.", number1, day)); // int ����  string ���� ǥ��
		
		System.out.println(String.format("Error is %d%%", 98)); // % ǥ��
		
		System.out.println(String.format("%10s", "hi")); // �տ� 10ĭ ����
		
		System.out.println(String.format("%-10sJane", "hi")); // Jane �ڿ� 10ĭ ���� hi ���
		
		
		System.out.println(String.format("%.2f", 3.42134234)); // �Ҽ��� ǥ��
		
		System.out.println(String.format("I eat %d apples" , 3));
		System.out.printf("I eat %d apples" , 3);      // pritnf �� ����ϸ� String format ���� �ʿ� X
		
		
	}

}
