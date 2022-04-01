public class BasicOperation {
    public static int operation(String a, String b, String op) throws ArithmeticException{
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		int result = 0; 
		try{
			if(op.equals("add")){ result = num1+num2;}
			if(op.equals("subtract")){ result = num1-num2;}
			if(op.equals("multiply")){ result = num1*num2;}
			if(op.equals("divide")){ result = num1/num2;}
				return result;	
		}catch(ArithmeticException arithmetic){
			return Integer.MIN_VALUE;
		}
  }
	
}
