package modul3semester4latihan11;

//without import java.util.Stack; 

public class ExampleStack {

	private String[] stack;
	private int top;
	private int size;

	public ExampleStack(int size) {
		this.stack = new String[size];
		this.top = -1;
		this.size = size;
	}

	public void push(String element) {
		if (top == size - 1) {
			System.out.println("Stack overflow");
			return;
		}
		top++;
		stack[top] = element;
	}

	public String pop() {
		if (top == -1) {
			System.out.println("Stack underflow");
			return "";
		}
		String element = stack[top];
		top--;
		return element;
	}

	public String peek() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return "";
		}
		return stack[top];
	}

	public boolean empty() {
		return top == -1;
	}

	public int search(String element) {
		for (int i = top; i >= 0; i--) {
			if (stack[i].equals(element)) {
				return top - i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		ExampleStack st = new ExampleStack(5);
		st.push("Aku");
		st.push("Anak");
		st.push("Indonesia");

		System.out.println("Next : " + st.peek());
		st.push("Raya");
		System.out.println(st.pop());
		st.push(":");

		int count = st.search("Aku");
		while (count != -1 && count > 1) {
			st.pop();
			count--;
		}
		System.out.println(st.pop());
		System.out.println(st.empty());
	}
}
