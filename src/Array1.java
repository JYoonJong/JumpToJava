
public class Array1 {

	public static void main(String[] args) {
		int[] odds = {1,3,5,7,9}; // ���� �迭 ����
		String[] weeks = {"��", "ȭ", "��", "��", "��", "��", "��"}; // ���ڹ迭 ����
		
		String[] weeks1 = new String[7]; //�迭�� ���̸� ���� ���� �� �� �� ����
		weeks[0] = "��";
		weeks[1] = "ȭ";
		weeks[2] = "��";
		weeks[3] = "��";
		weeks[4] = "��";
		weeks[5] = "��";
		weeks[6] = "��";
		
		String[] weeks2 = {"��", "ȭ", "��", "��", "��", "��", "��"};
		System.out.println(weeks2[1]); // �ε��� 1 �� ����
		
		
		for(int i = 0; i< weeks2.length; i++) {
			System.out.println(weeks2[i]); // weeks �迭 ����ϴ� ���
			
		}
		

	}

}
