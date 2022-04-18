package org.example.day4._4_arrays;

public class ArraysExercises {

    /*
        TODO 15

        firstLast0([0, 1, 2])   -> true
        firstLast0([0, 0, 0, 0] -> true
        firstLast0([5, 66, 0]   -> true
        firstLast0([7, 8])      -> false
        firstLast0([])          -> false
     */
    boolean firstLast0(int[] array) {
        if(array.length == 0){
            return false;
        }
        else{
            return (array[0] == 0) || (array[array.length - 1] == 0);
        }
    }

    /*
        TODO 16

        Arrays with 3 args only!

        middleInts([5, 26, 19], [1, 34, 22])        -> [26, 34]
        middleInts([11, 99, 5], [100, 20, 14]       -> [99, 20]
        middleInts([7, 7, 7], [44, 17, 56]          -> [7, 17]
     */
    int[] middleInts(int[] a, int[] b) {
        return new int[]{a[(a.length - 1) /2], b[(b.length - 1) / 2]};
    }


    /*
       TODO 17

       Write a program that reverses an array of Strings
       reverse({"you", "are", "how", "hello"})  ->  {"hello", "how", "are", "you"}
       reverse({"", null, "me"})                ->  {"me", null, ""}
     */

    String[] reverse(String[] baseArray) {
        String[] reversedArray = new String[baseArray.length];
        for(int i = 0; i < baseArray.length; i ++){
            reversedArray[i] = baseArray[baseArray.length - i - 1];
        }
        return reversedArray;
    }

    /*

        TODO 18

        sum([3, 4, 8])    -> 15
        sum([12, 80])     -> 92
        sum([3, 3, 5, 5]) -> 16
        sum([4])          -> 4
        sum([])           -> 0
     */
    int sum(int[] nums) {
        int tot = 0;
        for (int i = 0; i < nums.length; i++) {
            tot += nums[i];
        }
        return tot;
    }

    /*
        TODO 19

        Given a non-empty array, return true if there is a place to split the array so that
        the sum of the numbers on one side is equal to the sum of the numbers on the other side

        isBalanced([1, 3, 2, 2])     -> true
        isBalanced([5, 5])           -> true
        isBalanced([8, 0, 2, -2, 8]  -> true
        isBalanced([30])             -> false
        isBalanced([2, 3, 4, 1, 2]]) -> false
     */
    boolean isBalanced(int[] array) {
        int sum = 0;
//        int[] partSums = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int partSum = 0;

        for (int j = 0; j < array.length; j++){
            partSum += array[j];
            if (partSum == sum/2){
                return true;
            }
        }
        return false;
    }

    /*
        TODO 20

        Return difference between max value and min value

        diff([10, 5, 8, 1, 4]) -> 9
        diff([5, 4, 6, 7])     -> 3
        diff([6, 6])           -> 0
        diff([-5, 3, 9])       ->14
     */
    int diff(int[] array) {
        int max = array[0];
        int min = array[0];

        for(int num : array){
            if(num < min){
                min = num;
            }
            else if (num > max){
                max = num;
            }
        }

        return max - min;
    }

    /*
        TODO 21

        A group is at least two adjacent elements of the same value. Count the number of groups.

        countGroups([1, 2, 2, 3, 4, 4]) -> 2
        countGroups([3, 3, 6, 3, 3])    -> 2
        countGroups([5, 5, 5, 5, 5])    -> 1
        countGroups([])                 -> 0
        countGroups([5, 3, 6, 2, 4])    -> 0
     */
    int countGroups(int[] array) {
        int count = 0;

        for(int i = 1; i < array.length - 1; i++){
            if(array[i] == array[i-1] && array[i] != array[i+1]){
                count += 1;
            }
        }
        if (array.length != 0 && array[array.length - 1] == array[array.length - 2]){
            count++;
        }
        return count;
    }

    /*
        TODO 22

        innerInside([5, 6, 7, 4, 3, 3], [6, 4]) -> true
        innerInside([3, 3, 5, 5, 6, 6], [5, 3]) -> true
        innerInside([-1, 2, 3, 2], [3])         -> true
        innerInside([2, 5], [2, 5])             -> true
        innerInside([5, 4, 6, 32, 5], [4, 8])   -> false
        innerInside([], [5])                    -> false
     */
    boolean innerInside(int[] outer, int[] inner) {
        boolean ans = true;
        for (int num : inner){
            boolean found = false;
            for(int term : outer){
                if(term == num){
                    found = true;
                }
            }
            if(found){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}