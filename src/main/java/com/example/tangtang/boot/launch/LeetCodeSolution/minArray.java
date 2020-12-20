package com.example.tangtang.boot.launch.LeetCodeSolution;

public class minArray {
    public static void main(String[] args) {
        System.out.println(minArrayL(new int[]{1,1}));
    }
    public static int minArrayL(int[] numbers) {

        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int pivot = (high+low)/2;
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }
}
