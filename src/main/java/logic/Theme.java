package logic;

import java.util.prefs.Preferences;

public class Theme {
    
    public Preferences prefs;
    
    public String getTheme(){
        prefs = Preferences.userRoot().node(this.getClass().getName());
        String theme = prefs.get("theme", "dark");
        return theme;
    }
    
    public void setTheme(String theme){
        prefs.put("theme", theme);
    }
    
}
