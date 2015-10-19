package ua.org.amicablesoft.myapplication.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ua.org.amicablesoft.myapplication.R;

/**
 * Created by bogdan on 10/19/15.
 */
public class GalleryFragment extends Fragment {

    public static Fragment newInstance() {
        return new GalleryFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        final TextView message = (TextView) view.findViewById(R.id.gallery__message);
        view.findViewById(R.id.gallery__button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message.setVisibility(View.VISIBLE);
            }
        });
        return view;
    }
}
