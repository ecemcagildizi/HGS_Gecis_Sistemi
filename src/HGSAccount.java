import java.util.ArrayList;
import java.util.List;

public class HGSAccount {
    private String name;
    private Long tcKimlikNo;
    private String surname;
    private Double balance;

    private List<HGSPassage> passages;

    public HGSAccount(String name,String surname,Long tcKimlikNo){
        this.name = name;
        this.surname = surname;
        this.tcKimlikNo = tcKimlikNo;
        this.balance = 0.0;
        this.passages = new ArrayList<>();
    }

    public void addPassage(HGSPassage hgsPassage) {
        passages.add(hgsPassage);
    }

    public void deposit(double balance){
        this.balance = balance;
        balance += balance;
    }

    public void displayPassages(){
        for(HGSPassage hgsPassage : passages){
            System.out.println("Date: "+hgsPassage.getDate());
            System.out.println("Route: "+hgsPassage.getRoute());
            System.out.println("Fee: "+hgsPassage.getFee());
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public long getTcKimlikNo(){
        return tcKimlikNo;
    }

    public void setTcKimlikNo(long tcKimlikNo){
        this.tcKimlikNo = tcKimlikNo;
    }

}
