package main.java;

public class Test {
    private int i;
    public Test(int i){
        this.i = i;
    }
    
    static void changeRef(Test test){
        test = new Test(1);
    }
    
    public static void main(String[] args){
        Test test = new Test(2);
        changeRef(test);
        System.out.println(test.i);
    }
}
