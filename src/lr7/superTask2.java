package lr7;

public class superTask2 {
    private String str1;
    public superTask2(String str1){this.str1 = str1;}
    public void setter() {this.str1 = "присвоение";}
    public void setter(String str1) {
        this.str1 = str1;
    }

    public int getStringLength(){
        if (str1 == null){
            return 0;
        }
        return str1.length();
    }
    public String getStr1() {return str1;}
    public static class subTask2 extends superTask2{
        public int x;
        public subTask2(String str1, int x){
            super(str1);
            this.x = x;
        }
        @Override
        public void setter (){
            this.x = 0;
            super.setter("присвоение");
        }
        @Override
        public void setter (String a){
            this.x = 0;
            super.setter(a);
        }
        public void setter (int a){
            this.x = a;
            super.setter("присвоение");
        }

        public void setter (String a, int b){
            this.x = b;
            super.setter(a);
        }

    }
}
