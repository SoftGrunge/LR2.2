package university;

public class Doc extends File {
    private int pages;

    public Doc(String name, int size, int pages, FileFormat format) {
        super(name, size, format);
        setPages(pages);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException("Количество страниц должно быть больше нуля");
        } else
            this.pages = pages;
    }
@Override
    public String toString(){
       return  String.format("30-%s|",getName())+String.format("%11s|", getSize())+String.format("%-50s|",getFormat()+","+getPages()+" pages");
}


}