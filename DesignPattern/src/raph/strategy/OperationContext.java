package raph.strategy;


public class OperationContext {
	Operation op=null;

	public OperationContext(String operationType) {
		int operateNum=0;
		if(operationType.equals("+")){
			operateNum=1;
		}else if(operationType.equals("-")){
			operateNum=2;
		}else if(operationType.equals("*")){
			operateNum=3;
		}else if(operationType.equals("/")){
			operateNum=4;
		}	
		switch(operateNum){
		case 1:op = new OperationAdd();break;
		case 2:op = new OperationSub();break;
		case 3:op = new OperationMul();break;
		case 4:op = new OperationDiv();break;
		}
	}
	
	public double getOprateResult(double numberA,double numberB){
		op.setNumberA(numberA);
		op.setNumberB(numberB);
		return op.getResult();
	}
}
