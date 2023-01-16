package lr5;

public class Task1 {

    private char ch1;

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }

    public int GetSymbolCode(){
        return ch1;
    }

    public void PrintSymbolAndSymbolCode(){

        int symbolCode = ch1;
        System.out.println("Symbol: " + ch1);
        System.out.println("Symbol code: " + symbolCode);
    }
}
