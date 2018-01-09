package first.zptc.cn.myclasswork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText ed1,ed2;
    Button  bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1= (EditText) findViewById(R.id.editText3);
        ed2= (EditText) findViewById(R.id.editText4);
        bt1= (Button) findViewById(R.id.button);
        bt2= (Button) findViewById(R.id.button2);
    }
    public  void loading (View v){
        String name,wdp;
        name=ed1.getText().toString();
        wdp=ed2.getText().toString();
        if(name.equals("zhangshan")&&wdp.equals("123456")){
            Intent i=new Intent(MainActivity.this,nextclass.class);
            startActivity(i);
        }
        else if(name.equals("zhangshan")||wdp.equals("123456")) {
            Toast.makeText(MainActivity.this, "您输入的密码或用户名错误，请重新输入", Toast.LENGTH_LONG).show();
        }
    }
    public  void quexiao (View v){
        ((TextView) ed1).setText("");
        ((TextView) ed2).setText("");
    }
}
