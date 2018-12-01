package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.a.fotp.EnterOtp;
import com.example.a.fotp.Phone;


public class ViewAdapter extends FragmentStatePagerAdapter {
    private int mnumoftabs;
    public ViewAdapter(FragmentManager fm, int numoftabs) {
        super(fm);
        this.mnumoftabs = numoftabs;
    }

    @Override
    public Fragment getItem(int position) {
        Phone tab1;
        EnterOtp tab2;

        switch (position) {
            case 0:
                tab1 = new Phone();
                return tab1;
            case 1:
                tab2 = new EnterOtp();
                return tab2;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mnumoftabs;
    }
}

