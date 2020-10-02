package task.collections.customCollection;

import java.util.ArrayList;

public class ArrayListCustom<E> extends ArrayList<E> {

	public void createCustomArrayList(ArrayListCustom a){
		for(int i=1;i<11;i++){
			a.add(i);
		}
	}
	public boolean add(E e) {
		super.add(e);
		return true;
	}
	public E set(int i, E e) {
		return super.set(i, e);
	}
	public E remove(int i) {
		return super.remove(i);
	}
	public void print(ArrayListCustom a) {
		for(int j=0;j<a.size();j++) {
		System.out.print(a.get(j)+" ");
		}
		System.out.println();
	}
	public void fetchElement(int i,ArrayListCustom a) {
		
			System.out.print(a.get(i));
	}
}
