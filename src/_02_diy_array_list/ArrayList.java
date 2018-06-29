package _02_diy_array_list;

import java.sql.Array;

public class ArrayList<E> {
	Object[] array = new Object[0];
int size;

	public void add(E e) {
		// TODO Auto-generated method stub
		
		
		Object[] array2 = new Object[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}
		array2[array.length] = e;
		array = array2;
for(int o = 0; o<array.length; o++) {
	System.out.println(array[o]);
}

	}

	E get(int i) {
		// TODO Auto-generated method stub
		if (i < array.length) {
			return (E)array[i];
		} else {
			return null;
		}
	}

	public void set(int i, E e) {
	
		array[i] = e;
		
		// TODO Auto-generated method stub
	}

	public void addAt(int i, E e) {
		// TODO Auto-generated method stub
		if (i < array.length) {
			Object[] array3 = new Object[array.length + 1];
			for (int j = 0; j < i; j++) {
				array3[j] = array[j];
			}
			array3[i] = e;
			for(int k = i+1; k<array.length+1; k++) {
				array3[k] = array[k-1];
			}
			array = array3;
		}
	}

	

	public void remove(int i) {
		// TODO Auto-generated method stub
if(i<array.length) {
		Object[] array4= new Object[array.length-1];
for(int j = 0; j<i; j++) {
	array4[j] = array[j];
}
for(int k = i+1; k<array.length; k++) {
	array4[k-1] = array[k];
}
array = array4;
}
	}

	public boolean contains(E e) {
		// TODO Auto-generated method stub
		boolean b = false;
		for(int k = 0; k<array.length; k++) {
			if(array[k] == e) {
				b=true;
			}
		}
		return b;
	}

}
