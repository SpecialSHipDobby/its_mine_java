import com.encore.car.Car;

public class CarMain {
	public static void main(String[] args) {
		// 아래는 참조타입임 기본타입 8개 아니닉가
		// 2번, car 객체 만든 것
		//Car car = new Car()	;
		
		Car car = new Car("가솔린");
		// 4. Car 객체 생성 후 인스턴스 소유의 메서드 호출
		// 카 인스턴스가 소유하고 있는 엔진인포, 리턴값 없고 매개변수 없음
		// 이거 만들엇으면 이제 car에 가서 수정하면 됨
		car.engineInfo() ;
		//수정 테스트
	}

}

