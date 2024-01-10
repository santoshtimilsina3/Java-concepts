package constructors.privateConstructor;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AccessPrivateConstructor {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException {
    initServerConfiguration();
    WebServer webServer = new WebServer();
    webServer.startServer();
    }

    public static void initServerConfiguration() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<ServerConfiguration> constructor = ServerConfiguration.class.getDeclaredConstructor(int.class, String.class);
        constructor.setAccessible(true);
        constructor.newInstance(8080,"HELLO FROM MY FUTURE. YOU ARE GOING TO GET SUCCESSFUL !!!");
    }
}
