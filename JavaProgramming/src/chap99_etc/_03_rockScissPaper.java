package chap99_etc;

import java.util.Scanner;

import chap99_etc.games.RockScissPaper;

public class _03_rockScissPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("가위, 바위, 보 게임입니다.");
			System.out.print("진행하시려면 1, 종료하시려면 2를 입력하세요.");
			int selector = sc.nextInt();
			
			if(selector == 1) {
				RockScissPaper rsp = new RockScissPaper();
				
				rsp.start();
			} else if(selector == 2) {
				break;
			}
		}
		
		
		
		
		
	}

}