package Mission;

import java.util.Scanner;

public class ChickenMenu {
	public static void main(String[] args) {
		try (// Scanner 객체 생성
				Scanner scanner = new Scanner(System.in)) {
			// 치킨 메뉴판 출력
			printMenu();

			// 주문한 메뉴 개수 초기화
			int order = 0;

			// ----------------------------------------
			// 메뉴 반복
			do {
				// 사용자로부터 메뉴 번호 입력 받으
				System.out.print("********** 번호 :");
				int menuNumber = scanner.nextInt();

				// 메뉴에 대한 정보 출력
				switch (menuNumber) {
				case 0:
					// 0 입력 시 주문한 메뉴 개수와 주문 완료 메시지 출력
					System.out.println("총 " + order + "개의 상품이 주문되었습니다.");
					break;
				case 1:
					// 1 입력

					printMenuInfo("양념 치킨", "매운맛", 15000);
					order++;
					break;
				case 2:
					// 2 입력 
					printMenuInfo("간장 치킨", "달콤한 맛", 16000);
					order++;
					break;
				case 3:
					// 3 입력 
					printMenuInfo("후라이드 치킨", "고소한 맛", 13000);
					order++;
					break;
				default:
					// 0~3 이외의 번호 입력 시 안내 메시지
					System.out.println("(0~3) 사이의 번호를 입력해주세요.");
					break;
				}
			} while (true); // 무한 루프
		}
	}

	// 치킨 메뉴판
	private static void printMenu() {
		System.out.println("********** 치킨 메뉴판 **********");
		System.out.println("1. 황금올리브 반반한 치킨");
		System.out.println("2. 뿌링클 치킨");
		System.out.println("3. 처갓집에서 호식이가 만든 치킨");
		System.out.println("0. 종료");
	}

	// 주문 되었을때 출력
	private static void printMenuInfo(String name, String flavor, int price) {
		System.out.println(name + "이(" + "/가)주문 되었습니다");
	}
}
