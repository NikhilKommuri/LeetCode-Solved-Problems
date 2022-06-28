class BrowserHistory {
    
 Stack<String> browserStackBackward=null;
    Stack<String> browserStackForward=null;
    String homepageUrl=null;

    public BrowserHistory(String homepage) {
        browserStackBackward = new Stack<>();
        browserStackForward = new Stack<>();
        homepageUrl=homepage;
        
    }
    
    public void visit(String url) {
        browserStackBackward.push(url);
        browserStackForward=new Stack<>();
    }
    
    public String back(int steps) {
        int i=0;
        while(!browserStackBackward.isEmpty() && i<steps){
            String s = browserStackBackward.pop();
            browserStackForward.push(s);
            i++;
        }
        if(!browserStackBackward.isEmpty()){
            return browserStackBackward.peek();
        }else{
            return homepageUrl;
        }
    }
    
    public String forward(int steps) {
        int i=0;
        
        while(!browserStackForward.isEmpty() && i<steps){
            String s = browserStackForward.pop();
            browserStackBackward.push(s);
            i++;
        }
        
        if(!browserStackBackward.isEmpty()){
            return browserStackBackward.peek();
        }else{
            return homepageUrl;
        }
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */