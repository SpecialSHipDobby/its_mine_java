import com.encore.test.StudentVO ;

public class ReferenceMain {
	
		/*
		 * 기본타입과 참조타입 차이점
		 * 기본타입은 선언과 동시에 값 할당 가능
		 * 기본타입은 값을 담는 변수
		 * 
		 * 그러나
		 * 참조타입은 선언과 동시에 값 할당할 수 없음
		 * 참조타입은 값을 담는 변수가 아닌 주소값을 담는 변수이다
		 	System.out.println(new StudentVO()) ;
		 * 주소값을 담기 위해서는 객체생성이 무조건~ 선행되어야 한다.객체 생성시 사용하는 연산자는 new
		 * new 연산자 뒤에는 생성자(Constructor) 호출
			StudentVO stuObj = new StudentVO() ; 
		 * 
		 * 
		 */
		
	public static void main(String[] args) {
		// 어떤 클래스들이든,,() 접근하고자 한다면 import, 생성자 호출을 통한 인스턴스 생성
		System.out.println(new StudentVO()) ;
		StudentVO stuObj = new StudentVO() ;
		
//		접근제어자가 public 으로 열려있을 때 사용 가능한 코드
//		System.out.println("인스턴스 소유의 변수 호출 : " +stuObj.name);
//		
//		stuObj.name = "포케" ;
//		System.out.println("인스턴스 소유의 변수 호출 : " +stuObj.name);

		
		System.out.println("인스턴스 소유의 메서드 호출 : ");
		//아래가 메서드 호출이다.
		stuObj.setName("섭섭해") ;
		
		String returnValue = stuObj.getName();
		System.out.println(returnValue);
		System.out.println(stuObj.getName());
		
	}

}
