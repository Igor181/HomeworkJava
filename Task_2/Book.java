public class Book {
    private String name;
    private Author author;
    private double price;
    private int qti;

    public Book(String name, Author author, double price, int qti){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qti = qti;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQti(){
        return qti;
    }
    public void setQti(int qti){
        this.qti = qti;
    }
    public String toString(){
        return "\""+ name + "\" от " + author.toString();
    }
}
