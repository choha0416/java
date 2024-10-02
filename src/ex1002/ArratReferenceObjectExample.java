package ex1002;
//객체를 참조하는 배열
public class ArratReferenceObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = new String[3];
		strArray[0] = "java"; //0번 인덱스에 java를가진 힙영역의 주소를 생성
		strArray[1] = "java";  // 힙영역을 스캔하여 이미 같은값을 확인하였기때문에 같은주소를 가짐
		strArray[2] = new String("java"); //new로 생성 하였기때문에 새로 java를 힙영역에 저장 위와 다른주소를 가짐
		
		System.out.println(strArray[0]==strArray[1]); //0번과 1번은 같은주소를 가지기 때문에 t
		System.out.println(strArray[0]==strArray[2]); //위와 달리 2는 new를 사용해 개발자가 힙영역에 넣었기 떄문에 주소가 다름
		System.out.println(strArray[0].equals(strArray[2])); // 주소는 다르지만 안에 들은 값이java로 같음 t
	}

}
