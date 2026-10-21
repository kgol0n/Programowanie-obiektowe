package Zadanie3;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;

    public String getTitle() {
        return title;
    }

    public Book(String title, String author, int numberOfPages) {
        setTitle(title);
        setAuthor(author);
        setNumberOfPages(numberOfPages);
    }

    public void setTitle(String title) {
        if(title == null || title.isEmpty()){
        this.title = "";}
        else {
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author == null || author.isEmpty()){
        this.author = "";} else{
            this.author = author;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return numberOfPages == book.numberOfPages && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public String toString() {
        return "Book: " + this.title + " by " + this.author + ", Pages: " + this.numberOfPages + ".";
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, numberOfPages);
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if(numberOfPages < 0){
            this.numberOfPages = 1;
        } else {
            this.numberOfPages = numberOfPages;
        }
    }
}
