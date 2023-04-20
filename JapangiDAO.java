package Japangi;

import java.util.Scanner;

public class JapangiDAO {
	void display(JapangiDTO dto) {

		Scanner sc = new Scanner(System.in);
		System.out.println("돈을 넣으세요");
		for (;;) {
			int coin = Integer.parseInt(sc.nextLine());
			if (coin < dto.Price[0]) {
				System.out.println("잔액이 부족합니다.");
			} else {
				System.out.println("음료선택");
				String bev = sc.nextLine();
				if (bev.equals(dto.bev[0]) & coin >= dto.Price[0]) {
					System.out.println(dto.bev[0] + " 거스름돈 " + (coin - dto.Price[0]) + "원");
				} else if (bev.equals(dto.bev[1]) & coin >= dto.Price[1]) {
					System.out.println(dto.bev[1] + " 거스름돈 " + (coin - dto.Price[1]) + "원");
				} else if (bev.equals(dto.bev[2]) & coin >= dto.Price[2]) {
					System.out.println(dto.bev[2] + " 거스름돈 " + (coin - dto.Price[2]) + "원");
				} else {
					System.out.println("잔액이 부족합니다.");
				}break;
			}
		}
	}
}
