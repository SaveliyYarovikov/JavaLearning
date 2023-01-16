package lr7;

public class superTask4 {
    public char ch;
    public superTask4(char a){this.ch = a;}

    public superTask4 copySuperTask4(char ch){
        superTask4 copySuperTask4 = new superTask4(ch);
        copySuperTask4.ch = this.ch;
        return copySuperTask4;
    }
    public static class subTask4 extends superTask4{
        public String str;
        public subTask4(char a, String b){
            super(a);
            this.str = b;
        }
        public subTask4 copySubTask4(char ch){
            subTask4 copySubTask4 = new subTask4(ch, str);
            copySubTask4.str = this.str;
            return copySubTask4;
        }
        public static class subSubTask4 extends subTask4{

            public int in;
            public subSubTask4(char a, String b, int c){
                super(a,b);
                this.in = c;
            }
            public subSubTask4 copySubSubTask4(char ch){
                subSubTask4 copySubSubTask4 = new subSubTask4(ch,str,in);
                copySubSubTask4.in = this.in;
                return copySubSubTask4;
            }
        }
    }
}
