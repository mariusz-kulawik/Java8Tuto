package pl.mkulawik.lambda;

import java.io.Serializable;

public class Test implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		Test tester = new Test();

		Operation addition = (a, b) -> a + b;
		Operation subtraction = (a, b) -> a - b;
		Operation multiplication = (a, b) -> a * b;
		Operation division = (a, b) -> a / b;
		Operation exponentation = (a, b) -> {
			int result = 1;
			while (b-- > 0)
			{
				result *= a;
			}
			return result;
		};

		System.out.println("9 + 3 = " + tester.operate(9, 3, addition));
		System.out.println("9 - 3 = " + tester.operate(9, 3, subtraction));
		System.out.println("9 x 3 = " + tester.operate(9, 3, multiplication));
		System.out.println("9 / 3 = " + tester.operate(9, 3, division));
		System.out.println("9 ^ 0 = " + tester.operate(9, 0, exponentation));
		System.out.println("9 ^ 1 = " + tester.operate(9, 1, exponentation));
		System.out.println("9 ^ 2 = " + tester.operate(9, 2, exponentation));
		System.out.println("9 ^ 3 = " + tester.operate(9, 3, exponentation));

		Message message1 = message -> System.out.println("Hello hello " + message);
		Message message2 = (message) -> System.out.println("Hello " + message);

		message1.print("Message1");
		message2.print("Message2");
		message2.print("Message2 again changed");
	}

	interface Operation {
		int operation(int a, int b);
	}

	interface Message {
		void print(String message);
	}

	private int operate(int a, int b, Operation operation) {
		return operation.operation(a, b);
	}
}
