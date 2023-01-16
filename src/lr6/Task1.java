package lr6;

public class Task1 {

    char ch1;
    String str1;

    public void SetValue(char a){
        this.ch1 = a;
    }
    public void SetValue(String a){
        this.str1 = a;
    }
    public void SetValue(char[] a){

        String string = new String(a);

        if (a.length == 1){
            this.ch1 = a[0];
        }
        else if (a.length > 1){
            this.str1 = string;
        }
    }
}
