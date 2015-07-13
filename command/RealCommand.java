
public class RealCommand implements Command {

  Receiver receiver;

  public RealCommand(Receiver receiver) {
    this.receiver = receiver;
  }
  
  public void execute() {
    receiver.doSomething();
  }
  
}
