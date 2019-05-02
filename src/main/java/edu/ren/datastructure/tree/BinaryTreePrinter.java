package edu.ren.datastructure.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by rrn3194 on 1/31/18.
 */
public class BinaryTreePrinter {

        public static <T extends Comparable<?>> void printNode(Node<T> root) {
            int maxLevel = BinaryTreePrinter.maxLevel(root);

            printNodeInternal(Collections.singletonList(root), 1, maxLevel);
        }

        private static <T extends Comparable<?>> void printNodeInternal(List<Node<T>> nodes, int level, int maxLevel) {
            if (nodes.isEmpty() || BinaryTreePrinter.isAllElementsNull(nodes))
                return;

            int floor = maxLevel - level;
            int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
            int firstSpaces = (int) Math.pow(2, (floor)) - 1;
            int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

            BinaryTreePrinter.printWhitespaces(firstSpaces);

            List<Node<T>> newNodes = new ArrayList<Node<T>>();
            for (Node<T> node : nodes) {
                if (node != null) {
                    System.out.print(node.getVal());
                    newNodes.add(node.leftChild);
                    newNodes.add(node.rightChild);
                } else {
                    newNodes.add(null);
                    newNodes.add(null);
                    System.out.print(" ");
                }

                BinaryTreePrinter.printWhitespaces(betweenSpaces);
            }
            System.out.println("");

            for (int i = 1; i <= endgeLines; i++) {
                for (int j = 0; j < nodes.size(); j++) {
                    BinaryTreePrinter.printWhitespaces(firstSpaces - i);
                    if (nodes.get(j) == null) {
                        BinaryTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                        continue;
                    }

                    if (nodes.get(j).leftChild != null)
                        System.out.print("/");
                    else
                        BinaryTreePrinter.printWhitespaces(1);

                    BinaryTreePrinter.printWhitespaces(i + i - 1);

                    if (nodes.get(j).rightChild != null)
                        System.out.print("\\");
                    else
                        BinaryTreePrinter.printWhitespaces(1);

                    BinaryTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
                }

                System.out.println("");
            }

            printNodeInternal(newNodes, level + 1, maxLevel);
        }

        private static void printWhitespaces(int count) {
            for (int i = 0; i < count; i++)
                System.out.print(" ");
        }

        private static <T extends Comparable<?>> int maxLevel(Node<T> node) {
            if (node == null)
                return 0;

            return Math.max(BinaryTreePrinter.maxLevel(node.leftChild), BinaryTreePrinter.maxLevel(node.rightChild)) + 1;
        }

        private static <T> boolean isAllElementsNull(List<T> list) {
            for (Object object : list) {
                if (object != null)
                    return false;
            }

            return true;
        }

    }

