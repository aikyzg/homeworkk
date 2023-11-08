import java.time.LocalDate;

public class Person {
    private String typeOfWork;
    private String place;
    private LocalDate YearOfWorking;

    public Person() {
    }

    public Person(String typeOfWork, String place, LocalDate yearOfWorking) {
        this.typeOfWork = typeOfWork;
        this.place = place;
        YearOfWorking = yearOfWorking;
    }

    public String getTypeOfWork() {
        return typeOfWork;
    }

    public void setTypeOfWork(String typeOfWork) {
        this.typeOfWork = typeOfWork;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public LocalDate getYearOfWorking() {
        return YearOfWorking;
    }

    public void setYearOfWorking(LocalDate yearOfWorking) {
        YearOfWorking = yearOfWorking;
    }

    @Override
    public String toString() {
        return "Person{" +
                "typeOfWork='" + typeOfWork + '\'' +
                ", place='" + place + '\'' +
                ", YearOfWorking=" + YearOfWorking +
                '}';
    }
}

