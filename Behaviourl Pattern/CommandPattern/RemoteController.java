import java.util.Stack;

public class RemoteController {
    ICommand ic;
    Stack<ICommand> st=new Stack<>();

    public void setCommand(ICommand ic){
        this.ic=ic;
        st.push(ic);
    }

    public void pressButton(){
        ic.execute();
    }

    public void undo(){
        if(st.size()!=0){
            ICommand lastCommand=st.peek();
            lastCommand.undo();
            st.pop();
        }
    }
}
