import java.time.LocalDate;

public class InsuredPerson {
    private String name;
    private LocalDate dateOfBirth;
    private double InsuranceCost;

    //геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getInsuranceCost() {
        return InsuranceCost;
    }

    public void setInsuranceCost(double insuranceCost) {
        InsuranceCost = insuranceCost;
    }

    //конструкторы

    public InsuredPerson(String name, LocalDate dateOfBirth, double insuranceCost) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        InsuranceCost = insuranceCost;
    }

    //toString
    @Override
    public String toString() {
        return
                "Имя: " + name  + System.lineSeparator()+
                "Дата рождения: " + dateOfBirth + System.lineSeparator()+
                "Стоимость страховки: " + InsuranceCost +"грн." + System.lineSeparator();
    }
}
