// package BookDataProject;

import java.io.FileNotFoundException;
import java.io.IOException;
// import BookDataProject.BookRepo;

public class BookDataDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        BookRepo bookRepo = new BookRepo("./datav1.csv");
        bookRepo.printTitlesofAllBooks();

    }
}
