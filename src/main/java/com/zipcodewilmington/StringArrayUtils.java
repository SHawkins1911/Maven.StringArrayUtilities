package com.zipcodewilmington;

import java.util.Arrays;

import java.util.Collections;
import java.util.*;


/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
}

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length -1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length -2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

       // boolean contains = array.stream().anyMatch(value::equals);
        return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
           Collections.reverse(Arrays.asList(array));
           return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int end = array.length;
        int flag = 0;
        boolean result;
        for (int i = 0; i <= end / 2 && end != 0; i++) {
            if (array[i] != array[end - i - 1]) {
                return false;

            }
        }
        return true;
    }


        public static boolean isPangramic (String[] array) {
            String arr = Arrays.toString(array);
            long x = arr.toLowerCase().chars()
                    .filter(ch -> ch >= 'a' && ch <= 'z')
                    .distinct()
                    .count();
            return x == 26;
        }
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int n = array.length;
        int count = 0;
            for(int i = 0; i < n; i++){
                if(array[i] == value){
                    count++;
                }
            }
        return count;
    }



    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String [] newArr = null;

        for(int i = 0; i < array.length; i++){
            if(array[i] == valueToRemove){
            newArr = new String [array.length - 1];
            for(int index = 0; index < i; index++){
                newArr[index] = array[index];
                }
            for(int j = i; j < array.length - 1; j++){
                newArr[j] = array[j + 1];
            }
            }
        }
        return newArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String>arrList = new ArrayList<String>(Arrays.asList(array));
        for(int i = 1; i < arrList.size(); i++)
          if(arrList.get(i-1).equals(arrList.get(i))){
              arrList.remove(i);
              i--;
          }
        String[] resultArr;
        resultArr = arrList.toArray(new String[0]);
        return resultArr;

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        List removed = new ArrayList<String>();


        for (int i = 0; i < array.length ; i++) {
            if (i + 1 != array.length) {
                String next = array[i];
                while (array[i].equals(array[i + 1])) {
                    next += array[i];
                    i++;
                   if (i + 1 == array.length) {
                        break;
                    }
            }
                removed.add(next);
            }else{
                removed.add(array[i]);
                }

            }

        return (String[]) removed.toArray(new String [removed.size()]);
        }



    }


