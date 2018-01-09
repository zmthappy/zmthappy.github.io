package first.zptc.cn.myclasswork;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.File;

/**
 * Created by ydkf051 on 2017/12/25.
 */

public class addyemian extends AppCompatActivity {
    private VideoView mVideoView;
    private Button mButton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);
        mVideoView= (VideoView) findViewById(R.id.videoView);
        mButton= (Button) findViewById(R.id.button3);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              File videofile =new File("/storage/self/primary/lianxi.mp4");
//              mVideoView.setVideoPath(videofile.getAbsolutePath());

                mVideoView.setVideoPath(Environment.getExternalStorageDirectory()+"/lianxi.mp4");
                mVideoView.setMediaController(new MediaController(addyemian.this));
                mVideoView.start();
            }
        });
    }
    public  void lianxi(View v){
        Intent intent=new Intent(addyemian.this,nextclass.class);
        startActivity(intent);
    }

}

