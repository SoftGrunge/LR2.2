package university;

public class Video  extends Sound{
    public Video(String name, int size, FileFormat format, ConvertTime convertTime, String description, int pictureLength, int pictureWidth){
        super(name, size, format, convertTime, description, pictureLength, pictureWidth);
    }




@Override
    public String toString(){
    return  String.format("%s%7s%d%4s%s%s%s%s%s%s%1d%s%d%s",getName(),"|",getSize(),"|",getFormat(),", ", getConvertTime().stringConvertTime(),", ",
            getDescription(),", ",getPictureLength(),"x",getPictureWidth(),"|");
}
}
