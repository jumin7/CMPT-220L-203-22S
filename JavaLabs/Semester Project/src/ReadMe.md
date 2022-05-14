# Binary Search Tree

This program makes a Binary Search Tree. The program taken an integer value as a parameter and inserts it into the tree. It can print out the children of the nodes and the root through dot notation.  Currently, it consists of two classes. Node Class and BinarySearchTree Class.

## Node Class

The Node class, simply defines our Node object with an Integer value and Two further instances of itself called leftChild and rightChild, which are basically two types of a Node object. It also has a dot notation assignment where the variable, "value", passed as a parameter is assigned to the value of every Node.

## BinarySearchTree Class

Currently this class has twelve methods. 

**Insert**

The first method is, "insert", which takes in an integer variable, "num" as a parameter  and then makes it a Node. This node is then made to insert into our Tree. Firstly, the if statement checks if the tree is empty and makes the newly made Node the root, by assigning it to the root variable. 
However, if there already exists a root, it calls the second method, "sort". Which sorts through the Tree to insert the new Node.

**Sort**

The sort method, takes in the root as the focus variable and new Node to be passed as parameters. We have three if statements, for three cases: 
1. If the new Node is bigger than the Focus node, if it already has a right child, we recursively call the sort method passing the new rightchild as the focus Node, until we get an empty space and assign the new Node there. 

2. If the new node is smaller than the focus root, the same process is done for the left child. We recursively call the sort method until we find an empty place on the right child

3. if the new Node is equal to the root, we go through the same cycle of finding and empty spot on left child side and assign it there.

**Find**

This method takes in a node and a value that needs to be found as parameters. It then sorts through the tree similar to the sort method to find the location of the node in both sides of the tree that holds the value to be found. When it is found, the method prints found and if not, it prints out an error message. 
 
**Smallest & Largest**

These methods steps down on the left and right subtree until there is no child, which means that it looks for the smallest and largest node. It then prints out the value.

**PreOrder**

This method recurses and prints out the nodes in the order of Root, Left child and then right child.

**InOrder**

This method prints out the left child, followed by the root and finally the right child. 

**PostOrder**

This method prints out the Left child, right child and then the root. 

**Traverse**
This method is a simple method, I tested which prints out the entire tree

**BreadthFirstTraverse**

This method prints out the tree in horizontal layers. It makes a queue that stores the nodes. While we empty and the queue after prinintg it, we will replace it the queue with the nodes' children. and repeat.

**Delete & Smallest**

This method takes in the root, and the value to be deleted as parameters. Similar to the find and sort method, we go through the tree to find the node holding te value to be deleted. After finding the node, we now check if the node to be delted has children.

If it only has one or none, we return the opposite side of the child. For example if there are no left child we return the right child. 

If the node to be deleted has both left and right children, we go throguh the right sub tree of the node and find the smallest node. We then replace the smallest nodein place of the node to be deleted. We have a different method, smallest which helps us find it.

## How to use

You can insert Nodes using the dot notation of the BinarySearchTree Class and passing an integer value like so, **BinarySearchTree.insert(5);**. This can be done as many times as you wish and build the tree. 

 **Print**
In order to print the values you can use, **System.out.println(BinarySearchTree.root.value);**
AND
**System.out.println(BinarySearchTree.root.rightChild.value);**

**Delete & Find**
To delete and finding a node, we use dot notation. You would have to pass "tree.root" and the integer you want to delete or find as parameters. 
For example : **tree.delete(tree.root,9);** or **tree.find(tree.root,7);**

**Traversals**
In order to use the basic traverse, inorder, preorder and postorder traversal, you can simply pass the root as a parameter, **tree.inOrder(tree.root);**
For the breadth first traversal, you can simply type, **tree.breadthFirstTraversal(;**

