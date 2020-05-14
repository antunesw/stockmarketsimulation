package builders;

public class InvestorBuilder implements InvestorBilderInterface{

    private String firtName;
    private String lastName;
    private int budget;


    public void setFirstName(String firstName){
        this.firtName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setBudget(int budget){
        this.budget = budget;
    }
    public Investor getObject(){
        return new Investor(this.firtName, this.lastName, this.budget);
    }
}
