package ua.org.amicablesoft.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by bogdan on 10/19/15.
 */
public class SlideShowFragment extends Fragment {

    public static Fragment newInstance() {
        return new SlideShowFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slide_show, container, false);
        final TextView message = (TextView) view.findViewById(R.id.slide_show__message);
        view.findViewById(R.id.slide_show__button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message.setVisibility(View.VISIBLE);
            }
        });
        return view;
    }
}
