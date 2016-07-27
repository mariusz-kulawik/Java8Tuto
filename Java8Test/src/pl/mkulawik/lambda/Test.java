package pl.mkulawik.lambda;

public class Test {
	public static void main(String args[]) {
		Test tester = new Test();

		Operation addition = (int a, int b) -> a + b;
		Operation subtraction = (a, b) -> a - b;
		Operation multiplication = (a, b) -> a * b;
		Operation division = (a, b) -> a / b;

		System.out.println("9 + 3 = " + tester.operate(9, 3, addition));
		System.out.println("9 - 3 = " + tester.operate(9, 3, subtraction));
		System.out.println("9 x 3 = " + tester.operate(9, 3, multiplication));
		System.out.println("9 / 3 = " + tester.operate(9, 3, division));

		Message message1 = message -> System.out.println("Hello hello " + message);
		Message message2 = (message) -> System.out.println("Hello " + message);

		message1.print("Message1");
		message2.print("Message2");
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
