package logic;

import gui.Screen;

public class Main {
    
    public static final User[] dbUsers = new User[10];
    
    public static void main(String[] args) {
        for (int i = 0; i < dbUsers.length; i++) {
            dbUsers[i] = new User(); 
        }
        
        Screen screen = new Screen();
        screen.setVisible(true);
        screen.setLocationRelativeTo(null);
    }
    public static void saveData(int index, User user){
        dbUsers[index] = user;
    }
    
    public static User getData (int oldIndex, String direction){
        int newIndex = direction.equals("left") ? oldIndex - 1 : oldIndex + 1;
        return dbUsers[newIndex];
    }
}
