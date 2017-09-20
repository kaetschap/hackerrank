import java.util.*;
import java.util.stream.Collectors;

public class arrayLeftRotation {

    public static int[] arrayLeftRotation(int[] intArray, int arrayLength, int numberLeftShifts) {
        int[] shiftedIntArray = new int[arrayLength];
        int newPosition;

        for (int i = 0; i < arrayLength; i++) {
            newPosition = (i + numberLeftShifts) % arrayLength;
            shiftedIntArray[i] = intArray[newPosition];
        }

        return shiftedIntArray;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = arrayLeftRotation(a, n, k);
        System.out.println(Arrays.stream(output).mapToObj(Integer::toString).collect(Collectors.joining(" ")));
    }
}
