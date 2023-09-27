import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] nick = {"Cooper", "Milo", "Finn", "Charlie", "Tucker", "Ollie", "Max", "Barsik"};
        ArrayList<Animal> array = new ArrayList<>();
        int distance;
        Random random = new Random();
        for(int i = 0; i < random.nextInt(3) + 1; i++){
            Animal a = new Dog(nick[random.nextInt(8)]);
            array.add(a);
        }
        for(int i = 0; i < random.nextInt(3) + 1; i++){
            Animal a = new Cat(nick[random.nextInt(8)]);
            array.add(a);
        }
        for(int i = 0; i < random.nextInt(3) + 1; i++){
            Animal a = new Tiger(nick[random.nextInt(8)]);
            array.add(a);
        }
        for(int i = 0; i < random.nextInt(3) + 1; i++){
            Animal a = new Maine_Coon(nick[random.nextInt(8)]);
            array.add(a);
        }
        for(Animal an : array){
            distance = random.nextInt(1000) + 1;
            an.running(distance);
            distance = random.nextInt(1000) + 1;
            an.swimming(random.nextInt(1000) + 1);
        }
    }
}