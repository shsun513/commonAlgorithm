package Reflect;
@SuppressWarnings("unused")
public class Test {


    private String name;
    private int age;

    private Test(int age){
        this.age = age;
    }

    
	private void speak(String name){
        System.out.println("我的名字是:"+name);
    }

    public Test(String name) {
        this.name = name;
    }
}