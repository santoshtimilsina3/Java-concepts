package jsonserilizer;

/* implement a java algorithm that converts java object to json string */

import jsonserilizer.classes.Person;

import java.lang.reflect.Field;

public class Main {

    Person person = new Person("santosh", true, 24, 50000);


    public static String convertToJsonString(Class<?> destClass){
        Field[] fields = destClass.getFields();
        for(Field field: fields){
            
        }
        return null;
    }
}
