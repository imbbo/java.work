package chap5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Chap5 {

	public static void main(String[] args) {

		Map<String, Integer> foods = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("*** 음식점 메뉴판 관리 프로그램 ***");

		while (true) {

			System.out.println("# 1. 메뉴 등록");
			System.out.println("# 2. 메뉴 전체보기");
			System.out.println("# 3. 프로그램 종료");
			System.out.print("> ");
			int menu = sc.nextInt();

			System.out.println("--------------------------------");

			if (menu == 1) {
				/*
				 * - 메뉴명과 가격을 입력받아서 Map에 삽입하시면 됩니다. 이미 존재하는 메뉴명이 들어왔다면 '이미 존재하는 메뉴입니다.' 를 출력하시고
				 * 메인 메뉴로 돌아와 주세요. - 메뉴 등록 완료 후 'XXX 메뉴가 등록되었습니다.' 를 출력하세요.
				 */

				System.out.println("메뉴를 입력해주세요: ");
				String name = sc.next();
				System.out.println("가격을 입력해주세요: ");
				Integer price = sc.nextInt();

				if (foods.containsKey(name)) {
					System.out.println("이미 존재하는 메뉴입니다.");
					continue;
				}
				foods.put(name, price);
				System.out.printf("%s(이)가 등록되었습니다.\n", name);
				System.out.println();

			} else if (menu == 2) {
				/*
				 * - 만약 메뉴가 하나도 등록되어 있지 않다면 '메뉴부터 먼저 등록해 주세요!' 출력 후 메인 메뉴로 이동시켜 주세요.
				 * 
				 * - Map의 모든 요소를 반복문을 이용하여 출력해 주세요. ex) 메뉴명 : 가격 메뉴명 : 가격 메뉴명 : 가격....
				 * 
				 * 메뉴를 모두 출력 후에 선택지를 제공하세요. (1. 수정 | 2. 삭제 | 3. 취소) - 수정: 수정할 메뉴명을 입력받아서 가격 수정을
				 * 진행하세요. 없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.
				 * 
				 * - 삭제: 삭제할 메뉴명을 입력받아서 해당 메뉴를 삭제해 주세요. 없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.
				 * 
				 * - 취소: 메인 메뉴로 이동
				 */

				if (foods.size() == 0) {
					System.out.println("메뉴부터 먼저 등록해주세요.");
					System.out.println("-------------------");
					continue;
				} else {
					Set<String> allMenu = foods.keySet();
					for (String s : allMenu) {
						System.out.printf("%s : \t%d원\n", s, foods.get(s));
					}
					System.out.println("1. 수정 ㅣ 2. 삭제 ㅣ 3. 취소");
					System.out.println("> ");
					int check = sc.nextInt();
					if (check == 1) {
						System.out.println("수정하실 메뉴를 적어주세요: ");
						String mdname = sc.next();
						if (foods.containsKey(mdname)) {

							System.out.println("수정하실 가격을 적어주세요: ");
							Integer mdPrice = sc.nextInt();
							foods.put(mdname, mdPrice);
							System.out.println("수정이 완료 됐습니다.");
						} else {
							System.out.println("없는 메뉴입니다.");
							System.out.println();
						}
					} else if (check == 2) {
						System.out.println("삭제하기 원하시는 메뉴를 입력해주세요.");
						String delName = sc.next();
						if (foods.containsKey(delName)) {
							foods.remove(delName);
							System.out.println("메뉴가 삭제 되었습니다.");

						} else {
							System.out.println("없는 메뉴입니다.");

						}
					} else if(check == 3) {
						System.out.println("메뉴로 돌아갑니다.");
						System.out.println();
						continue;
					}

				}

			} else if (menu == 3) {
				/*
				 * - Y / N를 입력받아서 Y가 입력되면 프로그램 종료. 그 이외의 값은 종료 취소를 진행해 주세요.
				 */
				System.out.println("종료를 하시겠습니까? [Y/N]");
				String choice = sc.next();
				if (choice.equals("Y") || choice.equals("y")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else {
					continue;
				}

			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}

		}

	}

}
