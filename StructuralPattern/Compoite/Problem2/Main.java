package Problem2;

public class Main{
  public static void main(String[] args) {
      ArithmeticExpression num1=new Number(5);
      ArithmeticExpression num2=new Number(7);
      ArithmeticExpression num3=new Number(6);
      ArithmeticExpression exp1=new Expression(num2,num3,Operation.ADD);
      ArithmeticExpression exp2=new Expression(num1,exp1,Operation.Multiply);
      int res=exp2.evaluate();
      System.out.println(res);

  }
}