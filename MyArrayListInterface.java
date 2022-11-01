public interface MyArrayListInterface {

   
    public int size();
    public boolean isEmpty();
    public boolean add(String str);
    public void add(int idx, String str);
    public String get(int idx);
    public String set(int idx, String str);
    public String remove(int idx);
    public boolean remove(String str);
    public int indexOf(String str);
    public boolean contains(String str);
    public String[] toArray();
}
