public class Tiger extends Animal{
    //final private int run = 600, swim = 5;
    //private String name;
    @Override
    public void running(int distance){
        System.out.format("%s is a tiger. ", super.getName());
        super.running(distance);
    }
    @Override
    public void swimming(int distance){
        System.out.format("%s is a tiger. ", super.getName());
        super.swimming(distance);
    }
    public Tiger(String n){
        super(n, 600, 5);
    }
    public Tiger(){
        super();
    }
}
