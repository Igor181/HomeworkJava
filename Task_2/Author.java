public class Author {
    private String email, name;
    private char gender;
    public  Author(String n, String e, char g){
        email = e;
        name = n;
        gender = g;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String e){
        email = e;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return name+" ("+gender+") "+email;
    }
}
