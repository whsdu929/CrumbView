package xu.dadong.crumb;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CrumbView crumbView = (CrumbView) findViewById(R.id.crumb_view);
        crumbView.setActivity(this);

        int firstLevel = 1;
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.setBreadCrumbTitle(getString(R.string.crumb_title, firstLevel));
        ft.replace(R.id.frag_container, MyFragment.getInstance(firstLevel));
        ft.addToBackStack(null);
        ft.commitAllowingStateLoss();
    }

}
