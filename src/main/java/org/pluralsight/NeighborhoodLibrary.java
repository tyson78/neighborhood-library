package org.pluralsight;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class NeighborhoodLibrary {

    static Book[] books = {
            new Book(1,"1Q84", "isbn", false, " ")
    };

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.printf("%10.2f \n", 120.1);

        String s = "hello , world";
        String[] strings = s.split(",");
        // strings = {"hello "," world"}

        // two ways to print "Hello World"
        for (String s1 : strings) {
            StringBuilder sb = new StringBuilder(s1.trim()); // "hello"
            sb.replace(0, 1, sb.substring(0,1).toUpperCase()); //HELL
            s1 = sb.toString();
            System.out.println(s1);
            //System.out.println(s1.trim().replaceFirst(s1.trim().substring(0,1), s1.trim().substring(0,1).toUpperCase()));
        }

        for (Book b : books) {
            System.out.println(b.title);
        }


    }
}