public class Main {

    public static void main(String[] args) {

        BinarySearchTree.insert(5);
        BinarySearchTree.insert(4);
        BinarySearchTree.insert(7);
    
        System.out.println(BinarySearchTree.root.value);
        System.out.println(BinarySearchTree.root.rightChild.value);
        System.out.println(BinarySearchTree.root.leftChild.value);

    }
}
