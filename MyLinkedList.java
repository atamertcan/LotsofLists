public class MyLinkedList implements NodeList{
    
    private ListItem root;
    
    public MyLinkedList(ListItem root){
        this.root = root;
    }
    
    @Override
    public ListItem getRoot(){
        return root;
    }
