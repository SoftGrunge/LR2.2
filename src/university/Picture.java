package university;

public class Picture extends File {
    private int pictureWidth;
    private int pictureLength;
    private ConvertTime convertTime;
public Picture(String name, int size, FileFormat format, ConvertTime convertTime){
    super(name,size,format);

}

    public Picture(String name, int size, FileFormat format, int pictureLength, int pictureWidth) {
        super(name, size, format);
        setPictureLength(pictureLength);
        setPictureWidth(pictureWidth);
    }

    public int getPictureWidth() {
        return pictureWidth;
    }

    public int getPictureLength() {
        return pictureLength;
    }

    public void setPictureLength(int pictureLength) {
        if (pictureLength <= 0) {
            throw new IllegalArgumentException("Высота картинки должна быть больше 0");
        } else
            this.pictureLength = pictureLength;
    }

    public void setPictureWidth(int pictureWidth) {
        if (pictureWidth <= 0) {
            throw new IllegalArgumentException("Ширина картинки должна быть больше 0");
        } else
            this.pictureWidth = pictureWidth;
    }
@Override
    public String toString(){
    return String.format("100%s|",getName())+String.format("%20s|", getSize()) + String.format("%-50s|",getFormat()+","+getPictureLength()+"x"+getPictureWidth());
}

}