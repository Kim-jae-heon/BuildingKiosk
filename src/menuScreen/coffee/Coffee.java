package menuScreen.coffee;

public interface Coffee {

	default public String size(int click) {// 커피 사이즈
		//사이즈 변경 시 가격이 달라져야 함.
		if (click == 0) {
			return "Regular Size";
		} else if (click == 1) {
			return "Large Size";
		}
		return null;
	}

	default public String temp(int click) {// 커피 온도

		if (click == 2) {
			return "Hot";
		} else if (click == 3) {
			return "Cold";
		}
		return null;
	}

	default public String coffeeBean(int click) {// 원두 종류

		if (click == 4) {
			return "Black Ground";
		} else if (click == 5) {
			return "Aroma Note";
		} else if (click == 6) {
			return "SWP Decaffeination";
		}
		return null;
	}

	default public String pack(int click) {// 포장 여부

		if (click == 7) {
			return "매장";
		} else if (click == 8) {
			return "포장";
		}
		return null;
	}

	default public void num(int click) {// 커피 갯수
		int count = 0; //여기 카운트는 갯수만 세는 것
		if (click == 9) {
			count++;
			System.out.println("아메리카노" + count + "잔 추가");
		} else if (click == 10) {
			count--;
			System.out.println("아메리카노" + -count + "잔 감소");
		} 
	}
}
