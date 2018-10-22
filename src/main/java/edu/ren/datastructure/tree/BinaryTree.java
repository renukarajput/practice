package edu.ren.datastructure.tree;

import java.util.*;
import java.util.stream.Collectors;

public class BinaryTree<T> {
    Node<T> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    public Node<T> getRoot() {
        return root;
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

    //structure
    public boolean isTreeSame(BinaryTree<T> t1, BinaryTree<T> t2) {
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
                    node1.leftChild != null && node2.leftChild != null) && (
                    node1.rightChild == null && node2.rightChild == null ||
                            node1.rightChild != null && node2.rightChild != null))
                return isTreeSame(node1.leftChild, node2.leftChild) && isTreeSame(node1.rightChild, node2.rightChild);
        return false;
    }

    // structure as well as node values
    public int isSameTree(Node<T> node1, Node<T> node2) {
        if (node1 == null && node2 == null)
            return 1;

        if (node1 == null && node2 != null || node1 != null && node2 == null)
            return 0;

        if (node1.val != node2.val)
            return 0;

        if ((node1.leftChild == null && node2.leftChild == null) && (node1.rightChild == null && node2.rightChild == null))
            return 1;

        if (isSameTree(node1.leftChild, node2.leftChild) == 1 && isSameTree(node1.rightChild, node2.rightChild) == 1)
            return 1;

        return 0;
    }

    public int sumOfNumberOfNodes(Node<T> root) {
        if (root == null)
            return 0;
        else
            return (1 + sumOfNumberOfNodes(root.leftChild) + sumOfNumberOfNodes(root.rightChild));
    }

    public int heightOfTree(Node<T> root){
        if (root == null)
            return 0;

            int left = heightOfTree(root.leftChild);
            int right = heightOfTree(root.rightChild);

            return (1 + (left >= right ? left : right));
        //  return 1 + Math.max(heightOfTree(root.leftChild), heightOfTree(root.rightChild));
    }

    public Node<T> createMirrorTree(Node<T> root) {
        if (root == null)
            return root;

        Node<T> left = createMirrorTree(root.leftChild);
        Node<T> right = createMirrorTree(root.rightChild);

        root.leftChild = right;
        root.rightChild = left;

        return root;
    }

    public void deleteGivenNode(Node<T> nodeToDelete) {
        Node<T> rightMostChild = getRightMostNode(this.root);

        swapNodeValues(nodeToDelete, rightMostChild);
        Node<T> parentNode = getParentNode(this.root, rightMostChild);
        System.out.println(parentNode.val);
        if (parentNode.leftChild != null && parentNode.leftChild.val == rightMostChild.val)
            parentNode.leftChild = null;
        if (parentNode.rightChild != null && parentNode.rightChild.val == rightMostChild.val)
            parentNode.rightChild = null;
    }

    private void swapNodeValues(Node<T> nodeOne, Node<T> nodeTwo) {
        T temp = nodeOne.val;
        nodeOne.val = nodeTwo.val;
        nodeTwo.val = temp;
    }

    public Node<T> getRightMostNode(Node<T> root) {
        if (root.rightChild != null) {
            root = getRightMostNode(root.rightChild);
        } else {
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
                parent = getParentNode(root.leftChild, nodeToSearch);
                if (parent == null) {
                    parent = getParentNode(root.rightChild, nodeToSearch);
                }
            }
            return parent;
        }
    }

    public T kThSmallest(int k) {
        Node<T> root = this.root;
        ArrayList<T> list = new ArrayList<>();
        inOrder(root, list);
        Comparator<T> comparator = (x, y) -> ((Comparable) x).compareTo(y);
        Collections.sort(list, comparator);
        return list.get(k);
    }

    private void inOrder(Node<T> root, List<T> list) {
        if (root != null) {
            inOrder(root.leftChild, list);
            list.add(root.val);
            inOrder(root.rightChild, list);
        }
    }

    public void findkThSmallest(Node<T> root, int k) {
        int[] count = new int[1];
        count[0] = 0;
        findkThSmallest(root, k, count);
    }

    private void findkThSmallest(Node<T> node, int k, int[] count) {
        count[0]++;
        if (k == count[0]) {
            System.out.println(k + "Th smallest : " + node.val + "--------------> Cnt : " + count[0]);
            return;
        }
        if (node.rightChild == null && node.leftChild == null) {
            return;
        }
        findkThSmallest(node.leftChild, k, count);
        findkThSmallest(node.rightChild, k, count);
    }

    private void inOrder(Node<T> root) {
        if (root != null) {
            inOrder(root.leftChild);
            System.out.println(root.val);
            inOrder(root.rightChild);
        }
    }

    public List<T> searchPath(T value) {
        List<T> list = new LinkedList<>();
        T found = searchPath(root, value, list);
        if (found == null) {
            return Collections.EMPTY_LIST;
        }
        return list;
    }

    private T searchPath(Node<T> root, T value, List<T> list) {
        list.add(root.val);
        if (root.val == value) {
            return value;
        }
        T valueFound = null;

        if (root.leftChild != null) {
            valueFound = searchPath(root.leftChild, value, list);
            if (valueFound == null && !list.isEmpty()) {
                list.remove(list.size() - 1);
            }
        }

        if (valueFound == null && root.rightChild != null) {
            valueFound = searchPath(root.rightChild, value, list);
            if (valueFound == null && !list.isEmpty()) {
                list.remove(list.size() - 1);
            }
        }
        return valueFound;
    }


    //iterative inorder - this has redundant code
    public void iterativeInorder() {
        Node<T> current = this.root;
        Stack<Node<T>> stack = new Stack<>();

//        if (current == null)
//            return;
        while (current != null) {
            stack.push(current);
            current = current.leftChild;
        }
        while (!stack.isEmpty()) {
            Node<T> top = stack.pop();
            System.out.print(top.val + " - ");

            if (top.rightChild != null)
                current = top.rightChild;

            while (current != null) {
                stack.push(current);
                current = current.leftChild;
            }
        }
    }

    // iterative inorder
    public void inOrderByLoop() {
        Node<T> current = this.root;
        Stack<Node<T>> stack = new Stack<>();

        while (true) {
            if (current != null) {
                stack.push(current);
                current = current.leftChild;
            } else {
                if (!stack.isEmpty()) {
                    Node<T> top = stack.pop();
                    System.out.print(top.val + " - ");
                    if (top.rightChild != null) {
                        current = top.rightChild;
                    }
                } else {
                    break;
                }
            }
        }
    }

    // Iterative insert
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

    public static int cnt = 0;

    public Node<T> findLowestCommonAncestor(Node<T> root, T p, T q) {
        cnt = 0;
        return findLowestCommonAncestor(root, p, q, new int[]{0});
    }

    public Node<T> findLowestCommonAncestor(Node<T> root, T p, T q, int[] nodesFound) {
        cnt++;
        System.out.print(root.val + "--");

        if (nodesFound[0] == 2 || root.val == p || root.val == q) {
            nodesFound[0]++;
            return root;
        }

        Node<T> left = null, right = null;

        if (nodesFound[0] != 2 && root.leftChild != null) {
            left = findLowestCommonAncestor(root.leftChild, p, q, nodesFound);
        }

        if (nodesFound[0] != 2 && root.rightChild != null) {
            right = findLowestCommonAncestor(root.rightChild, p, q, nodesFound);
        }

        if (left != null && right != null)
            return root;

        if (left != null)
            return left;
        else
            return right;
    }


    // bfs in one line
    public void printByBfs() {
        Queue<Node<T>> queue = new LinkedList<>();
        Node<T> root = this.root;
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<T> qHead = queue.remove();
            if (qHead.leftChild != null) {
                queue.add(qHead.leftChild);
            }
            if (qHead.rightChild != null) {
                queue.add(qHead.rightChild);
            }
            System.out.print(qHead.val + " ");
        }
    }

    public void printZigZagOrder() {
        Queue<Node<T>> queue = new LinkedList<>();
        Stack<Node<T>> stack = new Stack<>();
        Node<T> root = this.root;
        Node<T> marker = null;
        queue.add(root);
        queue.add(marker);
        while (!(queue.isEmpty())) {
            Node<T> currentElement = queue.remove();
            if (currentElement == marker) {
                if (stack.isEmpty() && queue.isEmpty()) {
                    break;
                }
                System.out.println();
                queue.add(marker);
                while (!stack.isEmpty()) {
                    Node<T> topElem = stack.pop();
                    System.out.print(topElem.val + " ");
                }
                System.out.println();
            } else {
                System.out.print(currentElement.val + " ");
                addChildrenToStack(queue, stack, currentElement);
            }
        }
    }

    public void printZigZagOrder1() {
        Queue<Node<T>> queue = new LinkedList<>();
        Stack<Node<T>> stack = new Stack<>();
        Node<T> root = this.root;
        Node<T> curr;
        Node<T> marker = null;
        queue.add(root);
        queue.add(marker);
        while (!(queue.isEmpty())) {
            Node<T> currentElement = queue.remove();

            if (currentElement == marker) {
                if (stack.isEmpty() && queue.isEmpty()) {
                    break;
                }
                queue.add(marker);
                while (!stack.isEmpty()) {
                    Node<T> childElm = stack.pop();
                    System.out.print(childElm.val + " ");
                }
            } else {
                System.out.print(currentElement.val + " ");

                if (currentElement.leftChild != null) {
                    curr = currentElement.leftChild;
                    stack.push(curr);
                    if (curr.leftChild != null)
                        queue.add(curr.leftChild);
                    if (curr.rightChild != null)
                        queue.add(curr.rightChild);
                }
                if (currentElement.rightChild != null) {
                    curr = currentElement.rightChild;
                    stack.push(curr);
                    if (curr.leftChild != null)
                        queue.add(curr.leftChild);
                    if (curr.rightChild != null)
                        queue.add(curr.rightChild);
                }
            }
        }
    }

    private void addChildrenToStack(Queue<Node<T>> queue, Stack<Node<T>> stack, Node<T> node) {
        if (node.leftChild != null) {
            stack.push(node.leftChild);
            addChildrenToQueue(queue, node.leftChild);
        }
        if (node.rightChild != null) {
            stack.push(node.rightChild);
            addChildrenToQueue(queue, node.rightChild);

        }
    }

    private void addChildrenToQueue(Queue<Node<T>> queue, Node<T> node) {
        if (node.leftChild != null) {
            queue.add(node.leftChild);
        }
        if (node.rightChild != null) {
            queue.add(node.rightChild);
        }
    }

    //using two stacks
    public void printZigZagOrderUsingStack() {
        Stack<Node<T>> currentLevel = new Stack<>();
        Stack<Node<T>> nextLevel = new Stack<>();
        Node<T> currentElement;
        Node<T> root = this.root;
        boolean leftToRight = true;
        currentLevel.push(root);
        while (!currentLevel.isEmpty()) {
            currentElement = currentLevel.pop();
            System.out.print(currentElement.val + " ");

            if (leftToRight) {
                if (currentElement.leftChild != null) {
                    nextLevel.push(currentElement.leftChild);
                }
                if (currentElement.rightChild != null) {
                    nextLevel.push(currentElement.rightChild);
                }
            } else {
                if (currentElement.rightChild != null) {
                    nextLevel.push(currentElement.rightChild);
                }
                if (currentElement.leftChild != null) {
                    nextLevel.push(currentElement.leftChild);
                }
            }
            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<Node<T>> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
                System.out.println();
            }
        }
    }

    // using two queue
    public void printBfsByLine() {
        Queue<Node<T>> rootQueue = new LinkedList<>();
        Queue<Node<T>> childQueue = new LinkedList<>();
        Node<T> root = this.root;
        rootQueue.add(root);
        while (!(rootQueue.isEmpty() & childQueue.isEmpty())) {
            Node<T> currentElement = rootQueue.remove();
            if (currentElement.leftChild != null)
                childQueue.add(currentElement.leftChild);

            if (currentElement.rightChild != null)
                childQueue.add(currentElement.rightChild);

            System.out.print(currentElement.val + " ");

            if (rootQueue.isEmpty()) {
                Queue<Node<T>> tempQueue = rootQueue;
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
                if (bfsQueue.isEmpty()) {
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

    // This adds elements in left subtree only.
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
