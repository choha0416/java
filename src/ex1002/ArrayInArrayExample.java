package ex1002;
//배열속 배열
public class ArrayInArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mathScores = new int[2][3]; //2행 3열의 배열 생성
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]= " +mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][]; //생성시엔 2개의 행을가진 1차원배열
		englishScores[0] = new int[2]; //0행에 2개의 열을가진 배열을 생성
		englishScores[1] = new int[3]; //1행에 3개의 열을가진 배열을 생성
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]= " +englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaSocres = {{85,80},{92,96,80}};
		for(int i=0; i<javaSocres.length; i++) {
			for(int k=0; k<javaSocres[i].length; k++) {
				System.out.println("javaSocres["+i+"]["+k+"]= " +javaSocres[i][k]);
			}
		}
	}

}
