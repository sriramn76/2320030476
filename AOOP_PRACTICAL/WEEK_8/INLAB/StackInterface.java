package INLAB;
public interface StackInterface<T> {
    void push(T element);
    T pop();
    T peek(); 
    boolean isEmpty(); 
}
