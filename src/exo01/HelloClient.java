package exo01;

public class HelloClient extends java.rmi.server.UnicastRemoteObject {
    public HelloClient() throws java.rmi.RemoteException {
    }

    public static void main(String[] args) {
        try {
            IHelloInterfaces obj = (IHelloInterfaces) java.rmi.Naming.lookup("rmi://localhost:1099/helloInterfacesImpl");
            System.out.println(obj.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
