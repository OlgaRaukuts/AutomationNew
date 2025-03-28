package challenges;

public class Refrigirator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){

        if(hasWorkToDo){
            System.out.println("Ordering food");
            hasWorkToDo = false;
        }
    }
}
