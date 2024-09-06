public class Main {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling", "jkrowling@example.com", 'F');

        
        Book book = new Book("Harry Potter and the Sorcerer's Stone", author, 29.99, 100);

        
        System.out.println(book.toString());
    }
}
