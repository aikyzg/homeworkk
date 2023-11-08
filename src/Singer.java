import java.time.LocalDate;

public class Singer extends Person {

    private String music;

    public Singer (){}
    public Singer(String music) {
        this.music = music;
    }

    public Singer(String typeOfWork, String place, LocalDate yearOfWorking, String music) {
        super( typeOfWork, place, yearOfWorking );
        this.music = music;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }
    public String Singer(){
        return "singing";
    }

    @Override
    public String toString() {
        return "Singer{}";
    }
}
