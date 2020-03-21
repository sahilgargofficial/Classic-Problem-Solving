package Trees;

import java.util.Scanner;

public class Driver {

    static TreeNode<Integer> takeInput(Scanner s) {

        System.out.println("Enter data for next node ");
        int n = s.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("Enter number of children for" + n);
        int countChildren = s.nextInt();
        for (int i = 0; i < countChildren; i++) {
            TreeNode<Integer> child = takeInput(s);
            root.children.add(child);
        }
        return root;
    }

    static void printTree(TreeNode<Integer> root) {
        StringBuilder s = new StringBuilder(root.data + ": ");
        for (int i = 0; i < root.children.size(); i++) {
            s.append(root.children.get(i).data).append(" , ");
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            printTree(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(s);
        printTree(root);
    }
}
