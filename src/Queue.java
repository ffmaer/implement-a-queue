
public class Queue {
	int[] q;
	Queue(){
		q=new int[0];
	}
	void enqueue(int x){
		int[] new_q = new int[q.length+1];
		for(int i=0;i<q.length;i++) {
			new_q[i]=q[i];
		}
		new_q[new_q.length-1] = x;
		q=new_q;
	}
	int dequeue() {
		int[] new_q = new int[q.length-1];
		for(int i=0;i<new_q.length;i++) {
			new_q[i]=q[i+1];
		}
		int to_return = q[0];
		q=new_q;
		return to_return;
	}
	public String toString() {
		String str = "";
		for(int i=0;i<q.length;i++) {
			str+=(q[i]+" ");
		}
		return str;
	}
	
}
