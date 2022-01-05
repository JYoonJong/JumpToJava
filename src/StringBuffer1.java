
public class StringBuffer1 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer(); // append 를 통해서 문자열 추가해 나갈 수 있음.
		sb.append("hello");
		sb.append(" ");
		sb.append("jump to java");
		String result = sb.toString(); // toString 이용
		System.out.println(result);
		
		String result1 = ""; // result1 초기화값을 빈칸으로 지정
		result1 += "hello";
		result1 += " ";
		result1 += "jump to java";
		System.out.println(result1);
		
		
		StringBuilder sb1 = new StringBuilder(); // StringBuffer 보다 StringBuilder 를 사용하는게 좋다.
		sb1.append("Hello");
		sb1.append(" ");
		sb1.append("jump to java");
		String result2 = sb1.toString();
		System.out.println(result2);

		/*StringBuffer sb2 = new StringBuffer();
		sb2.append("jump to java");
		sb2.insert(0."Hello ");
		System.out.println(sb.toString());*/
		
		StringBuffer sb4 = new StringBuffer();
		sb4.append("Hello jump to java");
		System.out.println(sb4.substring(0, 4)); // substring(0,4) = 0부터 4아래 까지의 값 가져오기
		
		
		
	}

}
