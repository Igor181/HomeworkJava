public class Maine_Coon extends Cat{
    //final private int run = 300, swim = 10;
    //private String name;
    @Override
    public void running(int distance){
        System.out.format("%s's breed is Maine Coon. ", super.getName());
        super.running(distance);
    }
    @Override
    public void swimming(int distance){
        System.out.format("%s's breed is Maine Coon. ", super.getName());
        super.swimming(distance);
    }
    public Maine_Coon(String n){
        super(n, 300, 10);
    }
    public Maine_Coon(){
        super();
    }
}
