import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator; // ctrl +shift + o 

public class ArraysasList1 {

	public static void main(String[] args) {
		String[] data = {"138","129","142" };
		ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));		
		pitches.sort(Comparator.naturalOrder()); // �������� ���� ���
		System.out.println(pitches);

		String[] data1 = new String[] {"140","150","160"};
		String result1 = String.join(",", data1); // �� ����Ʈ�� , �� �߰��ؼ� �����ϴ� ���
		System.out.println(result1);
		
		
	}

}
