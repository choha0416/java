package ex1007;
//다른 생성자 생성 코드 줄이기
public class Car {
String company = "현대자동차"; //명시적 초기화
String model; //생성자 초기화
String color; //생성자 초기화 
int maxSpeed; //생성자 초기화

//생성자
Car(){
	
}

Car(String model){
	this(model,null,0);
}

Car(String model,String color){
	this(model,color,0);
}

Car(String model,String color,int maxSpeed){
	this.model= model;
	this.color= color;
	this.maxSpeed=maxSpeed;
}

}
