package Task_Program_HW;

public class Lab023_Second_Largetst_Number {

    // Find Second Largest Number in an Array

    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int size = numbers.length;
        int temp;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){

                if(numbers[i]>numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("The second largest number is:: "+numbers[size-2]);
    }

}
