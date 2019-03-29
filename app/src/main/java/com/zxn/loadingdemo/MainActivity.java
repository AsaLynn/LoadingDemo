package com.zxn.loadingdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zcommon.lib.UIUtils;
import com.zxn.load.LoadingBox;
import com.zxn.load.LoadingConfig;
import com.zxn.load.OnDialogDismissListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private static final String text01 = "从前有坐山,山上有坐庙,庙里有个老和尚在讲故事,讲的什么啊,从前有座山,山里有座庙,庙里有个盆,盆里有个锅,锅里有个碗,碗里有个匙,匙里有个花生仁,我吃了,你谗了,我的故事讲完了.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        UIUtils.init(this);
    }

    @OnClick({R.id.btn01, R.id.btn02, R.id.btn03, R.id.btn04, R.id.btn06, R.id.btn07, R.id.btn10, R.id.btn11, R.id.btn12, R.id.btn13, R.id.btn14, R.id.btn15, R.id.btn16, R.id.btn17, R.id.btn18})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn01:
                LoadingBox.showProgress(this);
                delayDismissProgressDialog();
                break;
            case R.id.btn02:
                LoadingBox.showProgress(this, text01);
                delayDismissProgressDialog();
                break;
            case R.id.btn03:
                LoadingBox.showProgress(this, "");
                delayDismissProgressDialog();
                break;
            case R.id.btn04:
                LoadingConfig mDialogConfig = new LoadingConfig.Builder()
                        //点击外部是否可以取消
                        .isCanceledOnTouchOutside(true)
                        //物理返回键可以取消
                        .isCancelable(true)
                        //全屏背景窗体的颜色
                        .setBackgroundWindowColor(UIUtils.getColor(R.color.colorDialogWindowBg))
                        //View背景的颜色
                        .setBackgroundViewColor(UIUtils.getColor(R.color.colorDialogViewBg))
                        //View背景的圆角
                        .setCornerRadius(20)
                        //View 边框的颜色
                        .setStrokeColor(UIUtils.getColor(R.color.colorAccent))
                        //View 边框的宽度
                        .setStrokeWidth(2)
                        //Progress 颜色
                        .setProgressColor(UIUtils.getColor(R.color.colorDialogProgressBarColor))
                        //Progress 宽度
                        .setProgressWidth(3)
                        //Progress 内圈颜色
                        .setProgressRimColor(Color.YELLOW)
                        //Progress 内圈宽度
                        .setProgressRimWidth(4)
                        //文字的颜色
                        .setTextColor(UIUtils.getColor(R.color.colorDialogTextColor))
                        //文字的大小
                        .setTextSize(15)
                        //ProgressBar 颜色
                        .setProgressColor(Color.GREEN)
                        //dialog动画
                        .setAnimationID(R.style.animate_dialog_custom)
                        //padding
                        .setPadding(40, 10, 40, 10)
                        //关闭的监听
                        .setOnDialogDismissListener(new OnDialogDismissListener() {
                            @Override
                            public void onDismiss() {
                                UIUtils.toast("监听到了ProgressDialog关闭了");
                            }
                        })
                        .build();
                LoadingBox.showProgress(this, "数据上传中...", mDialogConfig);
                break;
            case R.id.btn06:
                break;
            case R.id.btn07:
                break;
            case R.id.btn10:
                break;
            case R.id.btn11:
                break;
            case R.id.btn12:
                break;
            case R.id.btn13:
                break;
            case R.id.btn14:
                break;
            case R.id.btn15:
                break;
            case R.id.btn16:
                break;
            case R.id.btn17:
                break;
            case R.id.btn18:
                break;
        }
    }

    private void delayDismissProgressDialog() {
        UIUtils.postDelayed(new Runnable() {
            @Override
            public void run() {
                LoadingBox.dismissProgress();
            }
        }, 3000);
    }
}

