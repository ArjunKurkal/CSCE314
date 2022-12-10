import java.util.ArrayList;

public class Queue<T> {
    int front = -1, rear = -1;
    ArrayList<T> A = new ArrayList<>();

    Queue(){}

    public void enqueue(T x){
        if(front == -1){
            front = 0;
            rear = 0;
            A.add(x);
            return;
        }
        A.add(front, x);
        ++front;
    }
    public void dequeue(){
        if (front == rear){return;}
        A.remove(rear);
        --front;
    }
    public T front(){
        return A.get(front);
    }
    public T rear(){
        return A.get(rear);
    }
    public boolean empty(){
        return front == rear;
    }


    public String toString()
    {
        if (this.empty())
            return "";
        String Ans = "";
        for (int i = rear; i < front; i++) {
            Ans += String.valueOf(A.get(i)) + "->";
        }
        Ans += String.valueOf(A.get(front));
        return Ans;
    }
}



