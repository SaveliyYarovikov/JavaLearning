package lr5;

public class Task6 {

    private int min;
    private int max;

    public void OpenMethod(int a){
        if (a > max){
            this.max = a;
        }
        else if(a < min){
            this.min = a;
        }
    }
    public void OpenMethod(int a, int b){
        if (a > max){
            this.max = a;
        }
        else if (a < min) {
            this.min = a;
        }
        if (b > max){
            this.max = b;
        }
        else if (b < min) {
            this.min = b;
        }

    }
    public void PrintFieldValue(){
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
    public Task6 (int a, int b){
        if (a > b){
            this.max = a;
            this.min = b;
        }
        else if(a < b){
            this.min = a;
            this.max = b;
        }
        else {
            this.min = a;
            this.max = b;
        }
    }
}
