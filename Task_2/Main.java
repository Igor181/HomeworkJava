// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Author auth = new Author("Толстой", "tolstoy@gmail.com", 'м');
        System.out.println(auth.getName()+", "+auth.getEmail()+", "+auth.getGender()+"\n"+auth.toString());
        auth.setEmail("tolst@gmail.com");
        System.out.println(auth.getEmail());
        Book kniga = new Book("Война и мир", auth, 170.5, 5);
        System.out.println(kniga.toString());
    }
}