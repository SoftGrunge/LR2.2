package university;

public class Video  extends Sound{
    public Video(String name, int size, FileFormat format, ConvertTime convertTime, String description, int pictureLength, int pictureWidth){
        super(name, size, format, convertTime, description, pictureLength, pictureWidth);
    }




@Override
    public String toString(){
    return String.format("30-%s|",getName())+String.format("%20s|", getSize()) + String.format("%-50s|",getFormat()+","
            + getDescription()+","+getConvertTime().stringConvertTime()+
            ","+getPictureLength()+"x"+getPictureWidth());
}
}
