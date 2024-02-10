package hw.homework17;

public class MyStack<T> {
    private MyLinkedList<T> list;

    public MyStack() {
        list = new MyLinkedList<>();
    }

    public void push(T data) {
        list.addFirst(data);
    }

    public T pop() {
        if (list.getSize() == 0) {
            throw new RuntimeException("Стек пуст.");
        }
        return list.remove(0);
    }
}
