public class Main {
    public static void main(String[] args) {

        Middle myMiddle=new Middle();
        int average =myMiddle.calculate();
        System.out.println("Average:"+average );


        AnotherMiddle1 myMiddle1 = new AnotherMiddle1();
        int result1 = myMiddle1.calculate();
        System.out.println("Average: " + result1);

        AnotherMiddle2 myMiddle2 = new AnotherMiddle2();
        int result2 = myMiddle2.calculate();
        System.out.println("Average: " + result2);
    }
}
