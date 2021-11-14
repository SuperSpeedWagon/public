import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyLinkedList<T> implements Iterable<T>{

    private Element<T> head;
    private Element<T> tail;

    public MyLinkedList(){
    }

    public void add(T data){
        Element<T> newElement = new Element<>(data);
        if(head == null){
            head = newElement;
        }
        else{
            tail.setNext(newElement);
        }
        tail = newElement;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
