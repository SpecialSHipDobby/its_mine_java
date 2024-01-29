
public class EncoreMain {
	
	// byte -> short -> int -> long -> float -> double(묵시적 형변환)
	//		   char -> (캐릭터는 int 형으로 자동 형변환됨)
	// byte <- short <- int <- long <- float <- double(명시적 형변환)
	// 명시적 형변환(캐스팅)
	
	public static void main(String[] args) {
		System.out.println("섭섭님과 함께하는 즐거운^0^ Java");
		
		// 지역변수는 메서드 내에 선언하는 변수
		long intValue = 10 ;
		
		char charValue = 'M'; // '' : 문자열 담을 수 있음
		
		float doubleValue = 3.14f ;
		
		String stringvalue = "소ㅂ소" ;
		boolean booleanValue = false ;
		
		System.out.println("정수값 : " + intValue);
		System.out.println("문자값 : " + charValue);
		System.out.println("실수값 : " + doubleValue);
		System.out.println("문자값 : " + intValue);
		System.out.println("문자열값 : " + stringvalue);
		System.out.println("논리값 : " + booleanValue);
				}

}
