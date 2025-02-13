// package BookDataProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
// import BookDataProject.Book;
import java.util.Arrays;

public class CSVDataLoader {
    String filePath;
    CSVDataLoader(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<Book> csvParser() throws IOException, FileNotFoundException {
        ArrayList<Book> bookList = new ArrayList<Book>();


        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line= br.readLine();
        while ((line=br.readLine()) != null) {
            String[] fields = line.split("\\|");
            System.out.println(Arrays.toString(fields));
            System.out.println(fields[0]);
            String name = fields[0];
            String author = fields[1];
            double user_rating=Double.parseDouble(fields[2]);
            String reviews = fields[3];
            int price=Integer.parseInt(fields[4]);
            int year=Integer.parseInt(fields[5]);
            String genre = fields[6];
            Book book = new Book(name, author, user_rating, reviews, price, year, genre);
            bookList.add(book);
        }
        br.close();

        return bookList;
    }
}
