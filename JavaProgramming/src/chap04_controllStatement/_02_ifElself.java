package chap04_controllStatement;

public class _02_ifElself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 입력받은 영문자의 대소문자 판별
		System.out.print("영문자 하나를 입력하세요. : ");
		int asciiCode = System.in.read();
				
		if(asciiCode >= 65 && asciiCode <= 90)
		System.out.println("대문자입니다.");
		else if(asciiCode >= 97 && asciiCode <= 122)
		System.out.println("소문자입니다.");
		//산술 -> 관계 -> 논리
		/*else if(asciiCode < 65 || (asciiCode > 90 && asciiCode < 97) ||
				asciiCode > 122)
		System.out.println("잘못 입력하셨습니다.");*/
		else 
		System.out.println("잘못 입력하셨습니다.");
				
	}

}
