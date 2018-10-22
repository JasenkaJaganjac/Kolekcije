
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList<E> implements List<E> {
	E[] elements;
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;

	@SuppressWarnings("unchecked")
	public MyList() {
		elements = (E[]) new Object[DEFAULT_CAPACITY];
	}

	@Override
	public boolean add(E e) {
		if (size == elements.length) {
			ensureCapa();
		}
		elements[size++] = e;
		return true;
	}

	@Override
	public void add(int i, E e) {
		if (i >= size || i < 0)
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		else {
			size++;
			for (int j = size - 1; j > i; j--) {
				elements[j] = elements[j - 1];
			}
			elements[i] = e;

		}

	}

	@Override
	public void clear() {
		size = 0;
	}

	@Override
	public boolean contains(Object o) {
		boolean result = false;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == o) {
				result = true;
				break;
			}
		}
		return result;
	}

	private void ensureCapa() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}

	@Override
	public E get(int i) {
		if (i >= size || i < 0) {
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		}
		return elements[i];
	}

	@Override
	public int indexOf(Object o) {
		int index = -1;
		if (contains(o)) {

			for (int i = 0; i < elements.length; i++) {
				if (elements[i].equals(o)) {
					index = i;
					break;
				}
			}
		}
		return index;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	@Override
	public int lastIndexOf(Object o) {
		int index = -1;
		if (contains(o)) {

			for (int i = elements.length - 1; i >= 0; i--) {
				if (elements[i].equals(o)) {
					index = i;
					break;
				}
			}
		}
		return index;
	}

	@Override
	public E remove(int i) {
		E e = null;
		if (i < size && i >= 0) {
			e = elements[i];
			while (i < size) {
				elements[i] = elements[i + 1];
				i++;
			}
			size--;
		} else
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		return e;
	}

	@Override
	public boolean remove(Object o) {
		boolean result = false;
		if (contains(o)) {
			result = true;
			int j = 0;
			for (int i = 0; i < elements.length; i++) {

				elements[j] = !(elements[i].equals(o)) ? elements[i] : elements[i + 1];
				j++;
			}
			size--;
		}
		return result;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends E> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E set(int arg0, E arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
