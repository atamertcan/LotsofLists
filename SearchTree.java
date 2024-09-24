public class SearchTree implements NodeList{
    
    private ListItem root;
    
    public SearchTree(ListItem root){
        this.root = root;
    }
    
    @Override
    public ListItem getRoot(){
        return root;
    }

    @Override
    public boolean addItem(ListItem node){
        
        if (root == null){
            root = node;
            return true;
        }
        
        ListItem current = root;
        while(true){
            
            if(current.next() == null){
                
                current.setNext(node);
                return true;
            }
            
            if(current.compareTo(node) == 1){
                
                current.setPrevious(node);
                return true;
            }
            
            current = current.next();
            return false;
        }
    }
