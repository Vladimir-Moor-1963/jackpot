import java.util.Scanner;

public class Gamer {
    public static int main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int count = 6;
        int[] gemernambers = new int[count];
        for (int i = 0; i < count; i++) {
            boolean isValid = false;
            while (!isValid) {
                System.out.println("Введите 6 чисел(число" + (i + 1) + "): ");
                if (scanner.hasNextInt()) {
                    int namber = scanner.nextInt();
                    if (namber >= 1 && namber <= 46) {
                        gemernambers[i] = namber;
                        isValid = true;
                    }else {
                        System.out.println("Число вне диапазона");
                       scanner.next();
                }
                }    else {
                    System.out.println("Не коректный ввод");
                }



                System.out.println("Числа");
                    for (int namber : gemernambers){
                        return namber;

                }

            }
    }
        return count;
    }}