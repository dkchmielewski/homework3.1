class BookDatabase {
    public static void main(String[] args) {
        Book book1 = new Book("War and Peace", "Leo Tolstoy", 1966 );
        Book book2 = new Book("Master and Margarita", "Mikhail Bulgakov", 1966);

        System.out.println("Book 1:");
        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("Published: " + book1.year);
        System.out.println("\nBook 2:");
        System.out.println("Title: " + book2.title);
        System.out.println("Author: " + book2.author);
        System.out.println("Published: " + book2.year);

    }
}
