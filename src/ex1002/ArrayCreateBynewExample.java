package ex1002;

public class ArrayCreateBynewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"]: " + arr1[i]); //int형 배열의 초기값=0
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"]: " + arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2["+i+"]: " + arr2[i]); //double형 배열의 초기값 = 0.0
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println("arr2["+i+"]: " + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"]: " + arr3[i]); //string형 배열의 초기값 = null이므로 값을 넣어주면 주소를 저장함
		}
		arr3[0] = "1월"; //힙영역에 1월을 넣고 배열 인덱스 0에는 힙영역안에있는 1월의 주소를 저장
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"]: " + arr3[i]);
		}
		
		
	}

}
