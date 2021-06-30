import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 5, 3, 7, 11, 9, 15};
        System.out.println("Array = " + Arrays.toString(array));

        reverse(array);

        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    public static void reverse(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}

//Output:
//Array = [1, 5, 3, 7, 11, 9, 15]
//Reversed array = [15, 9, 11, 7, 3, 5, 1]

// Explanation:
// when i = 0
//     int temp = array[0];
//     array[0] = array[4];
//     array[4] = temp;

// when i = 1
//     int temp = array[1];
//     array[1] = array[3];
//     array[3] = temp;

// when i = 2
//     int temp = array[0];
//     i < halfLength
//     2 < 2 is false, loop stops