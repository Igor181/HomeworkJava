import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomer;
        RegexNomer nomerInf = new RegexNomer();
        System.out.print("Для выхода из программы введите  -1\n");
        while (true){
            System.out.print("Введите номер: ");
            nomer = scanner.nextLine();
            if(Pattern.matches("-1",nomer)){ //Выход из программы
                break;
            }
            nomerInf.getNomer(nomer); // создание экземпляря класса для проверки номера
            nomerInf.Inf(); // информация о введёном номере
        }
    }
}