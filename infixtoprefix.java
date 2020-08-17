package stack;

import java.util.Stack;

public class InfixToPrefix {

		static int prec(char ch) {
			switch(ch) {
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
			
			}
			return -1;
		}
		static void infixToPrefix(String exp) {
    
			String res="";
			Stack<Character> stack=new Stack<Character>();
			for(int i=0;i<exp.length();i++) {
				char ch=exp.charAt(i);
				if(prec(ch)>0) {
					while(stack.isEmpty()==false && prec(stack.peek())>=prec(ch)) {
						res=res+stack.pop();
					}
					stack.push(ch);
          
				}
				else if(ch==')') {
					char x=stack.pop();
					while(x!='(') {
						res=res+x;
						x=stack.pop();
					}
				}
				else if(ch=='(') {
					stack.push(ch);
				}
				else {
					res=res+ch;
				}
			}
			for(int i=0;i<=stack.size();i++) {
				res=res+stack.pop();
			}
			char ch[]= res.toCharArray();
			System.out.print("Prefix exp: ");
			for(int j=ch.length-1;j>=0;j--)
				System.out.print(ch[j]);
			
			
		}
		
	public static void main(String[] args) {
		String exp="a+b*(c^d-e)^(f+g*h)-i";
		System.out.println("Infix expression: "+exp);
		infixToPrefix(exp);
	}

}