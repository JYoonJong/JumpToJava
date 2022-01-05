
public class Formating {

	public static void main(String[] args) {
		
		System.out.println(String.format("I eat %d apples",3));  //정수 표현
		
		System.out.println(String.format("I eat %s apples", "five")); //문자열 표현
		
		int number = 3; 
		System.out.println(String.format("I eat %d apples", number)); // int 변수 표현
		
		int number1 = 10;
		String day = "three";
		System.out.println(String.format("I eat %d apples. so I was sick for %s days.", number1, day)); // int 변수  string 변수 표현
		
		System.out.println(String.format("Error is %d%%", 98)); // % 표현
		
		System.out.println(String.format("%10s", "hi")); // 앞에 10칸 띄우기
		
		System.out.println(String.format("%-10sJane", "hi")); // Jane 뒤에 10칸 띄우고 hi 출력
		
		
		System.out.println(String.format("%.2f", 3.42134234)); // 소수점 표현
		
		System.out.println(String.format("I eat %d apples" , 3));
		System.out.printf("I eat %d apples" , 3);      // pritnf 를 사용하면 String format 적을 필요 X
		
		
	}

}
