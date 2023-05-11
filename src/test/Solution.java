package test;

public class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double answer = (double) sum / arr.length;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {1,2,3,4};
        //System.out.println(s.solution(64,6));
        System.out.println(s.solution(numbers));
       // System.out.println(solution(numbers, 1));
//        for (int i : solution(numbers)) {
//            System.out.println(i);
//        }
    }
}
