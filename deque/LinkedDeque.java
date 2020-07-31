// java program by Eric Adamian
// LinkedDeque data structure implementation using the given interface

@SuppressWarnings("unchecked")
public class LinkedDeque<T> implements DequeInterface<T> {

	private Node head;
	private Node tail;
	private int numberOfEntries;

	public LinkedDeque() {
		head = null;
		tail = null;
		numberOfEntries = 0;
	}

	public void addToFront(T newEntry) {
		Node temp = new Node(newEntry);
	
		if (isEmpty()){
			head = temp;
			tail = temp;
		}else{
			temp.next = head;
			head.previous = temp;
			head = temp;
		}
		numberOfEntries++;
	}

	public void addToBack(T newEntry) {
		Node temp = new Node(newEntry);
		
		if (isEmpty()){
			head = temp;
			tail = temp;
		}else{
			tail.next = temp;
			temp.previous = tail;
			tail = temp;
		}
		numberOfEntries++;
	}

	public T removeFront() {
		T temp = null;

		if(isEmpty()){
			throw new EmptyQueueException();
		}else{
			temp = head.item;
			head = head.next;

			if (head == null) {
				tail = null;
			}else{
				head.previous = null;
			}
		}
		numberOfEntries--;
		return temp;
	}

	public T removeBack() {
		T temp = null;

		if(isEmpty()){
			throw new EmptyQueueException();
		}else{
			temp = tail.item;
			tail = tail.previous;

			if (tail == null) {
				head = null;
			}else{
				tail.next = null;
			}
		}
		numberOfEntries--;
		return temp;
	}

	public T getFront() {
		T temp = null;

		if(isEmpty()){
			throw new EmptyQueueException();
		} else{
			temp = head.item;
		}
		return temp;
	}

	public T getBack() {
		T temp = null;

		if(isEmpty()){
			throw new EmptyQueueException();
		} else{
			temp = tail.item;
		}
		return temp;
	}

	public boolean isEmpty(){ 
		return numberOfEntries == 0;
	}
	
	public void clear(){
            head = null;
            tail = null;
            numberOfEntries = 0;
    }

    public String toString(){
		StringBuilder stringbuild = new StringBuilder();
		Node temp = head;
	
		while(temp != null){
			stringbuild.append(temp.item + " ");
			temp = temp.next;
		}
	
		return stringbuild.toString();
	}


	private class Node{
        private T item;
        private Node next;
        private Node previous;

        private Node(T item) {
            this(item, null, null);
        }

        private Node(T item, Node next, Node previous) {
            this.item = item;
            this.next = next;
            this.previous = previous;
        }
    }
}