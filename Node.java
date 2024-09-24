public class Node extends ListItem{
    
    public Node(Object value){
        super(value);
    }
    
    @Override
    ListItem next(){
        return rightLink;
    }
