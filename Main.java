/*
    Nama : Djulizah Bonita L.
    NIM : H071211073
*/

public class Main {
    public static void main(String[] args) {
        
        //membuat author baru
        //"M" untuk Male, "W" untuk Woman
        Author author = new Author("Akutagawa", "aktgwa@mail.com", 'M'); 


        //membuat book baru
        Book book = new Book("The Spiders's Thread", author, 50000);


        //Menampilkan info dari tiap Author dan Book
        System.out.println("Author info: " + author.getName() + " | mail: " + author.getEmail() + " | gender: " + author.getGender());
        System.out.println("Book info: " + book.getName() + " by " + book.getAuthor().toString() + " | price: " + book.getPrice());

    }
}
