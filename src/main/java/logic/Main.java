package logic;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import gui.Screen;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    //initialize db
    public static final User[] dbUsers = new User[10];

    public static void main(String[] args) {
        
        //get actual theme
        UserPreferences preferences = new UserPreferences();
        String actualTheme = preferences.getTheme();

        //set FlatLaf Look&Feel
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize L&F");
        }
        
        //fullfill db with empty users
        for (int i = 0; i < dbUsers.length; i++) {
            dbUsers[i] = new User();
        }
        
        //set theme
        if (actualTheme.equals("dark")) {
            FlatDarkLaf.setup();
        } else {
            FlatLightLaf.setup();
        }
        
        //creating jframe
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
