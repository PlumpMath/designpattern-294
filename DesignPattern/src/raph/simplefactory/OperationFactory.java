package raph.simplefactory;

public class OperationFactory {
	
	public static Operation createOperation(String operate){
		Operation oper=null;
		int operateNum;
		if(operate.equals("+")){
			operateNum=1;
		}else if(operate.equals("-")){
			operateNum=2;
		}else if(operate.equals("*")){
			operateNum=3;
		}else if(operate.equals("/")){
			operateNum=4;
		}else {
			return null;
		}
		switch(operateNum){
		case 1:oper = new OperationAdd();break;
		case 2:oper = new OperationSub();break;
		case 3:oper = new OperationMul();break;
		case 4:oper = new OperationDiv();break;
		}
		return oper;
	}

}
