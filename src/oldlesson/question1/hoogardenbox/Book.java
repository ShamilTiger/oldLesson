package oldlesson.question1.hoogardenbox;

public class Book {
        private String author;
        private String name;
        private double price;
        private int yearPblc;

        Book() {
            author = "Не определено";
            name = "Не определено";
            price = 0.0;
            yearPblc = 0;
        }

        Book(String author, String name, double price, int yearPblc) {
            this.author = author;
            this.name = name;
            this.price = price;
            this.yearPblc = yearPblc;
        }

        Book(String author, int yearPblc) {
            this();
            this.author = author;
            this.yearPblc = yearPblc;
        }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearPblc() {
        return yearPblc;
    }

    public void setYearPblc(int yearPblc) {
        this.yearPblc = yearPblc;
    }

    @Override
    public String toString() {
        return name;
    }
}
