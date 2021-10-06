import helloworld.HelloWorldServer;
public class HelloWorldClient {
    public static void main (String args[]) {
        HelloWorldServer obj = new HelloWorldServer();
        obj.print("Bits");
    }
}