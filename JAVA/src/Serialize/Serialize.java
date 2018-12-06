package Serialize;

import java.lang.reflect.Field;

public class Serialize {
    public static String Serialize(Class serial){
        StringBuilder string =new StringBuilder("{");
        var fields =serial.getDeclaredFields();
        Object t=null;
        try{
            t=serial.getConstructor().newInstance();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        for(int i = 0; i< fields.length; i++){
            var s= fields[i].getType();
            switch(s.toString()){
                case "int":
                    try{
                        fields[i].setAccessible(true);
                        string.append("\""+ fields[i].getName()+"\":"+ fields[i].getInt(t));
                    }
                    catch (IllegalAccessException e){
                        e.printStackTrace();
                    }
                    break;
                case "long":
                    try{
                        fields[i].setAccessible(true);
                        string.append("\""+ fields[i].getName()+"\":"+ fields[i].getLong(t));
                    }
                    catch (IllegalAccessException e){
                        e.printStackTrace();
                    }
                    break;
                case "short":
                    try{
                        fields[i].setAccessible(true);
                        string.append("\""+ fields[i].getName()+"\":"+fields[i].getShort(t));
                    }
                    catch (IllegalAccessException e){
                        e.printStackTrace();
                    }
                    break;
                case "byte":
                    try{
                        fields[i].setAccessible(true);
                        string.append("\""+ fields[i].getName()+"\":"+fields[i].getByte(t));
                    }
                    catch (IllegalAccessException e){
                        e.printStackTrace();
                    }
                    break;
                case "char":
                    try{
                        fields[i].setAccessible(true);
                        string.append("\""+ fields[i].getName()+"\":"+fields[i].getChar(t));
                    }
                    catch (IllegalAccessException e){
                        e.printStackTrace();
                    }
                    break;
                case "float":
                    try{
                        fields[i].setAccessible(true);
                        string.append("\""+ fields[i].getName()+"\":"+fields[i].getFloat(t));
                    }
                    catch (IllegalAccessException e){
                        e.printStackTrace();
                    }
                    break;
                case "double":
                    try{
                        fields[i].setAccessible(true);
                        string.append("\""+ fields[i].getName()+"\":"+fields[i].getDouble(t));
                    }
                    catch (IllegalAccessException e){
                        e.printStackTrace();
                    }
                    break;
                case "boolean":
                    try{
                        fields[i].setAccessible(true);
                        string.append("\""+ fields[i].getName()+"\":"+fields[i].getBoolean(t));
                    }
                    catch (IllegalAccessException e){
                        e.printStackTrace();
                    }
                    break;
            }
            if(i<fields.length-1){
                string.append(",");
            }
        }
        string.append("}");
        System.out.println(string);
        return null;
    }
}
