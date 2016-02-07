package librarycatalogue;

/**
 * Created by maheshkumar on 12 January 2016.
 */
public class Book
{
    // Properties, Fields, Global Variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut ;// whether or not the book is checked out
    int dayCheckedOut = -1;

    //Constructor
    public Book(String bookTitle, int bookPageCount, int bookISBN)
    {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        this.isCheckedOut = false;
    }

    //Getters --> Instance methods
    public String getTitle()
    {
        return this.title ;
    }

    public int getPageCount()
    {
        return this.pageCount;
    }

    public int getISBN()
    {
        return this.ISBN;
    }

    public boolean getIsCheckedOut()
    {
        return this.isCheckedOut;
    }

    public int getDayCheckedOut()
    {
        return this.dayCheckedOut ;
    }

    //Setters

    public void setIsCheckedOut ( boolean newIsCheckedOut , int currentDayCheckedOut)
    {
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);

    }

    private void setDayCheckedOut(int day)
    {
        this.dayCheckedOut = day;
    }
}
