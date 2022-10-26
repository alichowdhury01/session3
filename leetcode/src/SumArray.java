public class SumArray {

    public static void main(String[] args) throws Exception {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 11;
        //the sum of the two numbers in the array that equal the target
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.println(array[i] + array2[j]);
            }
        }
        System.out.println("The first two numbers that add up to " + target + " are " + array[0] + " and " + array[1]);
    }

}