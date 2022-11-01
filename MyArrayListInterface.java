public interface MyArrayListInterface {

    /**
     * Returns the number of elements in this list.
     */
    public int size();

    /**
     * Returns true if this list contains no elements.
     */
    public boolean isEmpty();

    /**
     * Appends the specified String to the end of this list.
     * Returns true if successful
     */
    public boolean add(String str);

    /**
     * Inserts the specified String at the specified position in this list.
     * Throws IndexOutOfBoundsException if the index is out of range.
     */
    public void add(int idx, String str);

    /**
     * Returns the String at the specified position in this list. Throws
     * IndexOutOfBoundsException if the index is out of range.
     */
    public String get(int idx);

    /**
     * Replaces the String at the specified position in this list with the
     * specified String.
     */
    public String set(int idx, String str);

    /**
     * Removes and returns the String at the specified position in this list.
     */
    public String remove(int idx);

    /**
     * Removes the first occurrence of the specified String from this list, if
     * it is present.
     */
    public boolean remove(String str);

    /**
     * Returns the index of the first occurrence of the specified String in this
     * list, or -1 if this list does not contain the element.
     */
    public int indexOf(String str);

    /**
     * Returns true if this list contains the specified String.
     */
    public boolean contains(String str);

    /**
     * Returns an array containing all of the elements in this list in proper
     * sequence (from first to last element). The returned array will be "safe"
     * in that no references to it are maintained by this list. (In other words,
     * this method must allocate a new array). The caller is thus free to modify
     * the returned array.
     */
    public String[] toArray();
}