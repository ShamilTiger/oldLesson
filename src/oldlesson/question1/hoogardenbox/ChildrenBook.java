package oldlesson.question1.hoogardenbox;

public class ChildrenBook extends Book{
    private int minage;

    public int getMinage() {
        return minage;
    }

    public void setMinage(int minage) {
        this.minage = minage;
    }



    ChildrenBook(){
        super();
        minage = 0;
    }


    ChildrenBook(String author, int yearPblc){
        this();
        setAuthor(author);
        setYearPblc(yearPblc);
    }

    ChildrenBook(String author, String name, double price, int yearPblc, int minage) {
        super(author, name, price, yearPblc);
        this.minage = minage;
    }

}
