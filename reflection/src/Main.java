import reflection.classes.Square;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String str = "str";
        Class<? extends String> stringClass = str.getClass();
        Class<Square> squareClass = Square.class;
        HashMap<String, String> mapInfo = new HashMap<>();
        Class<?> aClass = Class.forName("reflection.classes.Drawable");
//        printClassInfo(stringClass);
//        printClassInfo(squareClass);
        Class<?> hashmapInfo = mapInfo.getClass();
        printClassInfo(hashmapInfo);
    }

    public static void printClassInfo(Class<?>... classes) {
        for (Class<?> clazz : classes) {
            System.out.println(String.format("class name :- %s ,  class package: %s",
                    clazz.getSimpleName(),
                    clazz.getPackageName()
            ));
            Class<?>[] interfaces = clazz.getInterfaces();
            for (Class<?> interfaceClass : interfaces) {
                System.out.println(String.format("name of interface is %s, name of class ", interfaceClass.getName()
                        , interfaceClass.getPackageName()));
            }
        }
        System.out.println();
        System.out.println();
    }
}