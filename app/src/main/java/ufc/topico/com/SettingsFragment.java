package ufc.topico.com;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Marcio Albuquerque on 5/20/2016.
 */


public class SettingsFragment extends PreferenceFragment
{
    // creates preferences GUI from preferences.xml file in res/xml
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences); // load from XML
    }
} // end class SettingsFragment