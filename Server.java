
/**
 * @author Jeff Lee
 * @since 2015-10-21 21:24:15
 *  The callback mode - Simulate the server class 
 */
public class Server {

  public void getClientMsg(CSCallBack csCallBack , String msg) {
    System.out.println(" Server: The server receives the message sent by the client :" + msg);

    //  The mock server needs to process the data 
    try {
      Thread.sleep(5 * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(" The service side : Data processing successful, return to successful status  200");
    String status = "200";
    csCallBack.process(status);
  }
}

