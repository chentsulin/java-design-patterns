
public ArrayIterator implement Iterator {

  Object[] items;
  
  int pos = 0;
  
  public ArrayIterator(Object[] items) {
    this.items = items;
  }
  
  public boolean hasNext() {
    return pos < items.length && items[pos] != null;
  }
  
  public Object next() {
    Object item = items[pos];
    pos = pos + 1;
    return item;
  }

}
