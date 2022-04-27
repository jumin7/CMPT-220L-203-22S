# Binary Search Tree

This program makes a Binary Search Tree. The program taken an integer value as a parameter and inserts it into the tree. It can print out the children of the nodes and the root through dot notation.  Currently, it consists of two classes. Node Class and BinarySearchTree Class.

## Node Class

The Node class, simply defines our Node object with an Integer value and Two further instances of itself called leftChild and rightChild, which are basically two types of a Node object. It also has a dot notation assignment where the variable, "value", passed as a parameter is assigned to the value of every Node.

## BinarySearchTree Class

Currently this class has two methods. 

The first method is, "insert", which takes in an integer variable, "num" as a parameter  and then makes it a Node. This node is then made to insert into our Tree. Firstly, the if statement checks if the tree is empty and makes the newly made Node the root, by assigning it to the root variable. 
However, if there already exists a root, it calls the second method, "sort". Which sorts through the Tree to insert the new Node.

The sort method, takes in the root as the focus variable and new Node to be passed as parameters. We have three if statements, for three cases: 
1. If the new Node is bigger than the Focus node, if it already has a right child, we recursively call the sort method passing the new rightchild as the focus Node, until we get an empty space and assign the new Node there. 

2. If the new node is smaller than the focus root, the same process is done for the left child. We recursively call the sort method until we find an empty place on the right child

3. if the new Node is equal to the root, we go through the same cycle of finding and empty spot on left child side and assign it there.
 
## How to use

You can insert Nodes using the dot notation of the BinarySearchTree Class and passing an integer value like so, "BinarySearchTree.insert(5);". This can be done as many times as you wish and build the tree. 

In order to print the values you can use, "System.out.println(BinarySearchTree.root.value);"
AND
"System.out.println(BinarySearchTree.root.rightChild.value);"
