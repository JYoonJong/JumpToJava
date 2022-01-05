import java.util.ArrayList;
import java.util.Arrays;

public class List1 {

	public static void main(String[] args) {
		//ArrayList
		ArrayList<String> pitches = new ArrayList<>(); //<string> 붙여야함   
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		pitches.add(0, "140"); // 맨앞에 140 삽입
		
		System.out.println(pitches.get(2)); // 2번째 값 출력
		System.out.println(pitches.size()); // 담긴 갯수
		
		System.out.println(pitches.remove("129"));
		System.out.println(pitches.remove(0));
		
		System.out.println(pitches);
		
		
	}

}
