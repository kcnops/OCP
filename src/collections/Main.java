package collections;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList();
		arrayList.iterator().remove();

		CopyOnWriteArrayList<String> concurrentArrayList = new CopyOnWriteArrayList<>();
		concurrentArrayList.iterator().remove();
	}

}
