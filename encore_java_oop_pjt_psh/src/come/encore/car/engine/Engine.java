package come.encore.car.engine;

public class Engine {
	//전역변수
	private String engineType ;
	
	//3번
	// 생성자 중복 2개는 에러
	// 생성자 또는 메서드는 매개변수의 타입과 개수를 달리해서 재 정의 할 수 있다. 이를 생성자 오버로딩, 메서드 오버로딩이라고 함	
	// 생성자는 매개변수로 받은 값을 전역(멤버)변수에 할당하는 역할을 함
	public Engine() {
	}
	// ()이 인자에 들어오는걸 전역 변수(engineType)를 재정의 하는 역할을 함
	public Engine(String engineType) {
		// 선언위치 다르면 동일 클래스 내에서 같은 변수 이름 사용 가능
		// 우선권은 지역변수가 가짐
		// 얘는 지역변수 위에껀 전역변수
		// this.키워드를 주면 각각의 단어가 무슨 뜻인지 알려줌
		this.engineType = engineType ;
		
	}
	
	public String showInfo() {
		return "엔진의 타입은 " +engineType+" 입니다." ;
	}

}
