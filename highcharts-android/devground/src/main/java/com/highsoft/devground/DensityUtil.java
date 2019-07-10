/*
 * (C) Copyright 2013, 2017 Pharmacodia Technology Co.,Ltd.
 */

package com.highsoft.devground;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/**
 * Project ID：400YF17050 <br/>
 * Resume:     用于 获取 屏幕宽高 <br/>
 *
 * @author 汪波
 * @version 1.0
 * @since 2017/2/15 汪波 first commit
 */
public class DensityUtil {

  public static int SCREEN_WIDTH_PIXELS;
  public static int SCREEN_HEIGHT_PIXELS;
  public static float SCREEN_DENSITY;
  public static int SCREEN_WIDTH_DP;
  public static int SCREEN_HEIGHT_DP;
  private static boolean sInitialed;

  public static void init(Context context) {
    if (sInitialed || context == null) {
      return;
    }
    sInitialed = true;
    DisplayMetrics dm = new DisplayMetrics();
    WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
    wm.getDefaultDisplay().getMetrics(dm);
    SCREEN_WIDTH_PIXELS = dm.widthPixels;
    SCREEN_HEIGHT_PIXELS = dm.heightPixels;
    SCREEN_DENSITY = dm.density;
    SCREEN_WIDTH_DP = (int) (SCREEN_WIDTH_PIXELS / dm.density);
    SCREEN_HEIGHT_DP = (int) (SCREEN_HEIGHT_PIXELS / dm.density);
  }

  public static int dip2px(float dp) {
    final float scale = SCREEN_DENSITY;
    return (int) (dp * scale + 0.5f);
  }

  public static int px2dp(float pxValue) {
    final float scale = SCREEN_DENSITY;
    return (int) (pxValue / scale + 0.5f);
  }

  public static int sp2px(float spValue) {
    float fontScale = SCREEN_DENSITY;
    return (int) (spValue * fontScale + 0.5f);
  }

  public static int designedDP2px(float designedDp) {
    if (SCREEN_WIDTH_DP != 320) {
      designedDp = designedDp * SCREEN_WIDTH_DP / 320f;
    }
    return dip2px(designedDp);
  }

  public static void setPadding(final View view, float left, float top, float right, float bottom) {
    view.setPadding(designedDP2px(left), dip2px(top), designedDP2px(right), dip2px(bottom));
  }

  public static void setMargin(final View view, int left, int top, int right, int bottom) {
    ViewGroup.MarginLayoutParams layoutParams =
        (ViewGroup.MarginLayoutParams) view.getLayoutParams();

    layoutParams.leftMargin = designedDP2px(left);
    layoutParams.topMargin = designedDP2px(top);
    layoutParams.rightMargin = designedDP2px(right);
    layoutParams.bottomMargin = designedDP2px(bottom);

    view.setLayoutParams(layoutParams);
  }

  public static void setMarginPx(final View view, int left, int top, int right, int bottom) {
    ViewGroup.MarginLayoutParams layoutParams =
        (ViewGroup.MarginLayoutParams) view.getLayoutParams();

    layoutParams.leftMargin = left;
    layoutParams.topMargin = top;
    layoutParams.rightMargin = right;
    layoutParams.bottomMargin = bottom;

    view.setLayoutParams(layoutParams);
  }

  public static void setWidthHeight(final View view, int width, int height) {
    ViewGroup.MarginLayoutParams layoutParams =
        (ViewGroup.MarginLayoutParams) view.getLayoutParams();
    layoutParams.width = designedDP2px(width);
    layoutParams.height = designedDP2px(height);

    view.setLayoutParams(layoutParams);
  }
}