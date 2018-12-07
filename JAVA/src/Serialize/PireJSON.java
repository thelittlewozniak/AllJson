package Serialize;

import Serialize.Serialize;

public class PireJSON {
    public static String serialize(Object o){
        iSerialize i=new Serialize();
        return iSerialize.serialize(o);
    }
    public static void main(String[] args){
        System.out.println("Emacs >VIM");
    }
}
