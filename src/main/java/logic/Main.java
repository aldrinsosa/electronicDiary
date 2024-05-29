package logic;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import gui.Screen;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    //initialize preferences
    public static UserPreferences preferences = new UserPreferences();
    
    //initialize db
    public static Contact[] dbContacts;

    public static void main(String[] args) {
        
        //get actual theme
        String actualTheme = preferences.getTheme();
        
        //get contacts
        dbContacts = preferences.getContacts();
      
        //set FlatLaf Look&Feel
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize L&F");
        }
        
        //set theme
        if (actualTheme.equals("dark")) {
            FlatDarkLaf.setup();
        } else {
            FlatLightLaf.setup();
        }
        
        //creating gui
        Screen screen = new Screen();
        screen.setVisible(true);
        screen.setLocationRelativeTo(null);
        screen.setFirstContact(dbContacts[0]);
    }

    public static void saveData(int index, Contact user) {
        dbContacts[index] = user;
        preferences.setContact(index, user);
    }

    public static Contact getData(int oldIndex, String direction) {
        int newIndex = direction.equals("left") ? oldIndex - 1 : oldIndex + 1;
        return dbContacts[newIndex];
    }

}
