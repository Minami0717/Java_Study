package test;

public class Solution {
    public static int solution(int[] array, int n) {
        int answer = 0;
        for (int i : array)
            if (i == n) answer++;
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1,-1};
        //System.out.println(solution(64,6));
        //System.out.println(solution(numbers));
        System.out.println(solution(numbers, 1));
//        for (int i : solution(numbers)) {
//            System.out.println(i);
//        }
    }
}
