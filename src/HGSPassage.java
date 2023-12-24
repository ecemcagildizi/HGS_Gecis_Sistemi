public class HGSPassage {
    private String date;
    private String route;
    private double fee;

    public HGSPassage(String date, String route, double fee){
        this.date = date;
        this.route = route;
        this.fee = fee;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getRoute(){
        return route;
    }

    public void setRoute(String route){
        this.route = route;
    }

    public double getFee(){
        return fee;
    }

    public void setFee(double fee){
        this.fee = fee;
    }

}
