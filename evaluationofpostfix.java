package stack;

import java.util.Stack;

public class EvaluatePostfix {

	static int evaluate(String ele) {
  
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<ele.length();i++) {
			char c= ele.charAt(i);
			if(Character.isDigit(c)) {
      
				stack.push(c - '0');
			}
			else {
      
				int a1 = stack.pop();
				int b2 = stack.pop();
				switch(c)
				{
				case '+':
					stack.push(b2+a1);
					break;
				case'-':
					stack.push(b2-a1);
					break;
				case '*':
					stack.push(b2*a1);
					break;
				case '/':
					stack.push(b2/a1);
				break;
				}
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
  

		String exp="231*+9-";
		System.out.println("Postfix expression: "+exp);
		System.out.println("After Evaluation expression is: "+evaluate(exp));
	}

}