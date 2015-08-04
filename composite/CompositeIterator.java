import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

  Stack stack = new Stack();

  public CompositeIterator(Iterator iterator) {
    stack.push(iterator);
  }

  public boolean hasNext() {
    if (stack.empty()) {
      return null;
    }
    
    Iterator iterator = (Iterator) stack.peek;
    if (iterator.hasNext()) {
      return true;
    }
    
    stack.pop();
    return hasNext();
  }
  
  public Object next() {
    if (!hasNext()) {
      return null;
    }
    
    Iterator iterator = (Iterator) stack.peek;
    Object element = iterator.next();
    if (element instanceof IteratorCreator) {
      stack.push(element.createIterator());
    }
    return  element;
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
  
}
