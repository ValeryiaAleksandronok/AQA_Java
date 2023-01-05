import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");

        int i;
        for (i = 0; i < size; ++i) {
            array[i] = input.nextInt();
        }

        for (i = 0; i < size; ++i)
            if (i % 3 == 0) {
                System.out.print("Полученный массив:" + array[i]);
            }
    }
}