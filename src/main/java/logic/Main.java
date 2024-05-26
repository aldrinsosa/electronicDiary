package logic;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import gui.Screen;
import javax.swing.UIManager;

public class Main {

    public static final User[] dbUsers = new User[10];

 
    public static void main(String[] args) {
        //  String theme = prefs.get("theme", "dark");
        //get actual theme
        Theme theme = new Theme();
        String actualTheme = theme.getTheme();
       
        //set FlatLaf Look&Feel
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());

        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        for (int i = 0; i < dbUsers.length; i++) {
            dbUsers[i] = new User();
        }
        
        if (actualTheme.equals("dark")){
            FlatDarkLaf.setup();
        }
        else {
            FlatLightLaf.setup();
        }
        
        Screen screen = new Screen();
        screen.setVisible(true);
        screen.setLocationRelativeTo(null);
    }

    public static void saveData(int index, User user) {
        dbUsers[index] = user;
    }

    public static User getData(int oldIndex, String direction) {
        int newIndex = direction.equals("left") ? oldIndex - 1 : oldIndex + 1;
        return dbUsers[newIndex];
    }

}
