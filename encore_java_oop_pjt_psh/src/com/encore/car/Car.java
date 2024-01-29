package com.encore.car;

import come.encore.car.engine.Engine;

public class Car {
	//아래는 변수선언
	//전역(멤버)변수 스코프는 전역에서 사용 가능한 변수
	private Engine engine ;
	
	// 기본 생성자 정의
	// 생성자는 like a method로서 반환타입이 정의되지 않고 메서드의 이름은 클래스 이름과 동일, 객체 생성시 호출되게 되어있음
	// 1번
	public Car () {
		//engine 객체 만듦
		//car에 엔진이라는 변수가 있는 것임
		engine = new Engine() ;
	}
	public Car(String type) {
		engine = new Engine(type) ;
	}
	public void engineInfo() {
		// info라는 문자열을 return Engine 클래스의 engine을 가져옴,,(이엿나)
		String info = engine.showInfo() ;
		System.out.println(">>>>엔진 정보<<<<");
		System.out.println(info);
		
	}

}
