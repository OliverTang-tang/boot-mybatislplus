package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class leastInterval2 {
    public static void main(String[] args) {
        int i = leastInterval(new char[]{'A','A','B','B','C','C','D','D'}, 2);
        System.out.println(i);
    }

    public static int leastInterval(char[] tasks, int n) {
        if (n == 0) {
            return tasks.length;
        }
        int[] count = new int[26];
        for (char ch : tasks) {
            count[ch - 'A']++;
        }
        // 将任务数量最多的排在前面，如果数量相同，按任务的字母排序。
        PriorityQueue<int[]> pq = new PriorityQueue<>((t1, t2) -> t1[1] != t2[1] ? t2[1] - t1[1] : t1[0] - t2[0]);
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                pq.add(new int[]{i, count[i]});
            }
        }
        // 保存最近N个执行过的任务，空任务用null表示
        LinkedList<int[]> latestExecutedNTasks = new LinkedList<>();
        StringBuilder res = new StringBuilder();

        int remind = tasks.length;
        int N = n + 1;
        while (remind > 0) {
            if (latestExecutedNTasks.size() == N) {
                int[] task = latestExecutedNTasks.poll();
                if (task != null && task[1] > 0) {
                    pq.add(task);
                }
            }
            if (!pq.isEmpty()) {
                int[] task = pq.poll();
                task[1]--;
                latestExecutedNTasks.add(task);
                remind--; // 真实任务数量减少1
                res.append((char) (task[0] + 'A'));
            } else {
                latestExecutedNTasks.add(null);
                res.append('#');
            }
        }
        // System.out.println(res.toString());
        return res.length();
    }
}
