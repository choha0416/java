package ex1002;

public class Car1 {
String company = "현대자동차";
String model;
String color;
int maxSpeed;

//생성자
Car1(){
	
}

Car1(String model){
	this.model= model;
}

Car1(String model,String color){
	this.model= model;
	this.color= color;
}

Car1(String model,String color,int maxSpeed){
	this.model= model;
	this.color= color;
	this.maxSpeed=maxSpeed;
}

}
