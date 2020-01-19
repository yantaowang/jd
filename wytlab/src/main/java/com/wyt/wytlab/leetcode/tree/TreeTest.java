package com.wyt.wytlab.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 =  new TreeNode(2);
        TreeNode node3 =  new TreeNode(3);
        TreeNode node4 =  new TreeNode(4);
        TreeNode node5 =  new TreeNode(5);

        root.setLeft(node2);
        root.setRight(node3);
        node3.setLeft(node4);
        node3.setRight(node5);

        List<Integer> list = postorderTraversal(root);
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<Integer>();
        list.add(root.val);
        if(root.left != null) {
            list.addAll(preorderTraversal(root.left));
        }
        if(root.right != null) {
            list.addAll(preorderTraversal(root.right));
        }
        return list;
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root.left != null) {
            list.addAll(inorderTraversal(root.left));
        }
        list.add(root.val);
        if(root.right != null) {
            list.addAll(inorderTraversal(root.right));
        }
        return list;
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<Integer>();
        if(root.left != null) {
            list.addAll(postorderTraversal(root.left));
        }
        if(root.right != null) {
            list.addAll(postorderTraversal(root.right));
        }
        list.add(root.val);
        return list;
    }
}
