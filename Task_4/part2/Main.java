import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void vivod(Queue<String> p){
        while (p.peek()!=null){
            System.out.println(p.poll());
            try {
                Random random = new Random();
                int wait = random.nextInt(2001)+1000;
                //System.out.print("Waiting = " + wait+"\n");
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Queue<String> poem = new LinkedList<>();
        Scanner sk = new Scanner(System.in);
        System.out.print("Input path: ");
        String path = sk.nextLine();
        sk.close();

        try {
            Scanner sc = new Scanner(Paths.get(path), "Windows-1251");
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                if (!s.isEmpty()) {
                    poem.offer(s);
                }
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        vivod(poem);


    }
}
