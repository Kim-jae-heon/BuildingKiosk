package menuScreen.coffee;

import java.util.Arrays;
import java.util.Scanner;

public class CoffeeMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int price = 0;
		String[][] arr = new String[5][6]; //장바구니
		int numMenu = -1; //메뉴 갯수

		while (flag) {
			int count1 = 1; // 여기 카운트는 아메리카노의 총 수량
			int aPrice = 0;
			String[] aArr = new String[6]; //아메리카노의 정보를 담는 배열

			System.out.println("원하시는 커피를 골라주세요.");
			System.out.println(
					"[0] Americano [1] CaffeLatte [2] Capuuccino [3] Caramel Macchiato [4] ColdBrew [5] Espresso [6] Icecream CaffeLatte [7] Spanish Condensed MilkLatte [8] TiramisuLatte [9] Vanilla CafeLatte");
			System.out.print(">");
			int click = scan.nextInt();
			ex: switch (click) {
			case 0:
				Coffee cf = new Americano();

				System.out.println("원하시는 사이즈를 골라주세요 [0]Regular [1]Large");
				System.out.print(">");
				int touch1 = scan.nextInt();
				cf.size(touch1);

				if (touch1 == 99) {
					break ex;
				} else if (touch1 == 0) {
					aPrice = 4100;
					System.out.println("Regular Size를 선택하셨습니다.");
				} else if (touch1 == 1) {
					aPrice = 4600;
					System.out.println("Large Size를 선택하셨습니다.");
				}
				
				aArr[0] = cf.size(touch1);

				System.out.println("원하시는 커피 온도를 골라주세요 [2]Hot [3]Cold");
				System.out.print(">");
				int touch2 = scan.nextInt();
				cf.temp(touch2);

				if (touch2 == 99) {
					break ex;
				} else if (touch2 == 2) {
					System.out.println("온도는 Hot입니다.");
				} else if (touch2 == 3) {
					System.out.println("온도는 Cold입니다.");
				}
				
				aArr[1] = cf.temp(touch2);

				System.out.println("원하시는 커피 원두를 골라주세요 [4]Balck Ground [5]Aroma Note [6]SWP Decaffeination");
				System.out.print(">");
				int touch3 = scan.nextInt();
				cf.coffeeBean(touch3);

				if (touch3 == 99) {
					break ex;
				} else if(touch3 == 4) {
					System.out.println("원두는 Black Ground입니다.");
				} else if(touch3 == 5) {
					System.out.println("원두는 Aroma Note입니다.");
				} else if(touch3 == 6) {
					System.out.println("원두는 SWP Decaffeination입니다.");
				}
				
				aArr[2] = cf.size(touch3);

				System.out.println("[7]매장 [8]포장 여부를 골라주세요");
				System.out.print(">");
				int touch4 = scan.nextInt();
				cf.pack(touch4);

				if (touch4 == 99) {
					break ex;
				} else if(touch4 == 7) {
					System.out.println("매장을 선택하셨습니다.");
				} else if(touch4 == 8) {
					System.out.println("포장을 선택하셨습니다.");
				}
				
				aArr[3] = cf.size(touch4);

				while (true) {
					System.out.println("현재 아메리카노" + count1 + "잔 입니다.");
					System.out.println("커피 잔 수를 선택해주세요 [9]는 +1잔 [10]은 -1잔이 됩니다. [11]을 누르시면 장바구니에 담습니다.");
					System.out.print(">");
					int touch5 = scan.nextInt();
					cf.num(touch5);

					// 아래 조건문이 없으면 커피의 총량이 늘지 않음.
					if (touch5 == 99) {
						break ex;
					} else if (touch5 == 9) {
						count1++;
					} else if (touch5 == 10) {
						count1--;
					} else if (touch5 == 11) {
						aArr[4] = "" + count1;
						System.out.println("아메리카노" + count1 + "잔을 장바구니에 담습니다.");
						price += count1 * aPrice;
						aArr[5] = "" + price;
						System.out.println("가격은 모두" + price + "원 입니다.");
						System.out.println(Arrays.toString(aArr));
						numMenu++;
						arr[numMenu] = aArr;
						break ex;
					}
					
				}

			case 1:

				break;

			case 2:

				break;

			case 3:

				break;

			case 4:

				break;

			case 5:

				break;

			case 6:

				break;

			case 7:

				break;

			case 8:

				break;

			case 9:

				break;

			case 10:

				break;

			default:
				break;
			}

		}
	}
}
