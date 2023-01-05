import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        if (a > 7){
            System.out.print("Привет");
        } else{
            System.out.print("Введите число больше, чем 7 для приветствия");
                    in.close();
        }

        }
    }