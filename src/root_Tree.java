//Our actual tree class that can be used to create a new tree object
public class root_Tree {
    //Basically our template for our nodes
    class Node {
        int value;
        Node left, right;

        //This is a constructor for our nodes with value being the number that represents the node and left and right being pointers.
        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    Node root;

    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left == null) {
                node.left = new Node(value);
            } else if
            (value > node.value) {
                if (node.right == null) {
                    node.right = new Node(value);
                }
            }

        }
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

}