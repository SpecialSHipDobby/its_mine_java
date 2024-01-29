package com.encore.test;

/*
 * xxx.java , xxxdto.java , xxxEntity.java : 
 * dto : data transportation java
 * 업무 로직이 없고 데이터만 관리하는 클래스로 변수 및 Setter, Getter 관리 역할만 함
 * 
 */

public class StudentVO {
	/*
	 * 변수(Variable)
	 * 구문형식: 접근지정자 변수타입 변수명 ;
	 * 특징 2가지: public, private 
	 * 변수 타입 : 기본 타입, 참조 타입(기본 타입 8개 외의 것들)
	 * 변수명(소문자로 시작해야한다~)
	 * 변수란 선언 위치가 있음
	 * (전역-> 클래스 인사이드, 메서드 아웃사이드 국회의원으로 생각 , 
	 *  지역-> 도/시의원, 접근지정자가 빠짐)
	 */
	
	// 전역변수(클래스내에서 접근가능한 범위를 갖는 것)
	private String 	name ; // 클래스에 변수 하나 정의한 것
	public int 		age ;
	public double 	height ;
	public boolean 	isMarriage ; //is 붙어있으면 논리형이라는 뜻
	
	/*
	 
	1. 생성자
	1.1 구문형식 )
		접근지정자 클래스명([매개변수]) {
		(반환타입이 없음)
	 	 }
	1.2 특징 ) 
		매개변수 없는 생성자는 기본 생성자
		매개변수 있는 생성자는 스페셜 생성자
		명시적으로 생성자가 전의되지 않으면 컴파일 시점에 기본 생성자를 넣어서 컴파일을 진행
	 
	 
	2. 메서드(함수) -> 반환타입으로 void를 가짐
	2.1 구문형식 )
		접근지정자 반환타입(기본/참조타입) 메서드 이름([매개변수]) {
	 	문장;
	 	return(기본값 또는| 참조값)
	 	}
	2.2 특징 : 만약 반환타입이 void가 아니라면 문장이 끝나기 전에 return 키워드를 이용해서 값을 반환
	 	매개변수 : 얘도 지역변수로 봄, 변수 선언 가능
	   

	 - 이들은 데이터를 담는 그릇
	 - 우리가 만든 클래스를 데이터 그릇으로 쓸 수 있따
	 - 참조타입
	 
	- 게터 - 매개변수 안받음
	- 세터 - 매개변수 받음
	 */
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isMarriage() {
		return isMarriage;
	}
	public void setMarriage(boolean isMarriage) {
		this.isMarriage = isMarriage;
	}
	
	
}
