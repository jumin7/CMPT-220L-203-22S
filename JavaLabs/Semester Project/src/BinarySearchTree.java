import java.util.*;

class Node {
// Basic class to define a node

    int value;
    Node leftChild;
    Node rightChild;

    Node(int value){

        this.value = value;
    }   
}

public class BinarySearchTree {
// A method that checks if left is empty if value < focus and checks if right is empty if calue > focus

    Node root;
    public void insert (int num){

        Node toInsert = new Node (num);

        if (root == null){  //checks if tree is empty
            root = toInsert;
        } else{ //another method to sort through and add the new node
            sort(root, toInsert);
        }
    }
        
    public void sort(Node focus, Node toInsert){
    // Goes throguh the tree to find the right spot

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

            if (focus.leftChild == null){
                focus.leftChild = toInsert;
            } else {
                Node next = focus.leftChild;
                sort(next,toInsert);
            }
        }
    }
    
    public void find (Node node, int value){
    //Recursing through the tree to find the node to search

        if(node.value == value){

            System.out.println("Found");
        } else if (node.value > value){

            System.out.println ("Going to left child");
            find(node.leftChild,value);
        } else if (node.value < value){

            System.out.println ("Going to right child");
            find(node.rightChild,value);
        } else {

            System.out.println("Not found");
        }
    }

    public void smallest(){
    // Getting the node that is the last child on the left sub tree

        Node node = root;
        // looping through the tree till there is no left child
        while (node.leftChild!= null){
            node = node.leftChild;
        } System.out.println ("The smallest value is "+ node.value);
    
    }

    public void largest(){
    // Getting the node that is the last child on the right sub tree

        Node node = root;
        // looping thorugh the tree till there is no right child
        while (node.rightChild!= null){
            node = node.rightChild;
        } System.out.println ("The largest value is "+ node.value);

    }
       
    public void preOrder(Node node){
    // Root, Left, Right
        if (node == null){
            return;
        }
        // printing value of node 
        System.out.print(node.value + "   ");
 
        // then going on left subtree 
        preOrder(node.leftChild);
 
        // going to right subtree 
        preOrder(node.rightChild);

    }

    public void inOrder(Node node){
    //Left, Root, Right
        if (node == null){
            return;
        }
        // looping on the left subtree 
        inOrder(node.leftChild);

        // printing out the value
        System.out.print(node.value + "  ");

        //looping through the right child 
        inOrder(node.rightChild);
    }

    public void postOrder(Node node){
    //Left, Right, Root
        if (node == null){
            return;
        }
        // recursing and going to left child
        postOrder(node.leftChild);

        // recursing and going to right child
        postOrder(node.rightChild);

        // printing the value
        System.out.print(node.value + " ");
    }
 
    
    public void traverse(Node node){
    // Simple method that just traverses through the whole tree

        if (node!=null){
            traverse(node.leftChild);
            System.out.print(" "+node.value);
            traverse(node.rightChild);
        }
    }

   
    public void breadthFirstTraversal() {
    // Displaying through horizontal layers
        if (root == null) {
            return;
        }
        
        // using a queue to store each node before replaciing it with it's child 
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        // checking if it is empty
        while (!nodes.isEmpty()) {
    
            Node node = nodes.remove();

            // printing all the nodes on the first layer
            System.out.print(" " + node.value);

            if (node.leftChild != null) {
                nodes.add(node.leftChild);
            }
            if (node.rightChild != null) {
                nodes.add(node.rightChild);
            }
        }
    }
    
    Node delete(Node root, int valueDelete)
    {
        //checking if the tree is empty
        if (root == null)
            return root;
 
        //going down the tree recursively
        if (valueDelete < root.value){

            root.leftChild = delete(root.leftChild, valueDelete);
        }
        else if (valueDelete > root.value){

            root.rightChild = delete(root.rightChild, valueDelete);
        }
 
        // when we find it we will check from 3 cases to know which to readjust
        else {
            // node with only one child or no child
            if (root.leftChild == null){
                
                return root.rightChild;
            }
                
            else if (root.rightChild == null){

                return root.leftChild;
            }
            // this means the node to be deleted has both children, so we will now go through to find the smallest node from the right sub tree and replace it for the node that got deleted
            root.value = smallest(root.rightChild);
            root.rightChild = delete(root.rightChild, root.value);
        }
 
        return root;
    }
    int smallest(Node focus){
   // Different method to get the smallest value


        int small = focus.value;
        while (focus.leftChild != null){

            small = focus.leftChild.value;
            root = focus.leftChild;
        }
        return small;
    }
    
    
    
}