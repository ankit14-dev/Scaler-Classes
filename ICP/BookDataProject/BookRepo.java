// package BookDataProject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
// import BookDataProject.Book;
// import BookDataProject.CSVDataLoader;

public class BookRepo {
    ArrayList<Book> bookList;

    public BookRepo(String filePath) throws FileNotFoundException, IOException {
        CSVDataLoader csvDataLoader = new CSVDataLoader(filePath);
        this.bookList = csvDataLoader.csvParser();
    }

    public void printTitlesofAllBooks() {
        for (int i = 0; i < bookList.size(); i++) {
            {
                System.out.println(bookList.get(i).getName());
            }
        }
    }
}
