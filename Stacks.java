class Stack{
    int[] Stack = new int[10];
    int top = 0;
    public void push(int data) {
        Stack[top] = data;
        top++;
    }
    public int pop() {
        int data;
        top--;
        data = Stack[top];
        Stack[top] = 0;
        return data;
    }
    public void show() {
        for(int n : Stack){
            System.out.print(n+" ");
        }
    }
}
public class Stacks {
    public static void main(String[] args) {
        Stack nums = new Stack();
        nums.push(5);
        nums.push(10);
        nums.push(15);
        nums.push(20);
        nums.push(25);
        nums.push(30);
        nums.push(35);
        System.out.println(nums.pop());
        nums.show();
    }    
}
