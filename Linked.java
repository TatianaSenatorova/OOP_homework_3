package Home_work_3;

public interface Linked<E> {
    void addLast(E e);
    void addFirst(E e);
    int size();
    E getElementByIndex(int counter);
}
