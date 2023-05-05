package arrayList_ctdl.ArrayList;

import java.util.Arrays;

import static com.sun.javafx.fxml.expression.Expression.set;
import static javafx.beans.binding.Bindings.size;

public class Mylist<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    protected Object elements[];

    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public Mylist(int capacity) {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity(size() + 1);
        for (int i = size() - 1; i >= index; i--) {
            set(i + 1, get(i));
        }
        set(index, element);
        int modCount = 0;
        modCount++;
    }
    public E remove(int index){
            if (index < 0 || index >=size){
                throw new IndexOutOfBoundsException("index không hợp lệ :" + index);
            }
        E removedElement = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size -1] = null;
        size--;
        return removedElement;
    }
 public int size(){
        return size;
 }
 public boolean contains(E o){
     for (int i = 0; i < size; i++) {
         Object[] data = new Object[0];
         if (o.equals(elements[i])){
             return true;
         }
     }
     return false;
 }
 public int indexOf(E o){
     for (int i = 0; i < size; i++) {
         if (o.equals(elements[i])){
             return i;
         }
     }
     return -1;
 }
 public boolean add(E e){
        ensureCapacity(size+1);
        elements[size++] = e;
        return true;
 }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = elements.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = (oldCapacity * 3) / 2 + 1;
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
    public E get(int i){
        return (E)  elements[i];
    }
    public void clear(){
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    private void set(int index, E element) {

    }
}

