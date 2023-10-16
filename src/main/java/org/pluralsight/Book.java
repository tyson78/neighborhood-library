package org.pluralsight;

class Book {
    int id;
    String title;
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
