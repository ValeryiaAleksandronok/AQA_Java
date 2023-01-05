import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String userName = name.nextLine();
        if (userName.equals("Вячеслав")) {
            System.out.print("Привет, Вячеслав");
        } else {
            System.out.print("Нет такого имени");

        }
    }
    }