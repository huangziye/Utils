package com.hzy.util;


import android.content.Context;

/**
 * Created by ziye_huang on 2018/1/30.
 */

public final class ResUtil {

    private ResUtil() {
        throw new AssertionError("No Instance.");
    }

    /**
     * 根据资源ID获取颜色
     *
     * @param colorId
     * @return
     */
    public static int getColor(Context context, int colorId) {
        return context.getResources().getColor(colorId);
    }

    /**
     * 根据资源ID获取字符串
     *
     * @param strId
     * @return
     */
    public static String getString(Context context, int strId) {
        return context.getResources().getString(strId);
    }

}
