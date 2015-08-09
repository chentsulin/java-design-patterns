
public class StateMachine {

  State stateOne;
  State stateTwo;
  State stateThree;
  
  State state = stateOne;

  public StateMachine() {
    stateOne = new StateOne(this);
    stateTwo = new StateTwo(this);
    stateThree = new StateThree(this);
  }  
  
  void setState(State state) {
    this.state = state;
  }
  
  void doSomething() {
    state.doSomething();
  }

}
