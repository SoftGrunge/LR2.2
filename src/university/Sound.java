package university;

public class Sound extends Picture{

    private String description;
    private ConvertTime convertTime;
    public Sound (String name, int size, FileFormat format, ConvertTime convertTime, String description, int pictureLength, int pictureWidth){
        super(name, size, format, pictureLength, pictureWidth);
setConvertTime(convertTime);
setDescription(description);
    }
    public Sound (String name, int size, FileFormat format, ConvertTime convertTime, String description){
        super (name,size,format, convertTime);
        setDescription(description);
        setConvertTime(convertTime);
    }


public ConvertTime getConvertTime(){
        return convertTime;
}
public void setConvertTime(ConvertTime convertTime){
        if(convertTime==null){
            throw new IllegalArgumentException("Поле не должно быть пустым");
        }else
            this.convertTime=convertTime;
}
    public String getDescription() {
        return description;
    }

    public void setDescription(String description){
        if(description==null){
            throw new IllegalArgumentException("Поле не должно быть пустым");
        }else
            this.description=description;
    }
@Override
    public String toString(){
        return  String.format("%s%6s%d%7s%s%s%s%s%s", getName(),"|", getSize(), "|" , getFormat(), ", " , getConvertTime().stringConvertTime(), ", " , getDescription());
}// String.format("%s%s%d%s%s%s%s%s%s" getName(),"|", getSize(), "|" , getFormat(), "," , getConvertTime().stringConvertTime(), "," , getDescription()
}
