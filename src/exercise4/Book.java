package exercise4;

public class Book {
     String name;
     double cost;
     String isbn;
     int pages;

    public Book(){
        this("Title Not Available",0.00,"ISBN Not Available",0);
    }

    public Book(String name, double cost, String isbn, int pages) {
        setName(name);
        setCost(cost);
        setIsbn(isbn);
        setPages(pages);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        return "Name = " + getName() + "\nCost = " + getCost() +
                "\nISBN = " + getIsbn() + "\nPages = " + getPages();
    }
}
