package StrategyTest;

import Strategy.Model.AddOperation;
import Strategy.Model.MultiplyOperation;
import Strategy.Model.OperationStrategy;

public class OperationsTest {
public static void main(String[] args) {
	OperationStrategy op=new OperationStrategy(new AddOperation());
	op.doOperation(4, 9);
	op.setOperation(new MultiplyOperation());
	op.doOperation(7, 5);
}
}
