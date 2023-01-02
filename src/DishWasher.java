public class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo){
            hasWorkToDo = false;
            System.out.println("Doing dishes. Have work to do");
        }

    }
}
