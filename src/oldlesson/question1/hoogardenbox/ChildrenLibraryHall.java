package oldlesson.question1.hoogardenbox;

public class ChildrenLibraryHall {
   private ChildrenBook childrenBooks[];

   private String nameHall;
  /* private int size;*/


   public ChildrenLibraryHall(String nameHall, int size) {
      this.nameHall = nameHall;
      childrenBooks = new ChildrenBook[size];
   }

   public int getBooksQuantity() {
      int quantity =0;
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
      for (int i = 0; i <childrenBooks.length ; i++) {
         if (childrenBooks[i] != null) {
            System.out.println(childrenBooks[i].getName());
         }
      }
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
