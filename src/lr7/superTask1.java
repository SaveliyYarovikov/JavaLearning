package lr7;

public class superTask1 {

    private String str1;

    public superTask1(String str1) {
        this.str1 = str1;
    }
    superTask1(){
    }

    @Override
    public String toString() {
        return "Task1{" +
                "str1='" + str1 + '\'' +
                '}';
    }

    public static class subSuperTask1 extends superTask1 {

        private String str2;
        private String str3;

        public subSuperTask1(String str1Ex){
            super(str1Ex);
        }
        subSuperTask1(String str2Ex, String str3Ex){
            this.str2 = str2Ex;
            this.str3 = str3Ex;
        }

        @Override
        public String toString() {
            return "subTask1{" +
                    "str2='" + str2 + '\'' +
                    ", str3='" + str3 + '\'' +
                    '}';
        }
    }
}
