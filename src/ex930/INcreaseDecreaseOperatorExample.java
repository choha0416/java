package ex930;
//증감연산자
public class INcreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------------------------------");
		x++;
		++x;
		System.out.println("x= " + x);
		// 앞 뒤에 상관없이 증가가 완료된뒤 프린트 했기때문에 x=12

		
		System.out.println("---------------------------------------");
		y--;
		--y;
		System.out.println("y= " + y);
		//같은 이유료 y=8
		
		
		System.out.println("---------------------------------------");
		z = x++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		/x++는 = 후에 계산하기 때문에 z는 12지만 x는 13이됨
		
		
		System.out.println("---------------------------------------");
		z = ++x;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		//x가 위에서 13인 상태에서 ++x는 = 전에 계산 x와 z 모두 14가됨
		
		System.out.println("---------------------------------------");
		z = ++x + y++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		//x는 14 y는 8로시작 ++x 이기때문에 x = 15 + y++이기때문에 = 이후 증가 15+ 8로 z는 23 x는 15 y는 z값이 나온뒤 증가로 9
	}

}
