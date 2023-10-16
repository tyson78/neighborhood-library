package org.pluralsight;

class Book {
    int id;
    String title;

    public Book(int id, String title, String isbn, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    String isbn;
    boolean isCheckedOut;
    String checkedOutTo;

    void checkOut(String borrower){

        isCheckedOut = true;
        checkedOutTo = borrower;

    }

    void checkIn(){
        isCheckedOut = false;
        checkedOutTo = "";
    }
}
