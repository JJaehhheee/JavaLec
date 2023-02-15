package chap04_controllStatement;

public class _14_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. for에서의 continue
		for(int i = 0; i < 10; i++) {
			//i가 6일 때 증감식으로 돌아가서 i가 7로 변경된다.
			if(i == 6) {
				continue;
			}
			System.out.println(i);
		}
		
		//2.while에서의 continue
		int num = -1;
		while(++num < 10) {
			if(num == 6) {
				continue;
			}
			System.out.println(num);
		}
		
		
	}

}
