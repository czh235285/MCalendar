package library.czh.com.calendar;


import android.content.Context;

import org.byteam.superadapter.SuperAdapter;
import org.byteam.superadapter.SuperViewHolder;

import java.util.List;

/**
 * Created by Dell on 2017/9/22.
 */

public class StringAdapter extends SuperAdapter<String> {
    public StringAdapter(Context context, List<String> items, int layoutResId) {
        super(context, items, layoutResId);
    }

    @Override
    public void onBind(SuperViewHolder holder, int viewType, int layoutPosition, String item) {
        holder.setText(R.id.textview, item);
    }
}
