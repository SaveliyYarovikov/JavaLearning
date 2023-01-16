package lr5;

public class Task4 {

    int in1;
    char ch1;

    public Task4(char ch1, int in1){
        this.ch1 = ch1;
        this.in1 = in1;
    }
    public Task4(double value){
        int symbolCode = (int)value;
        ch1 = (char)symbolCode;

        double newValue = value - symbolCode;
        in1 = (int)(newValue * 100);
    }
}

