package first.zptc.cn.myclasswork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ydkf051 on 2017/12/25.
 */

public class nextclass extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clnext);
    }
    public  void add(View v){
        Intent intent=new Intent(nextclass.this,addyemian.class);
        startActivity(intent);
    }

}
