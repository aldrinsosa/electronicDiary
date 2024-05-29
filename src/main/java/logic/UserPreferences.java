package logic;

import java.util.prefs.Preferences;

public class UserPreferences {
    
    public Preferences prefs;
    
    /**
     *
     * @return an array of contacts from the preferences
     */
    public Contact[] getContacts(){
        prefs = Preferences.userRoot().node(this.getClass().getName());
        Contact [] contacts = new Contact[10];
        System.out.println(prefs);
        for (int i = 0; i < contacts.length; i++) {
            contacts[i] = new Contact();
            contacts[i].setAddress(prefs.get("address" + i, ""));
            contacts[i].setBirth(prefs.get("birth" + i, ""));
            contacts[i].setDni(prefs.get("dni" + i, ""));
            contacts[i].setPhone(prefs.get("phone" + i, ""));
            contacts[i].setfName(prefs.get("fName" + i, ""));
            contacts[i].setsName(prefs.get("sName" + i, ""));
        }
        return contacts;
    }
    
    /**
     *
     * @param contact which contact the function is going to put in the preferences
     * @param index where is going to put the contact
     */
    public void setContact(int index, Contact contact){
        prefs.put("address" + index, contact.getAddress());
        prefs.put("birth" + index, contact.getBirth());
        prefs.put("dni" + index, contact.getDni());
        prefs.put("phone" + index, contact.getPhone());
        prefs.put("fName" + index, contact.getfName());
        prefs.put("sName" + index, contact.getsName());
    }
    
    
    public String getTheme(){
        prefs = Preferences.userRoot().node(this.getClass().getName());
        //returns dark as default theme
        return prefs.get("theme", "dark");
    }
    
    public void setTheme(String theme){
        prefs.put("theme", theme);
    }
    
}
