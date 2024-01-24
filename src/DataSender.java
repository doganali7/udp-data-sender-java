import java.net.*;
public class DataSender{
    public static void main(String[] args) {
        new DataSender();
    }

    public DataSender(){
        int counter = 0;
        try {
            while(counter < 12){
                DatagramSocket ds = new DatagramSocket();
                String str = InetAddress.getLocalHost().getHostAddress();
                InetAddress ip = InetAddress.getByName("100.100.100.100");
                DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 2024);

                ds.send(dp);
                ds.close();

                Thread.sleep(5000);
                counter++;
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}