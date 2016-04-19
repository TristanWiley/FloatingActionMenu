package terranovaproductions.newcomicreader.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.novaapps.floatingactionmenu.FloatingActionMenu;

/**
 * Created by renqinghe on 15-11-4.
 */
public class DemoCircleMenuFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_circle_menu, container, false);
        initView(v);
        return v;
    }

    private void initView(View v) {
        FloatingActionMenu menu = (FloatingActionMenu) v.findViewById(R.id.fab_menu_circle);
        menu.setMultipleOfFB(3.2f);
        menu.setIsCircle(true);

        menu.setOnMenuItemClickListener(new FloatingActionMenu.OnMenuItemClickListener() {
            @Override
            public void onMenuItemClick(FloatingActionMenu fam, int index, FloatingActionButton item) {
                String str = "";
                switch (index) {
                    case 0:
                        str = "main fab is clicked!";
                        break;
                    case 1:
                        str = "download fab is clicked!";
                        break;
                    case 2:
                        str = "browser fab is clicked!";
                        break;
                    default:
                }
                Toast.makeText(getActivity().getApplicationContext(), str, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
