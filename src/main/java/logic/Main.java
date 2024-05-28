package logic;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import gui.Screen;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    //initialize db
    public static final Contact[] dbContacts = new Contact[10];

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
        for (int i = 0; i < dbContacts.length; i++) {
            dbContacts[i] = new Contact();
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

    public static void saveData(int index, Contact user) {
        dbContacts[index] = user;
    }

    public static Contact getData(int oldIndex, String direction) {
        int newIndex = direction.equals("left") ? oldIndex - 1 : oldIndex + 1;
        return dbContacts[newIndex];
    }

}
