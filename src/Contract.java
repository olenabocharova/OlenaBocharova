import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

public class Contract {
    private int id;
    private LocalDate conclusionDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private Client client;
    private ArrayList<InsuredPerson> insuredPeople;

    //геттеры и сеттеры


    public int getId() {
        return id;
    }

    public LocalDate getConclusionDate() {
        return conclusionDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Client getClient() {
        return client;
    }

    public ArrayList<InsuredPerson> getInsuredPeople() {
        return insuredPeople;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setConclusionDate(LocalDate conclusionDate) {
        this.conclusionDate = conclusionDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setInsuredPeople(ArrayList<InsuredPerson> insuredPeople) {
        this.insuredPeople = insuredPeople;
    }

    //общая стоимость страховки по договору
    public double totalInsuranceCost(){
        double cost=0;
       for(int i = 0; i< insuredPeople.size(); i++){
          cost+= insuredPeople.get(i).getInsuranceCost();

          }
          return cost;

    }

    //toString


    @Override
    public String toString() {
        return  "Договор: " +System.lineSeparator()+
                "Номер договора: " + id +System.lineSeparator()+
                "Дата заключения договора: " + conclusionDate + System.lineSeparator()+
                "Дата начала действия договора: " + startDate + System.lineSeparator()+
                "Дата окончания действия договора: " + endDate + System.lineSeparator()+
                 client +System.lineSeparator()+
                "Сведения о застрахованных лицах: "  +System.lineSeparator()+ (insuredPeople == null ? null : Arrays.asList(insuredPeople))+System.lineSeparator();
    }

    //конструкторы
    public Contract(int id, LocalDate conclusionDate, LocalDate startDate, LocalDate endDate, Client client, ArrayList<InsuredPerson> insuredPeople) {
        this.id = id;
        this.conclusionDate = conclusionDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.client = client;
        this.insuredPeople = insuredPeople;
    }

    public static void main(String[] args) {
        LocalDate conc=LocalDate.of(2002,Month.APRIL,2);
        LocalDate start=LocalDate.of(2002,Month.APRIL,3);
        LocalDate end=LocalDate.of(2007,Month.APRIL,10);
        Client client= new Client(ClientType.naturalPerson,"Ivan Ivanov","Nebakulina 20");
        InsuredPerson first = new InsuredPerson("Kolya Ivanov",conc,1000);
        InsuredPerson second = new InsuredPerson("Olya Ivanova",conc,2000);

        //ArrayList<InsuredPerson> insuredPeople={first,second};
        ArrayList<InsuredPerson>insuredPeople=new ArrayList<InsuredPerson>();
     insuredPeople.add(first);
     insuredPeople.add(second);

        Contract contract= new Contract(1,conc,start,end,client,insuredPeople);

        System.out.println(contract);
        System.out.println("Общая стоимость страховки по договору: "+contract.totalInsuranceCost()+"грн.");



    }
}
