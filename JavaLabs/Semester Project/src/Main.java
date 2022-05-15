public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(5);
        tree.insert(4);
        tree.insert(7);
        tree.insert(9);
        tree.insert(11);
        tree.insert(20);
        tree.insert(19);
    
        
       
        tree.breadthFirstTraversal();

    }
}
