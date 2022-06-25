package university;
// Efimov DA
public class Main {

    public static void main(String[] args) {
        File[] file = {
                new Doc("j110-lab2-hiers.docx", 23212, 2, FileFormat.docx),
                new Picture("spb-map.png", 1703527, FileFormat.png, 1024, 3072),
                new Sound("06-PrettyWoman.mp3", 7893454, FileFormat.mp3, new ConvertTime(0, 5, 28), "Eric Clapton, Pretty Woman" ),
                new Video("BackToFuture1.avi", 1470984192, FileFormat.avi, new ConvertTime(1,48,8), "Back to future I,1985", 640, 352),
        };
        File.printAll(file);
        System.out.println();
    }
}
