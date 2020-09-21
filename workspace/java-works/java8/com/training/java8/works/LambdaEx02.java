package com.training.java8.works;

@FunctionalInterface
interface MathOperation {
	int operation(int num1, int num2);
}

class Add implements MathOperation {

	@Override
	public int operation(int num1, int num2) {
		return num1 + num2;
	}
}

class Substract implements MathOperation {
	@Override
	public int operation(int num1, int num2) {
		return num1 - num2;
	}
}

public class LambdaEx02 {
	public static void main(String[] args) {
		
		MathOperation addition = (int a, int b) -> a + b;
		MathOperation substraction = (a, b) -> a - b;
		MathOperation div = (a, b) -> a/ b; 
		
		System.out.println(operate(10, 20, addition));
		System.out.println(operate(100,50, substraction));
		System.out.println(operate(100, 20, div));
	}

	private static int operate(int i, int j, MathOperation op) {
		return op.operation(i, j);
	}

}
