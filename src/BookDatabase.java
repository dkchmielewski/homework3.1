class BookDatabase {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "War and Peace";
        book1.author = "Leo Tolstoy";
        book1.year = 1867;

        Book book2 = new Book();
            book2.title = "Master and Margarita";
            book2.author = "Mikhail Bulgakov";
            book2.year = 1966;

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
