public class Node extends ListItem{
    
    public Node(Object value){
        super(value);
    }
    
    @Override
    ListItem next(){
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem rightLink){
        return this.rightLink = rightLink;
    }
    
    @Override
    ListItem previous(){
        return leftLink;
    }
