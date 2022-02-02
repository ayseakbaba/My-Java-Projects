public class Arrays_Project_Card {
    private char value;
    private boolean forecast = false;

    public Arrays_Project_Card(char value){
        this.value = value;   
    }


    public void setValue(char value){
        this.value = value;
    }
    public char getValue(){
        return value;
    }


    public void setForecast(boolean forecast){
        this.forecast = forecast;
    }
    public boolean isForecast(){
        return forecast;
    }
}
