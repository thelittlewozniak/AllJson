package Serialize;
import java.util.List;

public class Serialize {
    public static String serialize(Object object){
        //Get the Class of the Object
        var serial=object.getClass();
        // Begin the string of JSON
        StringBuilder string =new StringBuilder("{");
        // get All the fields inside the Class of the Object from the params
        var fields =serial.getDeclaredFields();
        // Get a new instance of the Class from the object
        Object t=null;
        try{
            t=serial.getConstructor().newInstance();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        // Get data from all field
        for(int i = 0; i< fields.length; i++){
            var s= fields[i].getType();
            fields[i].setAccessible(true);
            switch(s.toString()){
                case "int":
                    try{
                        string.append("\""+ fields[i].getName()+"\":"+ fields[i].getInt(t));
                    }
                    catch (IllegalAccessException e){
                        e.printStackTrace();
                    }
                    break;
                case "long":
                    try{
                        string.append("\""+ fields[i].getName()+"\":"+ fields[i].getLong(t));
                    }
                    catch (IllegalAccessException e){
                        e.printStackTrace();
                    }
                    break;
                case "short":
                    try{
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
                        string.append("\""+ fields[i].getName()+"\":"+fields[i].getChar(t));
                    }
                    catch (IllegalAccessException e){
                        e.printStackTrace();
                    }
                    break;
                case "float":
                    try{
                        string.append("\""+ fields[i].getName()+"\":"+fields[i].getFloat(t));
                    }
                    catch (IllegalAccessException e){
                        e.printStackTrace();
                    }
                    break;
                case "double":
                    try{
                        string.append("\""+ fields[i].getName()+"\":"+fields[i].getDouble(t));
                    }
                    catch (IllegalAccessException e){
                        e.printStackTrace();
                    }
                    break;
                case "boolean":
                    try{
                        string.append("\""+ fields[i].getName()+"\":"+fields[i].getBoolean(t));
                    }
                    catch (IllegalAccessException e){
                        e.printStackTrace();
                    }
                    break;
                case "class java.lang.String":
                    try{
                        Object str=fields[i].get(t);
                        string.append("\""+ fields[i].getName()+"\":\""+str+"\"");
                    }
                    catch (IllegalAccessException e){
                        e.printStackTrace();
                    }
                    break;
                default:
                    // if data is not primitive, we check if it's an array and extract Data
                    if(fields[i].getType().isArray()){
                        switch (fields[i].getType().getComponentType().toString()){
                            case "int":
                                try{
                                    int[] tab=(int[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append(tab[i]);
                                        if(j<tab.length-1)
                                            string.append(",");
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;
                            case "long":
                                try{
                                    long[] tab=(long[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append(tab[i]);
                                        if(j<tab.length-1)
                                            string.append(",");
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;
                            case "short":
                                try{
                                    short[] tab=(short[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append(tab[i]);
                                        if(j<tab.length-1)
                                            string.append(",");
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;
                            case "byte":
                                try{
                                    byte[] tab=(byte[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append(tab[i]);
                                        if(j<tab.length-1)
                                            string.append(",");
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;
                            case "char":
                                try{
                                    char[] tab=(char[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append(tab[i]);
                                        if(j<tab.length-1)
                                            string.append(",");
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;
                            case "float":
                                try{
                                    float[] tab=(float[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append(tab[i]);
                                        if(j<tab.length-1)
                                            string.append(",");
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;

                            case "double":
                                try{
                                    double[] tab=(double[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append(tab[i]);
                                        if(j<tab.length-1)
                                            string.append(",");
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;

                            case "boolean":
                                try{
                                    boolean[] tab=(boolean[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        string.append(tab[i]);
                                        if(j<tab.length-1)
                                            string.append(",");
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;

                            case "class java.lang.String":
                                try{
                                    String[] tab=(String[])fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        if(tab[i]==null)
                                            string.append(tab[i]);
                                        else
                                            string.append("\""+tab[i]+"\"");
                                        if(j<tab.length-1)
                                            string.append(",");
                                    }
                                    string.append("]");
                                }
                                catch (IllegalAccessException e){
                                    e.printStackTrace();
                                }
                                break;
                            default:
                                try {
                                    Object[] tab = (Object[]) fields[i].get(t);
                                    string.append("\""+fields[i].getName()+"\":[");
                                    for(int j=0;j<tab.length;j++){
                                        if(tab[i]!=null)
                                            string.append(Serialize.serialize(tab[i]));
                                        if(j<tab.length-1)
                                            string.append(",");
                                    }
                                    string.append("]");
                                }
                                catch(IllegalAccessException e){
                                    e.printStackTrace();
                                }
                        }
                    }
                    //Checking if data is not primitive and an Array, check if it's a List and extract data
                    else if(fields[i].getType().equals(List.class)){
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
                            switch (item.getClass().toString()){
                                case "class java.lang.Integer":
                                    var dataInt=(Integer) item;
                                    string.append(dataInt);
                                    break;
                                case "class java.lang.Long":
                                    var dataLong=(Long) item;
                                    string.append(dataLong);
                                    break;
                                case "class java.lang.short":
                                    var dataShort=(Short) item;
                                    string.append(dataShort);
                                    break;
                                case "class java.lang.Float":
                                    var dataFloat=(Float) item;
                                    string.append(dataFloat);
                                    break;
                                case "class java.lang.Double":
                                    var dataDouble=(Double) item;
                                    string.append(dataDouble);
                                    break;
                                case "class java.lang.Boolean":
                                    var dataBoolean=(Boolean) item;
                                    string.append(dataBoolean);
                                    break;
                                case "class java.lang.String":
                                    var dataString=(String) item;
                                    string.append("\""+dataString+"\"");
                                    break;
                                default:
                                    string.append(Serialize.serialize(item));
                            }
                            if(j<tab.size()-1)
                                string.append(",");
                        }
                        string.append("]");
                    }
                    //If it's not a List,Array or Primitive, we recall the Function to exctract the data of this class
                    else{
                        try{
                            string.append("\""+fields[i].getName()+"\":");
                            string.append(Serialize.serialize(fields[i].get(t)));
                        }
                        catch(IllegalAccessException e){
                            e.printStackTrace();
                        }
                    }
            }
            if(i<fields.length-1)
                string.append(",");
        }
        string.append("}");
        return string.toString();
    }
}
