package oldlesson.question1.hoogardenbox;

public class ChildrenLibraryHall {
    private ChildrenBook childrenBooks[];

    private String nameHall;
    /* private int size;*/


    public ChildrenLibraryHall(String nameHall, int quantity) {
        this.nameHall = nameHall;
        childrenBooks = new ChildrenBook[quantity];
    }

    public ChildrenLibraryHall(String nameHall, ChildrenBook[] array) {
        this.nameHall = nameHall;
        this.childrenBooks = array;
    }

    public int getBooksQuantity() {
        int quantity = 0;
        for (int i = 0; i < getSize(); i++) {
            if (childrenBooks[i] != null) {
                quantity++;
            }
        }
        return quantity;
    }

    public void putBookInHall(ChildrenBook book) {
        for (int i = 0; i < getSize(); i++) {
            if (childrenBooks[i] == null) {
                childrenBooks[i] = book;
                return;
            }
        }
    }

    public void printAllBooksName() {
        System.out.println("Название книг в зале: ");
        for (int i = 0; i < childrenBooks.length; i++) {
            if (childrenBooks[i] != null) {
                System.out.println(childrenBooks[i].getName());
            }
        }
    }

    public double getAllBooksPrice() {
        double allPrice = 0;
        for (int i = 0; i < childrenBooks.length; i++) {
            if (childrenBooks[i] != null) {
                allPrice += childrenBooks[i].getPrice();
            }
        }
        return allPrice;
    }

    public void printAllQuantity() {
        System.out.println("Всего книг в зале: " + getBooksQuantity());

    }

    public ChildrenBook getBookByNumber(int number) {
       if (number>=childrenBooks.length){
          throw new RuntimeException("Number is not valid");
       }
       return childrenBooks[number-1];

    }

    public void changeBookByNumber(int number, ChildrenBook newBook){
       if (number>=childrenBooks.length){
          throw new RuntimeException("Number is not valid");
       }
       childrenBooks[number-1] = newBook;
    }
    public void addBookByNumber(int number, ChildrenBook addedNewBook){
       if (number>=childrenBooks.length) {
          throw new RuntimeException("Number is not valid");
       }
       if (childrenBooks[number-1] != null){
          throw new RuntimeException("This number is use");
       }
       childrenBooks[number-1] = addedNewBook;
    }

    public void deleteBookByNumber(int number){
       if (number>=childrenBooks.length) {
          throw new RuntimeException("Number is not valid");
       }
       childrenBooks[number-1] = null;
    }

    public ChildrenBook getBestBook(){
       ChildrenBook bestBook = childrenBooks[0];
       for (int i = 0; i < childrenBooks.length;i++){
         if(childrenBooks[i] != null && childrenBooks[i].getPrice()>bestBook.getPrice()){
            bestBook = childrenBooks[i];
         }
       }
       return bestBook;
    }

    public String getNameHall() {
        return nameHall;
    }

    public int getSize() {
        return childrenBooks.length;
    }

   /*public void setSize(int size) {
      this.size = size;
   }*/

    public void setNameHall(String nameHall) {
        this.nameHall = nameHall;
    }


}
