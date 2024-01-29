
public class CastingMain {

	public static void main(String[] args) {
		// 자바의 캐스팅 연산자 : (캐스팅하고자 하는 타입)변수명 ;
		// 명시적 캐스팅 : 큰 타입을 작은 타입으로 바꿔내는 것
		
		byte x , y , sum ; // 변수 선언
		x = 10 ;
		y = 10 ;
		sum = (byte)(x + y) ;
		
		System.out.println("sum = " +sum);
		
		System.out.println();
		System.out.println();
		
		char charValue = 'A' ;
		char charValue02 = 'B' ;
		System.out.println("char value = " +charValue);
		
		// 다운캐스팅
		System.out.println((char)(97));
		
	}

}
