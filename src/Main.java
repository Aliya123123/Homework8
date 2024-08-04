import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1 and 2");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(Arrays.toString(weight));
        for (int i : weight) {
            if (i < weight.length)
                System.out.print(i + ", ");
            else {
                System.out.print(i);
            }
        }
        System.out.println();

        double[] arr = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1)
                System.out.print(arr[i] + ", ");
            else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();

        int[] array1 = new int[3];
        array1[0] = 5;
        array1[1] = 17;
        array1[2] = 350;
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < array1.length; i++) {
            if (i < array1.length - 1)
                System.out.print(array1[i] + ", ");
            else {
                System.out.print(array1[i]);
            }
        }
        System.out.println();

        System.out.println("task 3");

        for (int i = weight.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(weight[i] + ", ");
            else {
                System.out.print(weight[i]);
            }
        }

        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(arr[i] + ", ");
            else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
        for (int i = array1.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(array1[i] + ", ");
            else {
                System.out.print(array1[i]);
            }
        }
        System.out.println();

        System.out.println("task 4");
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0)
                weight[i] += 1;
            if (i < weight.length - 1)
                System.out.print(weight[i] + ", ");
            else {
                System.out.print(weight[i]);

            }
        }


    }
}