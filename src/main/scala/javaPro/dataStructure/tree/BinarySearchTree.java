package scala.javaPro.dataStructure.tree;

/**
 * Created by rrn3194 on 1/3/17.
 */

public class BinarySearchTree<T extends Comparable<? super T>> {
    Node<T> root;
    public BinarySearchTree(){
        root = null;
    }

    private void insert(T val){
        root = insertionInBst(root, val);
    }

    private Node insertionInBst(Node<T> root, T val) {

        if (root == null){
            root = new Node(val);
            return root;
        }

        if (val.compareTo(root.val) > 0)
            root.rightChild = insertionInBst(root.rightChild, val);
        else
            root.leftChild = insertionInBst(root.leftChild, val);

        return root;
    }

    private void inOrderTraversal(){
        inOrder(root);
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.leftChild);
            System.out.println(root.val);
            inOrder(root.rightChild);
        }
    }

    private void findKthSmallest(int k){
        int cnt = 0;
        getKThSmallest(root, cnt, k);
    }

    private void getKThSmallest(Node<T> root, int cnt, int k) {
        if(root == null)
            return;
        if (cnt == k) {
            System.out.println("kTh smallest node val : " + root.val);
            return;
        }
        getKThSmallest(root.leftChild, cnt + 1, k);
        getKThSmallest(root.rightChild, cnt + 1, k);
    }

    private void deletion(){
        deletionOfNode(root);
        System.out.println("after deletion val of root -> "+ root.val);
    }

    private void deletionOfNode(Node root) {
        if(root == null)
            return;
        deletionOfNode(root.leftChild);
        deletionOfNode(root.rightChild);
        System.out.println("deleting node -> "+ root.val);
        root.leftChild = null;
        root.rightChild = null;
        root.val=null;
        return;
    }


    private void isBST(){
        if(isBstUtil(root) == true)
            System.out.println("BST");
        else
            System.out.println("Not BST");
    }

    private boolean isBstUtil(Node root) {
        if (root == null)
            return true;
//        if (root.leftChild != null && getMaxValue().compareTo(root)){
//
//        }
        return false;
    }

    private void search(T value) {
        System.out.println("Node present : "+searchInBst(root, value));
    }

    private Boolean searchInBst(Node<T> root, T value) {
        if (value.compareTo(root.val)== 0)
            return true;
        else if (value.compareTo(root.val) < 0) {
            if(root.leftChild == null)
                return false;
            else
                return searchInBst(root.leftChild, value);
        }
        else{
            if (root.rightChild == null)
                return false;
            else
                return searchInBst(root.rightChild, value);
        }
    }

    private T getMinValue(){
        return getMinOfBst(root).val;
    }

    private Node<T> getMinOfBst(Node<T> root) {
        while (root.leftChild != null){
            root = root.leftChild;
        }
        return root;
    }

    private T getMaxValue(){
        return getMaxOfBst(root).val;
    }

    private Node<T> getMaxOfBst(Node<T> root) {
        while (root.rightChild != null){
            root = root.rightChild;
        }
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(2);
        bst.insert(12);
        bst.insert(8);
        bst.insert(20);
        bst.insert(5);
        bst.insert(11);
        bst.insert(1);
        bst.inOrderTraversal();
        bst.search(10);
//        System.out.println("Min : "+bst.getMinValue());
//        System.out.println("Max : "+bst.getMaxValue());
        //bst.deletion();
        bst.findKthSmallest(2);
        }
}
