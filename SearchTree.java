public class SearchTree implements NodeList{
    
    private ListItem root;
    
    public SearchTree(ListItem root){
        this.root = root;
    }
    
    @Override
    public ListItem getRoot(){
        return root;
    }
