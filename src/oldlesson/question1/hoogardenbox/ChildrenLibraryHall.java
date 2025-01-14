package oldlesson.question1.hoogardenbox;

public class ChildrenLibraryHall {
   private ChildrenBook childrenBooks[];

   private String nameHall;
  /* private int size;*/


   public ChildrenLibraryHall(String nameHall, int quantity) {
      this.nameHall = nameHall;
      childrenBooks = new ChildrenBook[quantity];
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
      System.out.println("Название книг в зале: ");
      for (int i = 0; i <childrenBooks.length ; i++) {
         if (childrenBooks[i] != null) {
            System.out.println(childrenBooks[i].getName());
         }
      }
   }
//   public double getAllBooksPrice(ChildrenLibraryHall nameHall){
//      double allPrice = 0;
//      double price = 0;
//      System.out.println("Стоимость всех книг в зале равна: ");
//      for (int i = 0; i <childrenBooks.length ; i++){
//         if(childrenBooks[i] != null){
//            childrenBooks[i].getPrice() = price;
//         }
//         allPrice =
//      }
   }

   public int getAllQuantity(ChildrenLibraryHall nameHall){
      System.out.print("Всего книг в зале: ");
      return getBooksQuantity();
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
