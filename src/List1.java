import java.util.ArrayList;
import java.util.Arrays;

public class List1 {

	public static void main(String[] args) {
		//ArrayList
		ArrayList<String> pitches = new ArrayList<>(); //<string> �ٿ�����   
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		pitches.add(0, "140"); // �Ǿտ� 140 ����
		
		System.out.println(pitches.get(2)); // 2��° �� ���
		System.out.println(pitches.size()); // ��� ����
		
		System.out.println(pitches.remove("129"));
		System.out.println(pitches.remove(0));
		
		System.out.println(pitches);
		
		
	}

}
