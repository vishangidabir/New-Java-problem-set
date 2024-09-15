package com.company;

import java.security.spec.RSAOtherPrimeInfo;

class Library{
    String [] books;
    int noOfBooks ;

    public Library() {
        this.books = new String[100];
        this.noOfBooks = 0;
    }


    public void addBook(String book){
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book+" has been added !");
    }

    public void issueBook(String book){
        for(int i=0; i<=this.books.length;i++){
            if( this.books[i].equals(book)){
                System.out.println("The book has been issued");
                this.books[i] =null;
                return;
            }
        }
        System.out.println("This book does not exit!");
    }

    public String returnBook(String book){
        return book;
    }

    public void showAvailableBook(){
        System.out.println("Availabel books are :");
        for(String book : this.books){
            if( book == null){
              continue;
            }
            System.out.println("*"+ book);
        }
    }
}
public class Chw_54_exeSol5 {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Rich dad poor dad");
        library.addBook("Data Structure And Alogarithm");
        library.addBook("Godan");

        library.showAvailableBook();

        library.issueBook("Godan");
        library.showAvailableBook();



    }
}
