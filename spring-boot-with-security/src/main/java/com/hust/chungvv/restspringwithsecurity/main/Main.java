package com.hust.chungvv.restspringwithsecurity.main;

import java.util.*;

public class Main {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < nums.length - 1; j++) {
                int complement = -nums[i] - nums[j];
                if (map.containsKey(complement)) rs.add(Arrays.asList(i, j));
            }
        }
        return rs;
    }

    public int getMinimumDifference(TreeNode root) {
        int rs = 100000;
        List<Integer> list = new ArrayList<>();
        if (root == null) return rs;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode polled = queue.poll();
            list.add(polled.val);
            if (polled.left != null) queue.add(polled.left);
            if (polled.right != null) queue.add(polled.right);
        }
        Collections.sort(list);
        for (int i = list.size() - 1; i > 0; i--) {
            int i1 = list.get(i) - list.get(i - 1);
            if (i1 < rs) rs = i1;
        }
        return rs;
    }

    public static void main(String[] args) {

    }
}
