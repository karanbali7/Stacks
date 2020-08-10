import java.util.*;
class stack
{   
    int top;
    static int n=4;
    int a[];
    stack()
    {
        top=-1;
        a = new int[n];    
    }
    
    public void push(int x) 
    { 
        if (top>=(n-1)) 
        { 
            System.out.println("Stack Overflow"); 
        } 
        else 
        { 
            a[++top] = x; 
            System.out.println(x+" pushed into the stack");  
        } 
    } 
    public void pop()
    {
        if (top<0) 
        { 
            System.out.println("Stack Underflow");
        } 
        else { 
            int x = a[top--]; 
            System.out.println(x+" removed from stack"); 
        } 
    }
    public void peek()
    {   
        if (top < 0) 
        { 
            System.out.println("Stack Underflow"); 
        } 
        else 
        { 
              System.out.println(a[top]+" peeked element ");       
        } 
    }

public static void main(String args[])
{
    Scanner sc =new Scanner(System.in);
    stack s=new stack();
    for(int k=0;k<n;k++)
    {
        int y=Integer.parseInt(sc.nextLine());
        s.push(y);
    }
    int i=1;
    System.out.println("Enter pop, peek and push");
    while(i!=0)
    {String ele= sc.nextLine();
    if(ele.equals("pop"))
    {
        s.pop();
    }
    if(ele.equals("peek"))
    {
        s.peek();
    }
    if(ele.equals("push"))
    {
        i=0;
    }
    }
    sc.close();
}

}