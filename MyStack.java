import java.util.ArrayList;

public class MyStack<T> {

    private ArrayList<T> arr;

    private int length;

    private int capacity;

    public MyStack() {

        arr = new ArrayList<>(capacity);

        length = 0;

        capacity = 3;

    }

    public void push(T item) {

        if(length == capacity - 1) {

            capacity++;

        }

        arr.add(item);

        length++;

    }

    public boolean empty() {

        if (arr.size() == 0) {

            return true;

        }

        return false;

    }

    public int size() {

        return arr.size();

    }

    public T peek() {

        if(!empty()) {

            return arr.get(size() - 1);

        }

        return (T) "stack is empty";

    }

    public T pop() {

        if(empty()) {

            return (T) "stack is empty";

        }

        T item = arr.get(arr.size() - 1);

        arr.remove(arr.size() - 1);

        return item;

    }

}
