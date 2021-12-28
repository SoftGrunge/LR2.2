package university;

public abstract class File {
    private String name;
    private int size;
    private FileFormat format;

    public File(String name, int size, FileFormat format) {
        setName(name);
        setSize(size);
        setFormat(format);
    }

    public FileFormat getFormat(){
        return format;
    }
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name){
        if(name==null){
            throw new IllegalArgumentException("Поле не должно быть пустым");
        }else
            this.name=name;
    }
    public void setSize(int size){
        if(size<=0){
            throw new IllegalArgumentException("Размер должен быть больше нуля");
        }else
            this.size=size;
    }
    public void setFormat(FileFormat format){
        if(format==null){
            throw new IllegalArgumentException("Поле не должно быть пустым");
        }else
            this.format=format;
    }
@Override
public abstract String toString();

    public static void printAll(File[] file) {
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println(String.format("%-23s|", "File Name") + String.format("%-20s|", "Size")
                + String.format("%-50s|", "Details"));
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        for (File f: file) {
            System.out.println(f.toString());
        }
        System.out.println("_____________________________________________________________________________________________________________");
    }


}
