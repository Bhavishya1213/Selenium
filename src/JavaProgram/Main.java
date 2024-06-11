package JavaProgram;
class Main {
	public int addnumber(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		int num1 = 25;
		int num2 = 10;

		Main obj = new Main();
		int result = obj.addnumber(num1, num2);
		System.out.println("Sum is: " + result);
	}

}