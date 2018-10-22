import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySet<E> implements Set<E> {
	E[] elements;
	private int size;

	private static final int DEFAULT_CAPACITY = 16;
	private static final double LOAD_FACTOR_LIMIT = 0.75;

	@SuppressWarnings("unchecked")
	public MySet() {
		elements = (E[]) new Object[DEFAULT_CAPACITY];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {

		return size == 0 ? true : false;

	}

	@Override
	public boolean contains(Object o) {
		boolean result = false;
		for (int i = 0; i < elements.length; i++) {
			result = (o == null ? elements[i] == null : o.equals(elements[i]));
			if (result)
				break;
		}
		return result;
	}

	@Override
	public boolean add(E e) {
		int oldSize = size;
		if (!contains(e))
			elements[size++] = e;
		if (1.0 * size / elements.length > LOAD_FACTOR_LIMIT)
			ensureCapa();

		return oldSize != size;

	}

	private void ensureCapa() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}

	@Override
	public boolean remove(Object o) {
		int i = 0;
		if (!contains(o))
			return false;
		else {
			while (elements[i] != o) {
				i++;
			}
			elements[i] = null;
			size--;
			return true;
		}
	}

	@Override
	public void clear() {
		elements = null;
		size = 0;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		boolean result = false;
		for (Object o : c) {
			if (contains(o)) {
				remove(o);
				result = true;

			}
		}
		return result;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {

		return (Object[]) elements;
	}

	@Override
	public <T> T[] toArray(T[] a) {

		return (T[]) a;
	}

}
