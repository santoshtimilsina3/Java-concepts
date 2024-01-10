package constructors.privateConstructor;

import java.net.InetSocketAddress;

public class ServerConfiguration {
    private static ServerConfiguration serverConfigurationInstance;
    private final InetSocketAddress inetAddress;
    private String greetingMessage;

    private ServerConfiguration(int port, String greetingMessage) {
        this.inetAddress = new InetSocketAddress("localhost", port);
        this.greetingMessage = greetingMessage;
        if (serverConfigurationInstance == null) {
            serverConfigurationInstance = this;
        }
    }

    public static ServerConfiguration getInstance() {
        return serverConfigurationInstance;
    }

    public InetSocketAddress getInetAddress() {
        return inetAddress;
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }

    public void setGreetingMessage(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }
}
