import java.time.LocalDate;

public class Programmer extends Person{

    private String lang;


    public Programmer() {
    }

    public Programmer(String lang) {
        this.lang = lang;
    }

    public Programmer(String typeOfWork, String place, LocalDate yearOfWorking, String lang) {
        super( typeOfWork, place, yearOfWorking );
        this.lang= lang;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String coder(){
        return "Coding";
    }

    @Override
    public String toString() {
        return "Programmer{}";
    }
}

