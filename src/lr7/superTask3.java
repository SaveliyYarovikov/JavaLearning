package lr7;

public class superTask3 {
    public int x;
    public superTask3(int a){this.x = a;}

    public void setValue(int a){
        this.x = a;
    }
    @Override
    public String toString() {
        return "superTask3 {" + "x=" + x + "}";
    }
    public static class subTask3 extends superTask3{
        public char ch;
        public subTask3(int a, char b){
            super(a);
            this.ch = b;
        }
        public void setValue(int a, char b){
            this.x = a;
            this.ch = b;
        }
        @Override
        public String toString() {
            return "subTask3{" + "x=" + x + " ch=" + ch + "}";
        }
        public static class subsubTask3 extends subTask3{
            public String str1;
            public subsubTask3(int a, char b, String c) {
                super(a, b);
                this.str1 = c;
            }
            public void setValue(int a, char b, String c){
                this.x = a;
                this.ch = b;
                this.str1 = c;
            }
            @Override
            public String toString() {
                return "subsubTask3{" + "x=" + x + " ch=" + ch + " str1=" + str1 + "}";
            }
        }
    }
}
