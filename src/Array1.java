
public class Array1 {

	public static void main(String[] args) {
		int[] odds = {1,3,5,7,9}; // 숫자 배열 생성
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"}; // 문자배열 생성
		
		String[] weeks1 = new String[7]; //배열의 길이를 먼저 설정 한 후 값 대입
		weeks[0] = "월";
		weeks[1] = "화";
		weeks[2] = "수";
		weeks[3] = "목";
		weeks[4] = "금";
		weeks[5] = "토";
		weeks[6] = "일";
		
		String[] weeks2 = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println(weeks2[1]); // 인덱스 1 값 추출
		
		
		for(int i = 0; i< weeks2.length; i++) {
			System.out.println(weeks2[i]); // weeks 배열 출력하는 방법
			
		}
		

	}

}
