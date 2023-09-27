public class Animal {
    private int run, swim;
    private String name;
    public void running(int distance){
        if (run >= distance) {
            System.out.format("%s running %d m.\n", name, distance);
        } else {
            System.out.format("%s can't run %d m.\n", name, distance);
        }
    }

    public void swimming(int distance){
        if (swim >= distance) {
            System.out.format("%s swimming %d m.\n", name, distance);

        } else {
            System.out.format("%s can't swim %d m.\n", name, distance);
        }
    }

    public void setName(String n){
        name = n;
    }

    public String getName() {
        return name;
    }

    public Animal(String n, int r, int s){
        name = n;
        run = r;
        swim = s;
    }

    public Animal(){
        name = "Unnamed";
        run = 0;
        swim = 0;
    }
}