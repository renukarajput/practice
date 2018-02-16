package edu.ren.datastructure.tree;

import java.util.*;
import java.util.stream.Collectors;

public class BinaryTree<T> {
    Node<T> root;
    public BinaryTree() {
        root = null;
    }

    public void insert(T val) {
        if (root == null) {
            this.root = new Node<>(val);
            return;
        }
        insert(root, val);
    }

    // Recursive insert
    private boolean insert(Node<T> root, T val) {
        if (root.leftChild == null) {
            root.leftChild = new Node<>(val);
            return true;
        } else if (root.rightChild == null) {
            root.rightChild = new Node<>(val);
            return true;
        }
        boolean isInserted = insert(root.leftChild, val);
        if (!isInserted) {
            isInserted = insert(root.rightChild, val);
        }
        return isInserted;
    }

    public boolean isTreeSame(BinaryTree<T> t1, BinaryTree<T> t2){
        if (t1 != null && t2 != null)
            return isTreeSame(t1.root, t2.root);
        return false;
    }

    private boolean isTreeSame(Node<T> node1, Node<T> node2) {
        if (node1 == null && node2 == null)
            return true;

        if ((node1.leftChild == null && node2.leftChild == null) && (node1.rightChild == null && node2.rightChild == null))
            return true;

        if (node1 != null && node2 != null)
            if ((node1.leftChild == null && node2.leftChild == null ||
                node1.leftChild != null && node2.leftChild != null )&&(
                node1.rightChild == null && node2.rightChild == null ||
                node1.rightChild != null && node2.rightChild != null))
                    return isTreeSame(node1.leftChild, node2.leftChild) && isTreeSame(node1.rightChild, node2.rightChild);
        return false;
    }

        public void deleteGivenNode(Node<T> nodeToDelete) {
        Node<T> rightMostChild = getRightMostNode(this.root);

        swapNodeValues(nodeToDelete,rightMostChild);
        Node<T> parentNode = getParentNode(this.root, rightMostChild);
        System.out.println(parentNode.val);
        if (parentNode.leftChild != null && parentNode.leftChild.val == rightMostChild.val)
            parentNode.leftChild = null;
        if (parentNode.rightChild != null && parentNode.rightChild.val == rightMostChild.val)
            parentNode.rightChild = null;
    }

    private void swapNodeValues(Node<T> nodeOne, Node<T> nodeTwo){
        T temp = nodeOne.val;
        nodeOne.val=nodeTwo.val;
        nodeTwo.val=temp;

    }

    public Node<T> getRightMostNode(Node<T> root){
        if (root.rightChild != null){
            root = getRightMostNode(root.rightChild);
        }else{
            if (root.leftChild != null)
                root = getRightMostNode(root.leftChild);
        }
        return root;
    }

    public Node<T> getParentNode(Node<T> root, Node<T> nodeToSearch) {
        Node<T> parent;
        if (root == null) {
            return root;
        } else {
            if (root.leftChild == nodeToSearch || root.rightChild == nodeToSearch) {
                parent = root;
                return parent;
            } else {
              parent =  getParentNode(root.leftChild, nodeToSearch);
                if (parent == null) {
                    parent = getParentNode(root.rightChild, nodeToSearch);
                }
            }
            return parent;
        }
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.leftChild);
            System.out.println(root.val);
            inOrder(root.rightChild);
        }
    }

    public void insertInLevelOrder(T value) {
        insertInLevelOrder(root, new Node<>(value));
    }

    private void insertInLevelOrder(Node<T> root, Node<T> node) {
        if (root == null) {
            this.root = node;
            return;
        }
        List<Node<T>> bfs = new ArrayList<>();
        bfs.add(root);
        int position = 0;
        while (true) {
            if (root.leftChild != null) {
                bfs.add(root.leftChild);
            } else {
                root.leftChild = node;
                return;
            }
            if (root.rightChild != null) {
                bfs.add(root.rightChild);
            } else {
                root.rightChild = node;
                return;
            }
            position++;
            root = bfs.get(position);
        }
    }

   public void printByBfs(){
       Queue<Node<T>> queue = new LinkedList<>();
       Node<T> root = this.root;
       queue.add(root);
        while (!queue.isEmpty()){
            Node<T> qHead = queue.remove();
            if (qHead.leftChild != null) {
                queue.add(qHead.leftChild);
            }
            if (qHead.rightChild != null){
                queue.add(qHead.rightChild);
            }
            System.out.print(qHead.val + " ");
        }
    }

    // using two queue
    public void printBfsByLine(){
        Queue<Node<T>> rootQueue = new LinkedList<>();
        Queue<Node<T>> childQueue = new LinkedList<>();
        Node<T> root = this.root;
        rootQueue.add(root);
        while (!(rootQueue.isEmpty() && childQueue.isEmpty())){
            Node<T> currentElement = rootQueue.remove();
            if (currentElement.leftChild != null)
                childQueue.add(currentElement.leftChild);

            if (currentElement.rightChild != null)
                childQueue.add(currentElement.rightChild);

            System.out.print(currentElement.val+ " ");

            if(rootQueue.isEmpty()){
                Queue<Node<T>> tempQueue;
                tempQueue = rootQueue;
                rootQueue = childQueue;
                childQueue = tempQueue;
                System.out.println();
            }
        }
    }

    // using marker
public void bfsByLineUsingMarker() {
    Queue<Node<T>> bfsQueue = new LinkedList<>();
    Node<T> marker = null;
    Node<T> root = this.root;
    bfsQueue.add(root);
    bfsQueue.add(marker);
    while (true) {
        Node<T> currentElement = bfsQueue.remove();
        if (currentElement == marker) {
            if (bfsQueue.isEmpty()){
                break;
            }
            System.out.println();
            bfsQueue.add(marker);
            continue;
        }
        if (currentElement.leftChild != null)
            bfsQueue.add(currentElement.leftChild);
        if (currentElement.rightChild != null)
            bfsQueue.add(currentElement.rightChild);
        System.out.print(currentElement.val + " ");

    }
}



    public void insertInBinaryTreee(T val) {
        root = insertInBinaryTree(root, val);
    }

    private Node insertInBinaryTree(Node<T> root, T val) {
        if (root == null) {
            root = new Node(val);
        } else if (root.leftChild == null) {
            root.leftChild = new Node(val);
        } else if (root.rightChild == null) {
            root.rightChild = new Node(val);
        } else if (root.rightChild != null) { //don't go to left subtree if already inserted in right
            insertInBinaryTree(root.leftChild, val);
        } else if (root.leftChild != null) {
            insertInBinaryTree(root.rightChild, val);
        }
        return root;
    }

    public List<T> preOrderValues() {
        List<Node<T>> nodes = preOrder();
        return nodes.stream().map(node -> node.val).collect(Collectors.toList());
    }

    public List<Node<T>> preOrder() {
        List<Node<T>> preOrderList = new ArrayList<>();
        preOrder(root, preOrderList);
        return preOrderList;
    }

    private void preOrder(Node<T> root, List<Node<T>> preOrderList) {
        if (root == null) {
            return;
        }
        preOrderList.add(root);
        preOrder(root.leftChild, preOrderList);
        preOrder(root.rightChild, preOrderList);
    }

}
