package Serialize;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private String name;
    public int age;
    private List<String> coucou;
    private String[] s;
    public Test(){
        name="Nathan";
        age=20;
        coucou=new ArrayList<String>();
        s=new String[10];
    }
    public static void main(String[] args){
        Test t=new Test();
        Serialize.Serialize(t.getClass());
    }
}

