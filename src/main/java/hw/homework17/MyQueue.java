package hw.homework17;

public class MyQueue<T> {
    private MyLinkedList<T> list;

    public MyQueue() {
        list = new MyLinkedList<>();
    }

    public void offer(T data) {
        list.addLast(data);
    }

    public T poll() {
        if (list.getSize() == 0) {
            throw new RuntimeException("Очередь пуста.");
        }
        return list.remove(0);
    }
}