package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.Arrays;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class RebuildBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = buildTree(new int[]{1, 2}, new int[]{1, 2});
        System.out.println(treeNode);
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        //两个数组中没有元素，则返回空树，空链表
        if(preorder==null||preorder.length==0)
            return null;
        //两个数组只有一个元素，则树就是一个节点
        if(preorder.length==1)
        {
            TreeNode head=new TreeNode(preorder[0]);
            return head;
        }
        TreeNode res=new TreeNode(preorder[0]);
        int[] preleft;
        int[] inleft;
        int[] preright;
        int[] inright;
        int i;
        for( i=0;i<preorder.length;i++)
        {
            if(inorder[i]==preorder[0])
            {
                break;
            }
        }
        if(i==0)
            preleft=new int[0];
        else
            preleft= Arrays.copyOfRange(preorder,1,i+1);
        inleft=Arrays.copyOfRange(inorder,0,i);
        preright=Arrays.copyOfRange(preorder,preleft.length+1,preorder.length);
        inright=Arrays.copyOfRange(inorder,i+1,preorder.length);
        res.left=buildTree(preleft,inleft);
        res.right=buildTree(preright,inright);
        return res;

    }
}
