class Stack
 {
  def a;
 	Stack()         
     { 
       a = [];
     }
 	def pushStack(int d)   
     {
       a.add(d); 
     }
  def popStack()
     {
      return a.pop();
     }
  def printStack()
     {
       println a;
     }
 	def sizeStack()
     {
       return a.size();
     }
}
 
 class Queue{
    def a;
    Queue()         
      { 
        a = [];
      }
    def enqueue(int m)       
       { 
         a.add(m); 
       }
    def dequeue()        
       { 
         def t = a[0];   
         a = a - a[0];   
         return t; 
       }
    def printQueue()   
      { 
        println a; 
      }
    def sizeQueue() 
      { 
        return a.size(); 
      }
 }
 
 
public static void main(String[] args)
 {
 println "Stack:";
 Stack example = new Stack();
 example.pushStack(1);
 println example.sizeStack();
 example.popstack();
 println example.sizeStack();
   
 // 
   
 println "Queues";
 Queues example2= new Queue();
 example2.enqueue(15);
 exapmple2.printQueue();
 example2.enqueue(16);
 example2.dequeue();
 example2.printQueue();
 println example2.sizeQueue();
   
 }
