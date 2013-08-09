package org.kde.connect;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.util.Log;

import org.kde.kdeconnect.R;

public class SettingsFragment extends PreferenceFragment {

    private SharedPreferences.OnSharedPreferenceChangeListener preferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() {
        @Override
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

            Log.e("onSharedPreferenceChanged",key+"->"+sharedPreferences.getBoolean(key,true));
            Activity activity = getActivity();
            if (activity == null) return;
            BackgroundService.RunCommand(activity, new BackgroundService.InstanceCallback() {
                @Override
                public void onServiceStart(BackgroundService service) {
                    service.registerPackageInterfacesFromSettings();
                }
            });
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
        if (Build.VERSION.SDK_INT < 11 || Build.VERSION.SDK_INT == 18) {
            CheckBoxPreference p = (CheckBoxPreference)findPreference("clipboard_interface");
            p.setEnabled(false);
            p.setChecked(false);
            p.setSelectable(false);
            p.setSummary(R.string.app_not_available);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        getPreferenceManager().getSharedPreferences()
                .registerOnSharedPreferenceChangeListener(preferenceChangeListener);

    }

    @Override
    public void onPause() {
        getPreferenceManager().getSharedPreferences()
                .unregisterOnSharedPreferenceChangeListener(preferenceChangeListener);
        super.onPause();
    }

}