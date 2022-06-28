class BrowserHistory {
    
    Stack<String> backStack;
    Stack<String> forwardStack;
    String HomePage;
    public BrowserHistory(String homepage) {
        HomePage = homepage;
        backStack = new Stack<String>();
        backStack.push(homepage);
        forwardStack = new Stack<String>();
    }
    
    public void visit(String url) {
        backStack.push(url);
        forwardStack = new Stack<String>();
    }
    
    public String back(int steps) {
        int maxSteps = 0; //steps > backStack.size() ? backStack.size() : steps;
        String backUrl = " ";    
        while(maxSteps<steps && backStack.size()>1){
            backUrl = backStack.pop();
            forwardStack.push(backUrl);
            maxSteps++;
        }
        return backStack.isEmpty() ? HomePage : backStack.peek();
    }
    
    public String forward(int steps) {
        int maxSteps = 0; //steps > forwardStack.size() ? forwardStack.size() : steps;
         String backUrl = " "; 
         while(maxSteps<steps && forwardStack.size()>0){
            backUrl = forwardStack.pop();
            backStack.push(backUrl);
            maxSteps++;
        }
         return backStack.isEmpty()? HomePage : backStack.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */