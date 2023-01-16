package lr7;

public class superTask5 {
    protected String str;
    public superTask5(String str){this.str = str;}

    public void printNameAndFieldValue(){
        System.out.println("superTask5 " + "str=" + str);
    }
    public class firstSubTask5 extends superTask5{

        protected int in;

        public firstSubTask5(String str, int in){
            super(str);
            this.in = in;
        }
        @Override
        public void printNameAndFieldValue(){
            System.out.println("firstSubTask5 " + "str=" + str + " in=" + in);
        }
    }
    public class secondSubTask5 extends superTask5{
        protected char ch;
        public secondSubTask5(String str, char ch){
            super(str);
            this.ch = ch;
        }
        @Override
        public void printNameAndFieldValue(){
            System.out.println("firstSubTask5 " + "str=" + str + " ch=" + ch);
        }

    }
}
