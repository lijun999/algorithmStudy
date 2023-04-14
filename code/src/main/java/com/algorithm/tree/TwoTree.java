package com.algorithm.tree;

public class TwoTree {
    private class Node {
        private Integer value;
        private Node left;
        private Node right;

        public Node(Integer value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    //二叉树的前序遍历 先访问根节点，再遍历左子树，再遍历右子树
    public void printTwoTree(Node root) {
        if(root==null){
            return;
        }
        System.out.println(root.value);
        printTwoTree(root.left);
        printTwoTree(root.right);
    }

    //二叉树的中序遍历 先遍历左子树，再访问跟节点，在遍历右子树
    public void printTwoTree1(Node root) {
        if(root==null){
            return;
        }
        printTwoTree1(root.left);
        System.out.println(root.value);
        printTwoTree1(root.right);
    }
    //二叉树的后序遍历 先遍历左子树，再遍历右子树，在访问跟节点
    public void printTwoTree2(Node root) {
        if(root==null){
            return;
        }
        printTwoTree2(root.left);
        printTwoTree2(root.right);
        System.out.println(root.value);
    }

}
