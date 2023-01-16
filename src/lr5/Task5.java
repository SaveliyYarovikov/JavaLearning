package lr5;

public class Task5 {

    private int x;

    public void OpenMethod(){
        x = 0;
    }
    public void OpenMethod(int a){
        if (a <= 100){
            x = a;
        }
        else{
            x = 100;
        }
    }
    public int ValueCheck (){
        return x;
    }
    public Task5(int a){
        this.x = a;
    }
}


