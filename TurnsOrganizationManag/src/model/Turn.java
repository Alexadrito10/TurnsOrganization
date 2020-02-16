
	package model;

	public class Turn {

		private boolean status;
		private char symbol;
		private int number1;
		private int number2;
		public boolean ATTENDED = true;
		public boolean NOT_ATTENDED = false;

		public Turn(char symbol, int number1, int number2) {
			
		}
		public boolean getStatus() {
			return this.status;
		}

		public char getSymbol() {
			return this.symbol;
		}

		public int getNumber1() {
			return this.number1;
		}
		public int getNumber2() {
			return number2;
		}
		

		
	}


