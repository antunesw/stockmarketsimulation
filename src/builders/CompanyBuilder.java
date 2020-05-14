package builders;

public class CompanyBuilder {

    private String name;
    private int nShare;
    private int IPOSharePrice;

    public void setName(String name){
        this.name = name;
    }

    public void setNShare(int amount){
        this.nShare = amount;
    }
    public void setIPOShareValue(int value){
        this.IPOSharePrice = value;
    }
    public Company getObject(){
        return new Company(this.name, this.nShare, this.IPOSharePrice);
    }

}
