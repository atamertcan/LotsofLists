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

    @Override
    ListItem setPrevious(ListItem leftLink){
        return this.leftLink = leftLink;
    }
    
    @Override
    int compareTo(ListItem other){
        
        int valueInt = Integer.parseInt(String.valueOf(value));
        int otherInt = Integer.parseInt(String.valueOf(other.value));
        
        if(valueInt > otherInt){
            return 1;
        }
        else if (otherInt > valueInt){
            return -1;
        }
        else{
            return 0;
        }
    }
}
