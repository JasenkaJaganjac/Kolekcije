import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyMap<K, V> implements Map<K, V> {
	K[] keys;
	V[] values;

	@SuppressWarnings("unchecked")
	public MyMap() {
		keys = (K[]) new Object[0];
		values = (V[]) new Object[0];
	}

	@Override
	public void clear() {
		keys = Arrays.copyOf(keys, 0);
		values = Arrays.copyOf(values, 0);
	}

	@Override
	public boolean containsKey(Object key) {
		boolean contains = false;
		for (K k : this.keys) {
			if (k.equals(key)) {
				contains = true;
			}
		}
		return contains;
	}

	@Override
	public boolean containsValue(Object value) {
		boolean contains = false;

		for (V v : values) {
			if (v.equals(value)) {
				contains = true;
			}
		}

		return contains;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V get(Object key) {
		V returnValue = null;
		if (containsKey(key)) {
			for (int i = 0; i < this.keys.length; i++) {
				if (keys[i] == key) {
					returnValue = values[i];
				}
			}
		}
		return returnValue;

	}

	@Override
	public boolean isEmpty() {

		return (size() == 0) ? true : false;
	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(K arg0, V arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public V remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		
		return values.length;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}
}
