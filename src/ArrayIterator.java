//
//https://habr.com/ru/post/440436/
//        Практические задачи по Java
//Програмама производит итерацию по массиву

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrayIterator implements Iterator {
private String [] arr;
private int index = 0;

ArrayIterator(String[] arr) {
    this.arr = arr;
}
    @Override
    public boolean hasNext() {
        return index< (arr.length-1);
    }

    @Override
    public Object next() {
    if(hasNext()) {
       return arr[index=+1];
    } else {
        throw new NoSuchElementException();
    }

    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
