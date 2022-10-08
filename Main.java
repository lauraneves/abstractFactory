interface Channel {}

class TCPChannel implements Channel {}

class UDPChannel implements Channel {}

class ChannelFactory {
    public static Channel create() { // método factory
        System.out.println("TCPChanel");
        return new TCPChannel();
    }
}

public class Main {
    void f() {
        Channel c = ChannelFactory.create();  
    }

    void g() {
        Channel c = ChannelFactory.create();
    }
    
    void h() {
        Channel c = ChannelFactory.create();
    }
  
    public static void main(String [] args) {
        Main m = new Main();
        m.f();
        m.g();
        m.h(); 
    }
}