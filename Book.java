class Book {
    private String name;
    private Author author;
    private double price;

    Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    String getName() {
        return name;
    }
    Author getAuthor() {
        return author;
    }
    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }
}
