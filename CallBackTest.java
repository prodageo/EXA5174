/**
 * @author Jeff Lee
 * @since 2015-10-21 21:24:15
 *  The callback mode - The test class 
 */
public class CallBackTest {
  public static void main(String[] args) {
    Server server = new Server();
    Client client = new Client(server);

    client.sendMsg("Server,Hello~");
  }
}
