/**
 * @author Jeff Lee
 * @since 2015-10-21 21:25:14
 *  The callback mode - Simulate the client class 
 */
public class Client implements CSCallBack {

  private Server server;

  public Client(Server server) {
    this.server = server;
  }

  public void sendMsg(final String msg){
    System.out.println(" Client: The message sent is: " + msg);
    new Thread(new Runnable() {
      @Override
      public void run() {
        server.getClientMsg(Client.this,msg);
      }
    }).start();
    System.out.println(" Client: Asynchronous send successful ");
  }

  @Override
  public void process(String status) {
    System.out.println(" Client: Server callback status is: " + status);
  }
}
