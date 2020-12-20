package com.example.tangtang.boot.launch.LeetCodeSolution;

public class countPrimes {

    public static void main(String[] args) {
        System.out.println(countPrimes(1000));
    }

        public static int countPrimes(int n) {
            if(n<=2)
                return 0;
            if(n==3)
                return 1;
            int k=1;
            for(int i=2;i<=Math.sqrt(n-1);i++)
            {
                if((n-1)%i==0)
                {
                    k=0;
                    break;
                }

            }

            return k+countPrimes(n-1);
        }
    }

