package Problem2;

public class Expression implements ArithmeticExpression {
    ArithmeticExpression expression1;
    ArithmeticExpression expression2;
    Operation operation;

    public Expression(ArithmeticExpression i,ArithmeticExpression j,Operation op){
        this.expression1=i;
        this.expression2=j;
        this.operation=op;
    }

    @Override
    public int evaluate() {
        int val=0;
        switch(operation){
            case ADD: 
              val=expression1.evaluate()+expression2.evaluate();
              break;
            case Subtract:
              val=expression1.evaluate()-expression2.evaluate();
              break;
            case Multiply:
              val=expression1.evaluate()*expression2.evaluate();
              break;
            case Divide:
              val=expression1.evaluate()/expression2.evaluate();
              break;
        }
        return val;
    }


    
}
