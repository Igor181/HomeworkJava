public class Dog extends Animal{
    //final private int run = 500, swim = 10;
    //private String name;
    @Override
    public void running(int distance){
        System.out.format("%s is a dog. ", super.getName());
        super.running(distance);
    }
    @Override
    public void swimming(int distance){
        System.out.format("%s is a dog. ", super.getName());
        super.swimming(distance);
    }
    public Dog(String n){
        super(n, 500, 10);
    }
    public Dog(){
        super();
    }
}
