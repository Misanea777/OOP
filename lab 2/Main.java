package queue;

public class Main {

	public static void main(String[] args) {
		Queue q1 = new Queue(3);
		q1.push(1);
		q1.push(2);
		q1.push(3);
		q1.push(4);
		q1.pop();
		q1.pop();
		q1.pop();
		q1.pop();
		q1.display();


	}

}


