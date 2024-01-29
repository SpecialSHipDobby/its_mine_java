
public class StringDemoMain { 
	public static void main(String[] args) {
		// 클래스, 배열, 자료구조, enum etc… 
		// String은 인스턴스 생성없이 사용 가능하지만 객체로 취급됨
		
		
//		String str01 = "임섭순" ;
//		String str02 = "임섭순" ;
		
		
		String str01 = new String("임섭순") ;
		String str02 = new String("임섭순") ;
		
		
		// == : 주소값을 비교하는 연산자
		if (str01 == str02) {
			System.out.println("주소값이 동일합니다");
		} else {
			System.out.println("주소값이 동일하지 않습니다.");
		}
		
		// == : 값을 비교하는 연산자
		if (str01.equals(str02)) {
			System.out.println("값이 동일합니다");
		} else {
			System.out.println("값이 않습니다");

		}
		
	}

}
