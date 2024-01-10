package constructors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class ConstructorReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        printConstructors(Person.class);
        Person.Address address = createInstanceAtRuntime(Person.Address.class, "modi", "parbat");
        Person person = createInstanceAtRuntime(Person.class, "santosh",address,"233243");
        System.out.println(person);
    }

    public static <T> T createInstanceAtRuntime(Class<T> classes, Object... args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<?>[] constructor = classes.getConstructors();
        for (Constructor<?> c : constructor) {
            if (c.getParameterTypes().length == args.length) {
                return (T) c.newInstance(args);
            }
        }
        System.out.println("Arguments did not matches!!");
        return null;
    }

    public static void printConstructors(Class<?> classes) {
        Constructor<?>[] constructors = classes.getConstructors();
        for (Constructor<?> c : constructors) {
            Class<?>[] parameterTypes = c.getParameterTypes();
            List<String> namesOfParameters = Arrays.stream(parameterTypes)
                    .map(Class::getName)
                    .toList();
            System.out.println(namesOfParameters);
        }


    }
}
