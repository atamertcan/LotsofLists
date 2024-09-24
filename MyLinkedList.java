public class MyLinkedList implements NodeList{
    
    private ListItem root;
    
    public MyLinkedList(ListItem root){
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
                node.setPrevious(current);
                return true;
            }
            
            if(current.compareTo(node) == 1){
                
                root = node;
                root.setNext(current);
                current.setPrevious(root);
                return true;
            }
            return false;
        }
    }

    @Override
    public boolean removeItem(ListItem node) {
        
        if (root == null || node == null) {
            return false;
        }
        while (true) {
            
            if (node.compareTo(root) == 0) {
                
                root.previous().setNext(null);
                return true;
            }
            
            root = root.next();
            
            if (root == null) {
                return false;
            }
        }
    }
