
public class Client {
	public static void main(String args[]) {
		Queue q = new Queue();
		q.enqueue(5);
		q.enqueue(4);
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
	}
}
