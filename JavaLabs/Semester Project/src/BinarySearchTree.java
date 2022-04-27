
class Node {
    int value;
    Node leftChild;
    Node rightChild;

    Node(int value){
        this.value = value;
    }
    
}

public class BinarySearchTree {
// a method that checks if left is empty if value < focus and chekcs if right is empty if calue > focus

    static Node root;
    public static void insert (int num){

        Node toInsert = new Node (num);

        if (root == null){  //checks if tree is empty
            root = toInsert;
        } else{ //another method to sort through and add the new node
            sort(root, toInsert);
        }

    }
        
    public static void sort(Node focus, Node toInsert){
    
        if (toInsert.value >focus.value){ 
            if (focus.rightChild == null){
                focus.rightChild = toInsert;
            } else {
                Node next = focus.rightChild;
                sort(next,toInsert);
            }
        } else if (toInsert.value == focus.value){
            if (focus.leftChild == null){
                focus.leftChild = toInsert;
            } else {
                Node next = focus.leftChild;
                sort(next,toInsert);
            }
        } else {
                Node next = focus.leftChild;
                sort(next,toInsert);
            if (focus.leftChild == null){
                focus.leftChild = toInsert;
            } else {
                Node next = focus.leftChild;
                sort(next,toInsert);
            }

        }
    
        

    }
        

        
  
    
    
}