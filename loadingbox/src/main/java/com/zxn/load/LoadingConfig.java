package com.zxn.load;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;

/**
 * Created by zxn on 2019/3/29.
 */
public class LoadingConfig {

    //点击外部可以取消
    public boolean canceledOnTouchOutside = false;
    //是否可以返回键关闭
    public boolean cancelable = false;
    //窗体背景色
    public int backgroundWindowColor = Color.TRANSPARENT;
    //View背景色
    public int backgroundViewColor = Color.parseColor("#b2000000");
    //View边框的颜色
    public int strokeColor = Color.TRANSPARENT;
    //View背景圆角
    public float cornerRadius = 8;
    //View边框的宽度
    public float strokeWidth = 0;
    //Progress的颜色
    public int progressColor = Color.WHITE;
    //Progress的宽度
    public float progressWidth = 2;
    //progress背景环的颜色
    public int progressRimColor = Color.TRANSPARENT;
    //progress背景环的宽度
    public int progressRimWidth = 0;
    //文字的颜色
    public int textColor = Color.WHITE;
    //文字的大小:默认12sp
    public float textSize = 12;
    //消失的监听
    public OnDialogDismissListener onDialogDismissListener;
    //Dialog进出动画
    public int animationID = 0;
    //布局的Padding--int left, int top, int right, int bottom
    public int paddingLeft = 12;
    public int paddingTop = 12;
    public int paddingRight = 12;
    public int paddingBottom = 12;

    //StatusDialog专用：中间图片宽高
    public int imgWidth = 40;
    public int imgHeight = 40;

    private LoadingConfig() {
    }

    public static class Builder {

        private LoadingConfig mLoadingConfig;

        public Builder() {
            mLoadingConfig = new LoadingConfig();
        }

        public LoadingConfig build() {
            return mLoadingConfig;
        }

        /**
         * 设置点击外部取消Dialog
         *
         * @param canceledOnTouchOutside
         * @return
         */
        public Builder isCanceledOnTouchOutside(@Nullable boolean canceledOnTouchOutside) {
            mLoadingConfig.canceledOnTouchOutside = canceledOnTouchOutside;
            return this;
        }

        /**
         * 返回键取消
         *
         * @param cancelable
         * @return
         */
        public Builder isCancelable(@Nullable boolean cancelable) {
            mLoadingConfig.cancelable = cancelable;
            return this;
        }

        public Builder setBackgroundWindowColor(@Nullable int backgroundWindowColor) {
            mLoadingConfig.backgroundWindowColor = backgroundWindowColor;
            return this;
        }

        public Builder setBackgroundViewColor(@Nullable int backgroundViewColor) {
            mLoadingConfig.backgroundViewColor = backgroundViewColor;
            return this;
        }

        public Builder setStrokeColor(@Nullable int strokeColor) {
            mLoadingConfig.strokeColor = strokeColor;
            return this;
        }

        public Builder setStrokeWidth(@Nullable float strokeWidth) {
            mLoadingConfig.strokeWidth = strokeWidth;
            return this;
        }

        public Builder setCornerRadius(@Nullable float cornerRadius) {
            mLoadingConfig.cornerRadius = cornerRadius;
            return this;
        }

        public Builder setProgressColor(@Nullable int progressColor) {
            mLoadingConfig.progressColor = progressColor;
            return this;
        }

        public Builder setProgressWidth(@Nullable float progressWidth) {
            mLoadingConfig.progressWidth = progressWidth;
            return this;
        }

        public Builder setProgressRimColor(int progressRimColor) {
            mLoadingConfig.progressRimColor = progressRimColor;
            return this;
        }

        public Builder setProgressRimWidth(int progressRimWidth) {
            mLoadingConfig.progressRimWidth = progressRimWidth;
            return this;
        }

        public Builder setTextColor(@Nullable int textColor) {
            mLoadingConfig.textColor = textColor;
            return this;
        }

        public Builder setTextSize(float textSize) {
            mLoadingConfig.textSize = textSize;
            return this;
        }

        public Builder setOnDialogDismissListener(OnDialogDismissListener onDialogDismissListener) {
            mLoadingConfig.onDialogDismissListener = onDialogDismissListener;
            return this;
        }

        public Builder setAnimationID(@StyleRes int resId) {
            mLoadingConfig.animationID = resId;
            return this;
        }

        public Builder setImgWidthAndHeight(int imgWidth, int imgHeight) {
            mLoadingConfig.imgWidth = imgWidth;
            mLoadingConfig.imgHeight = imgHeight;
            return this;
        }

        public Builder setPadding(int paddingLeft, int paddingTop, int paddingRight, int paddingBottom) {
            mLoadingConfig.paddingLeft = paddingLeft;
            mLoadingConfig.paddingTop = paddingTop;
            mLoadingConfig.paddingRight = paddingRight;
            mLoadingConfig.paddingBottom = paddingBottom;
            return this;
        }
    }
}
