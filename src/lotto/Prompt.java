package lotto;

import java.util.Scanner;

public class Prompt {

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

	private void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Lotto lotto = new Lotto();
		int cmd;
		do {
			printMenu();
			cmd = scanner.nextInt();
			switch (cmd) {
			case 1:
				cmdAuto(lotto);
				break;
			case 2:
				cmdMyNum(scanner, lotto);
				break;
			case 3:
				printMenu();
				break;
			}

		} while ((cmd != 0));
		System.out.println("종료");
		scanner.close();

	}

	private void cmdMyNum(Scanner scanner, Lotto lotto) {
		lotto.printMyNumLotto();
	}

	private void cmdAuto(Lotto lotto) {
		lotto.printLotto();
	}

	private void printMenu() {
		System.out.println("+----------------------+");
		System.out.println("| 1. 자동생성");
		System.out.println("| 2. 지정번호 포함 생성");
		System.out.println("| 3. 도움말 0. 종료");
		System.out.println("+----------------------+");
	}

}
