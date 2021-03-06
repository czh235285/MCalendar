package library.czh.com.calendar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;

import com.necer.ncalendar.calendar.NCalendar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    protected RecyclerView signRcv;
    protected NCalendar mCalendar;
    protected RelativeLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        signRcv = (RecyclerView) findViewById(R.id.sign_rcv);
        mCalendar = (NCalendar) findViewById(R.id.mCalendar);
        signRcv.setLayoutManager(new LinearLayoutManager(this));
        List<String> stringList = Arrays.asList(new String[]{"1", "2", "3"});
        StringAdapter adapter = new StringAdapter(this, stringList, R.layout.stringitem);
        signRcv.setAdapter(adapter);
        List<String> list = new ArrayList<>();
        list.add("2017-09-21");
        list.add("2017-10-21");
        list.add("2017-10-1");
        list.add("2017-10-15");
        list.add("2017-10-18");
        list.add("2017-10-26");
        list.add("2017-11-21");
        mCalendar.setPoint(list);
    }
}
