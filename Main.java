import java.util.Scanner;

public class Main {
    public static String[] todos = new String[3];
    public static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        addTodoList("Mewarnai");
        addTodoList("Membaca");
        addTodoList("Bersepeda");
        addTodoList("Berkhotbah");
        showTodoList();
    }



    public static void showTodoList(){
        System.out.println("TODO LIST");
        for (int i = 0; i < todos.length; i++){
            String todo = todos[i];
            if (todo != null){
                System.out.println((i + 1) + ". " + todo);
            }
        }
    }
    public static void addTodoList(String todo) {
        resizeArrayIsFull(todo);
    }

    private static void resizeArrayIsFull(String todo) {
        for (int i = 0; i < todos.length; i++){
            if (todos[i] == null){
                todos[i] = todo;
                break;
            }
        }
    }

    public static void resizeFull(){
        Boolean isFull = true;
        isFull = isArrayFull();
        if (isFull){

        }
    }

    public static boolean isArrayFull(){
        for (int i = 0; i < todos.length; i ++){
            if (todos[i] == null){
                return false;
            }
        }
        return true;
    }
    public static void resizeArrayToTwoTimeBigger(){
        String[] temp = todos;
        todos = new String[todos.length * 2];
        for (int i = 0; i < todos.length; i++){
            todos[i] = temp[i];
        }
    }
    public static boolean RemoveTodoLis(Integer number){
        for (int i = number - 1; i < todos.length; i++){
            if (i == (todos.length) - 1){
                todos[i] = null;
            } else {
                todos[i] = todos[i + 1];
            }
        }
        return true;
    }
}
