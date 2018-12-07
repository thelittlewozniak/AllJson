package Serialize;

import java.lang.reflect.Field;
import java.util.List;

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
                case "class java.lang.String":
                    try{
                        fields[i].setAccessible(true);
                        Object str=fields[i].get(t);
                        string.append("\""+ fields[i].getName()+"\":\""+str+"\"");
                    }
                    catch (IllegalAccessException e){
                        e.printStackTrace();
                    }
                    break;
                default:
                    if(fields[i].getType().isArray()){
                        switch (fields[i].getType().getComponentType().toString()){
                            case "int":
                                try{
                                    fields[i].setAccessible(true);
                                    int[] tab=(int[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append(tab[i]);
                                        if(j<tab.length-1){
                                            string.append(",");
                                        }
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;
                            case "long":
                                try{
                                    fields[i].setAccessible(true);
                                    long[] tab=(long[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append(tab[i]);
                                        if(j<tab.length-1){
                                            string.append(",");
                                        }
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;
                            case "short":
                                try{
                                    fields[i].setAccessible(true);
                                    short[] tab=(short[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append(tab[i]);
                                        if(j<tab.length-1){
                                            string.append(",");
                                        }
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;
                            case "byte":
                                try{
                                    fields[i].setAccessible(true);
                                    byte[] tab=(byte[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append(tab[i]);
                                        if(j<tab.length-1){
                                            string.append(",");
                                        }
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;
                            case "char":
                                try{
                                    fields[i].setAccessible(true);
                                    char[] tab=(char[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append(tab[i]);
                                        if(j<tab.length-1){
                                            string.append(",");
                                        }
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;
                            case "float":
                                try{
                                    fields[i].setAccessible(true);
                                    float[] tab=(float[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append(tab[i]);
                                        if(j<tab.length-1){
                                            string.append(",");
                                        }
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;

                            case "double":
                                try{
                                    fields[i].setAccessible(true);
                                    double[] tab=(double[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append(tab[i]);
                                        if(j<tab.length-1){
                                            string.append(",");
                                        }
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;

                            case "boolean":
                                try{
                                    fields[i].setAccessible(true);
                                    boolean[] tab=(boolean[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append(tab[i]);
                                        if(j<tab.length-1){
                                            string.append(",");
                                        }
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;

                            case "class java.lang.String":
                                try{
                                    fields[i].setAccessible(true);
                                    String[] tab=(String[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append("\""+tab[i]+"\"");
                                        if(j<tab.length-1){
                                            string.append(",");
                                        }
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;
                        }
                    }
                    else if(fields[i].getType().equals(List.class)){
                        fields[i].setAccessible(true);
                        string.append("\""+fields[i].getName()+"\":[");
                        List tab=null;
                        try{
                            tab=(List)fields[i].get(t);
                        }
                        catch (IllegalAccessException e){
                            e.printStackTrace();
                        }
                        for(int j=0;j<tab.size();j++){
                            Object item=tab.get(j);
                            if(item.getClass().equals(String.class)){
                                string.append("\""+item.toString()+"\"");
                            }
                            else{
                                string.append(item.toString());
                            }
                            if(j<tab.size()-1){
                                string.append(",");
                            }
                        }
                        string.append("]");
                    }
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
