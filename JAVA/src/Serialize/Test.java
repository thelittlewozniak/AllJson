package Serialize;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private String name;
    public int age;
    private List<Double> coucou;
    private Test2[] s;
    public Test2 t;
    public Test(){
        name="Nathan";
        age=20;
        coucou=new ArrayList<Double>();
        coucou.add(10.0);
        coucou.add(20.3);
        s=new Test2[10];
        for(int i=0;i<s.length;i++){
            s[i]=new Test2();
        }
        t=new Test2();
    }
    public static void main(String[] args){
        Test t=new Test();
        System.out.println(Serialize.Serialize(t));
    }
}

