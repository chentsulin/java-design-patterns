
public class Invoker {

  Command command;
  
  public Invoker() {
    command = new DoNothingCommand();
  }
  
  public void setCommand(Command newCommand) {
    command = newCommand;
  }

  public void invoke() {
    command.execute();
  }
  
}
