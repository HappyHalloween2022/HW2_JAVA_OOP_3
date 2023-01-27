public class Assignment2 { // Класс, содержащий основную функцию
    
    private static TreeGUI treeGUI;

    public static void main(String[] args) { // Параметр args указывает аргументы командной строки
        treeGUI = new TreeGUI();
    }

    public static TreeGUI getTreeGUI() {
        return treeGUI;
    }

    public static void setTreeGUI(TreeGUI treeGUI) {
        Assignment2.treeGUI = treeGUI;
    } 
}