package ex1002;
//배열 복사
public class ArrayCopyByforExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i]+", ");
		}
		
	}

}
//이미 생성된 배열안의 값을 더 큰 공간의 배열로 복사하는 코드
