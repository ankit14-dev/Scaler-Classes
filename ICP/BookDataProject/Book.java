// package BookDataProject;

public class Book {
    private String name;
    private String author;
    private double user_rating;
    private String reveiws;
    private int price;
    private int year;
    private String genre;

    public Book(String name, String author, double user_rating, String reveiws, int price, int year, String genre) {
        this.name = name;
        this.author = author;
        this.user_rating = user_rating;
        this.reveiws = reveiws;
        this.price = price;
        this.year = year;
        this.genre = genre;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setUser_rating(double user_rating) {
        this.user_rating = user_rating;
    }

    void setReveiws(String reveiws) {
        this.reveiws = reveiws;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setGenre(String genre) {
        this.genre = genre;
    }

    String getName() {
        return this.name;
    }

    String getAuthor() {
        return this.author;
    }

    double getUser_rating() {
        return this.user_rating;
    }

    String getReveiws() {
        return this.reveiws;
    }

    int getPrice() {
        return this.price;
    }

    int getYear() {
        return this.year;
    }

    String getGenre() {
        return this.genre;
    }

}
/* 
 * Read data from file
 * load your data of books
 * implement the function
 * 
 * open file and load list  of books
 * to implement this function
 */