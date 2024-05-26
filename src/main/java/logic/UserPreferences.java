package logic;

import java.util.prefs.Preferences;

public class UserPreferences {
    
    public Preferences prefs;
    
    public String getTheme(){
        //get the preferences
        prefs = Preferences.userRoot().node(this.getClass().getName());
        //returns dark as default theme
        return prefs.get("theme", "dark");
    }
    
    public void setTheme(String theme){
        prefs.put("theme", theme);
    }
    
}
