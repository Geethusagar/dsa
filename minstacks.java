class MinStack {
    
     Stack<Integer> main;
      Stack<Integer> min;

    public MinStack() {
         main=new Stack<>();
         min=new Stack<>();
   
        
    }
    
    public void push(int x) {
     if(main.empty()==true){
         main.push(x);
         min.push(x);
     }
        else{
            int y=min.pop();
            min.push(y);
            if(y>x){
                min.push(x);
                main.push(x);
            }
            else{
                min.push(y);
                main.push(x);
            }
        }
    }
    
    public void pop() {
       main.pop();
        min.pop();
        
    }
    
    public int top() {
        int y=main.pop();
        main.push(y);
         return y;
        
    }
    
    public int getMin() {
        int y=min.peek();
        return y;
    }
}
