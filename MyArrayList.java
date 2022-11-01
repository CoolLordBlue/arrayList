public class MyArrayList implements MyArrayListInterface {

  
  public int size;
  public int defaultSize = 10;
  public String[] list;

  public MyArrayList() {
    size = 0;
    more(defaultSize);
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    for (int x = 0; x < size(); x++) {
      if (list[x] != null) {
        return false;
      }
    }
    return true;
  }

  public boolean add(String str) {
    add(size(), str);
    return true;
  }

  public void add(int idx, String str) {
    if (idx > size() || idx < 0) {
      throw new IndexOutOfBoundsException("add Index " + idx + " and size " + size());
    } else {
      if (list.length == size()) {
        more(size() * 2 + 1);
      }
      for (int x = size(); x > idx; x--) {
        list[x] = list[x - 1];
      }
      list[idx] = str;
      size++;
    }

  }

  public String get(int idx) {
    if (idx >= size() || idx < 0) {
      throw new IndexOutOfBoundsException("get Index " + idx + " and size " + size());
    } else {
      return list[idx];
    }

  }

  public String set(int idx, String str) {

    if (idx >= size() || idx < 0) {
      throw new IndexOutOfBoundsException("set Index " + idx + " and size " + size());
    } else {
      String s = list[idx];
      list[idx] = str;
      return s;
    }
  }

  public String remove(int idx) {
    if (idx >= size() || idx < 0) {
      throw new IndexOutOfBoundsException("remove Index " + idx + " and size " + size());
    } else {
      String removed = list[idx];
      for (int x = idx; x < size() - 1; x++) {
        list[x] = list[x + 1];
       
      }
      size--;
      return removed;
    }
  }

  public boolean remove(String str) {
    for (int x = 0; x < size(); x++) {
      if (list[x].equals(str)) {
        //remove(x);
        for (int y = x; y < size() - 1; y++)
          {
            list[y] = list[y+1];
            
          }
        size--;
        return true;
      }
    }
    
    
    return false;
  }

  public int indexOf(String str) {
    for (int x = 0; x < size(); x++) {
      if (list[x].equals(str)) {
        return x;
      }
    }
    return -1;
  }

  public boolean contains(String str) {
    for (int x = 0; x < size(); x++) {
      if (list[x].equals(str)) {
        return true;
      }
    }
    return false;
  }

  public String[] toArray() {
    String[] n = new String[size()];
    for (int x = 0; x < size(); x++) {
      n[x] = get(x);
    }
    return n;
  }

  public void more(int num) {
    if (num < size) {
      return;
    }
    String[] arr = list;
    list = new String[num];
    for (int x = 0; x < size(); x++) {
      list[x] = arr[x];
    }
  }
 

}
