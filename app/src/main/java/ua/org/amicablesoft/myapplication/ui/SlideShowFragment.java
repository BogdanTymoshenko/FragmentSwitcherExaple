package ua.org.amicablesoft.myapplication.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import ua.org.amicablesoft.myapplication.R;
import ua.org.amicablesoft.myapplication.model.Item;

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

        ListView listView = (ListView) view.findViewById(R.id.slide_show__list);
        listView.setAdapter(new ItemsAdapter(createItems()));
        return view;
    }

    private List<Item> createItems() {
        List<Item> items = new LinkedList<>();
        items.add(new Item("Hello world!", "Bla-bla-bla"));
        items.add(new Item("Hello dolly!", "Gav-gav-gav"));
        items.add(new Item("Hello cat!", "Meo-meo-meo"));
        items.add(new Item("Hello dog!", "Brk-brk-brk"));
        items.add(new Item("Hello raccoon!", "K-k-k"));
        return items;
    }

    private static class ItemsAdapter extends BaseAdapter {

        private final List<Item> mItems = new ArrayList<>();

        public ItemsAdapter(List<Item> items) {
            mItems.addAll(items);
        }

        @Override
        public int getCount() {
            return mItems.size();
        }

        @Override
        public Item getItem(int position) {
            return mItems.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;
            if (view == null) {
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view__item, parent, false);
                view.setTag(new ViewHolder(view));
            }

            Item item = getItem(position);

            ViewHolder holder = (ViewHolder) view.getTag();
            holder.mNameLabel.setText(item.getName());
            holder.mSurnameLabel.setText(item.getSurName());

            return view;
        }

        private static final class ViewHolder {
            TextView mNameLabel;
            TextView mSurnameLabel;

            ViewHolder(View view) {
                mNameLabel = (TextView) view.findViewById(R.id.item_view__item__name);
                mSurnameLabel = (TextView) view.findViewById(R.id.item_view__item__surname);
            }
        }
    }
}
