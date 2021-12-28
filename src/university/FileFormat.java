package university;

public enum FileFormat {
    docx("docx"),
    png("image"),
    mp3("audio"),
    avi("video");
private String format;
 FileFormat(String format){
this.format=format;
}
public String getFormat(){
    return format;
}
}
