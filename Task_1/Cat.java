public class Cat extends Animal{
    //private static int run = 200, swim = 0;
    //private String name;
    @Override
    public void running(int distance){
        System.out.format("%s is a cat. ", super.getName());
        super.running(distance);
    }
    @Override
    public void swimming(int distance){
        System.out.format("%s is a cat. ", super.getName());
        super.swimming(distance);
    }

    public Cat(String n, int r, int s){
        super(n, r, s);
    }
    public Cat(String n){
        super(n, 200, 0);
    }
    public Cat(){
        super();
    }
}