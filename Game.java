package pka;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);

	public void printxoTable(char xoArray[][]) {

		System.out.println();
		System.out.print("                                 ");
		System.out.println("______________________");

		for (int i = 0; i < xoArray.length; i++) {
			System.out.print("                                 ");
			for (int j = 0; j < xoArray.length; j++) {

				System.out.print("  " + xoArray[i][j] + " " + "  ");
			}
			System.out.println();
			System.out.print("                                 ");
			System.out.print("______________________");
			System.out.println();
		}
	}

	public int rowValidate(char validate[][],String firstPlayer,String secondPlayer) {
		int count1 = 0;
		int count2 = 0;
		int output = 0;
		for (int i = 0; i < validate.length; i++) {
			count1 = 0;
			count2 = 0;
			for (int j = 0; j < validate.length; j++) {
				if (validate[i][j] == 'X') {
					count1++;
				}
				if (validate[i][j] == 'O') {
					count2++;
				}

			}
			if (count1 == 3) {
				System.out.println(firstPlayer+" is the winner");
				output = 10;
				break;

			}
			if (count2 == 3) {
				System.out.println(secondPlayer+" is the winner");
				output = 10;
				break;

			}

		}
		return output;

	}

	public int columnValidate(char validate[][],String firstPlayer,String secondPlayer) {
		int columnCount1 = 0;
		int columCount2 = 0;
		int output = 0;
		for (int i = 0; i < validate.length; i++) {
			columnCount1 = 0;
			columCount2 = 0;
			for (int j = 0; j < validate.length; j++) {
				if (validate[j][i] == 'X') {
					columnCount1++;
				}
				if (validate[j][i] == 'O') {
					columCount2++;
				}

			}
			if (columnCount1 == 3) {
				System.out.println(firstPlayer+" is the winner");
				output = 10;
				break;

			} else if (columCount2 == 3) {
				System.out.println(secondPlayer+" is the winner");
				output = 10;
				break;
			}

		}
		return output;

	}

	public int crossValidate1(char validate[][],String firstPlayer,String secondPlayer) {
		int countCheck = 0;
		int output = 0;
		for (int i = 0, j = 0; i < validate.length && j < validate.length; j++, i++) {
			countCheck = countCheck + (int) validate[i][j];

		}
		if (countCheck == 237) {
			System.out.println(secondPlayer+"is The winner");
			output = 10;
		} else if (countCheck == 264) {
			System.out.println(firstPlayer+" is the Winner");
			output = 10;
		}
		return output;

	}

	public int crossValidate2(char validate[][],String firstPlayer,String secondPlayer) {

		int countCheck = 0;
		int output = 0;
		for (int i = validate.length - 1, j = 0; i >= 0 && j < validate.length; j++, i--) {
			countCheck = countCheck + (int) validate[i][j];

		}
		if (countCheck == 237) {
			System.out.println(secondPlayer+" is The winner");
			output = 10;
		} else if (countCheck == 264) {
			System.out.println(firstPlayer+" is the Winner");
			output = 10;
		}
		return output;

	}
	public void drawValidation(char validate[][])
	{
		int count=0;
		for(int i=0;i<validate.length;i++)
		{
			for(int j=0;j<validate.length;j++)
			{
				if(validate[i][j]== 'X' || validate[i][j]=='O')
				{
					count++;
				}
			}
		}
		if(count==9)
		{
			System.out.println("Its a Draw! Game Over");
		}
	}

	public void playerOption() {
		char sts[][] = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
		Game obj = new Game();
		System.out.print("                                 ");
		System.out.println("Let's Play X And O");
		obj.printxoTable(sts);
		System.out.println("\nEnter First Player Name");
		String player1 = sc.nextLine();
		System.out.println("\nEnter Second Player Name");
		String player2 = sc.nextLine();
		char player1Sign = 'X';
		char player2Sign = 'O';

		System.out.println(player1 + "  your sign will Be-->" + player1Sign);
		System.out.println(player2 + "  your Sign Will Be--> " + player2Sign);
		System.out.println("Let's Begin");
		int condition = 0;
		int loopCondition = 0;
		int signal = 0;
		do {
            int i=0;
			int choose = 0;
			do {
			try {
			if (signal == 1) {
				System.out.println("already the portion is used choose your valid portion again");
				choose = sc.nextInt();
				signal = 0;
			} else if (signal == 0) {
				if (condition % 2 == 0) {
					System.out.println(player1 + " its your turn");
					choose = sc.nextInt();

				} 
				else if (condition % 2 != 0)
				{
					System.out.println(player2 + " its your turn");
					
				choose = sc.nextInt();
						
						
			}
			}
			}
			catch(Exception e)
			{
				System.out.println("enter valid input");
				i=1;
			}
			}
			while(i!=0);

			switch (choose) {
			case 1:
				if (sts[0][0] != 'X' && sts[0][0] != 'O') {
					if (condition % 2 == 0) {
						sts[0][0] = player1Sign;
						condition++;
						loopCondition++;
					} else if (condition % 2 != 0) {
						sts[0][0] = player2Sign;
						condition++;
						loopCondition++;
					}
				} else {
					signal = 1;
				}
				obj.printxoTable(sts);
				break;
			case 2:
				if (sts[0][1] != 'X' && sts[0][1] != 'O') {
					if (condition % 2 == 0) {
						sts[0][1] = player1Sign;
						condition++;
						loopCondition++;
					} else if (condition % 2 != 0) {
						sts[0][1] = player2Sign;
						condition++;
						loopCondition++;
					}
				} else {
					signal = 1;
				}
				obj.printxoTable(sts);
				break;
			case 3:
				if (sts[0][2] != 'X' && sts[0][2] != 'O') {
					if (condition % 2 == 0) {
						sts[0][2] = player1Sign;
						condition++;
						loopCondition++;
					} else if (condition % 2 != 0) {
						sts[0][2] = player2Sign;
						condition++;
						loopCondition++;
					}
				} else {
					signal = 1;
				}
				obj.printxoTable(sts);
				break;
			case 4:
				if (sts[1][0] != 'X' && sts[1][0] != 'O') {
					if (condition % 2 == 0) {
						sts[1][0] = player1Sign;
						condition++;
						loopCondition++;
					} else if (condition % 2 != 0) {
						sts[1][0] = player2Sign;
						condition++;
						loopCondition++;
					}
				} else {
					signal = 1;
				}
				obj.printxoTable(sts);
				break;
			case 5:
				if (sts[1][1] != 'X' && sts[1][1] != 'O') {
					if (condition % 2 == 0) {
						sts[1][1] = player1Sign;
						condition++;
						loopCondition++;
					} else if (condition % 2 != 0) {
						sts[1][1] = player2Sign;
						condition++;
						loopCondition++;
					}
				} else {
					signal = 1;
				}
				obj.printxoTable(sts);
				break;
			case 6:
				if (sts[1][2] != 'X' && sts[1][2] != 'O') {
					if (condition % 2 == 0) {
						sts[1][2] = player1Sign;
						condition++;
						loopCondition++;
					} else if (condition % 2 != 0) {
						sts[1][2] = player2Sign;
						condition++;
						loopCondition++;
					}
				} else {
					signal = 1;
				}
				obj.printxoTable(sts);
				break;
			case 7:
				if (sts[2][0] != 'X' && sts[2][0] != 'O') {
					if (condition % 2 == 0) {
						sts[2][0] = player1Sign;
						condition++;
						loopCondition++;
					} else if (condition % 2 != 0) {
						sts[2][0] = player2Sign;
						condition++;
						loopCondition++;
					}
				} else {
					signal = 1;
				}
				obj.printxoTable(sts);
				break;
			case 8:
				if (sts[2][1] != 'X' && sts[2][1] != 'O') {
					if (condition % 2 == 0) {
						sts[2][1] = player1Sign;
						condition++;
						loopCondition++;
					} else if (condition % 2 != 0) {
						sts[2][1] = player2Sign;
						condition++;
						loopCondition++;
					}
				} else {
					signal = 1;
				}
				obj.printxoTable(sts);
				break;
			case 9:
				if (sts[2][2] != 'X' && sts[2][2] != 'O') {
					if (condition % 2 == 0) {
						sts[2][2] = player1Sign;
						condition++;
						loopCondition++;
					} else if (condition % 2 != 0) {
						sts[2][2] = player2Sign;
						condition++;
						loopCondition++;
					}
				} else {
					signal = 1;
				}
				obj.printxoTable(sts);
				break;
			default:
				System.out.println("choose valid Portion");
			}

			int loopExit = 0;
			loopExit = obj.rowValidate(sts,player1,player2);
			if (loopExit == 10) {
				loopCondition = 10;
			}
			loopExit = obj.columnValidate(sts,player1,player2);
			if (loopExit == 10) {
				loopCondition = 10;
			}
			loopExit = obj.crossValidate1(sts,player1,player2);
			if (loopExit == 10) {
				loopCondition = 10;
			}
			loopExit = obj.crossValidate2(sts,player1,player2);
			if (loopExit == 10) {
				loopCondition = 10;
			}
			obj.drawValidation(sts);

		} while (loopCondition < 9);

		
	}
	
	/*
	 * public void startGame() {
	 * System.out.println("Are you ready to play the Game");
	 * System.out.println("if you are ready Enter 1 \n Not ready enter 2"); int
	 * input=sc.nextInt();
	 * 
	 * do { new Game().playerOption(); } while(input ==2);
	 * System.out.println("tata! see you again"); }
	 */

	public static void main(String[] args) {

		 new Game().playerOption();
		
	}
}
