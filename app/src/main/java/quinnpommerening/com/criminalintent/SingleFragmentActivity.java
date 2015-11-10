package quinnpommerening.com.criminalintent;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Quinn Pommerening on 11/9/2015.
 */
public abstract class SingleFragmentActivity extends FragmentActivity{
    protected abstract Fragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        Fragment f = fm.findFragmentById(R.id.fragmentContainer);

        if (f == null) {
            f = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer, f, "Crime")
                    .commit();
        }
    }
}
