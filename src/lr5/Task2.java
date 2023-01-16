package lr5;

public class Task2 {

    char ch1;
    char ch2;

    public void setCh1(char ch1) {

        this.ch1 = ch1;
    }
    public void setCh2(char ch2) {

        this.ch2 = ch2;
    }

    public String PrintAllSymbolsBetween(){

        int[] intsArray = new int[Math.abs((int)ch1 - (int)ch2) + 1];

        char[] charsArray = new char[intsArray.length];

        for(int i = 0; i < intsArray.length; i++){
            if ((int)ch1 > (int)ch2){
                intsArray[i] = (int)ch2 + i;
            }
            else {
                intsArray[i] = (int)ch1 + i;
            }

        }
        for (int i = 0; i < charsArray.length; i++){
            charsArray[i] = (char)intsArray[i];
        }

        String str = new String(charsArray);

        return str;
    }


}
