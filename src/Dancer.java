import java.time.LocalDate;

public class Dancer extends Person{


    private String typeOfDance;

    public Dancer(){}
    public Dancer(String typeOfDance) {
        this.typeOfDance = typeOfDance;
    }

    public Dancer(String typeOfWork, String place, LocalDate yearOfWorking, String typeOfDance) {
        super( typeOfWork, place, yearOfWorking );
        this.typeOfDance = typeOfDance;
    }

    public String getTypeOfDance() {
        return typeOfDance;
    }

    public void setTypeOfDance(String typeOfDance) {
        this.typeOfDance = typeOfDance;
    }

    public String dancing(){
        return "dancing";
    }


    @Override
    public String toString() {
        return "Dancer{}";
    }
}

