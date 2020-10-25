/**
 * 请按倒序遍历数组并打印每个元素：
 */

 public class Array {
     public static void main(String[] args) {
        for(String arg : args) {
            System.out.println(arg);
        }

         int[] arr = {1, 2, 3, 5, 6, 56, 67};
         for(int i = arr.length - 1; i >= 0; i--) {
             System.out.println(arr[i]);
         }
     }
 }