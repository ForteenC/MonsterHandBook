package top.webdbw.monsterhandbook.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class DeviceUtil {

    public static int height;

    public static int width;

    public static float density;

    public static void init(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        final DisplayMetrics metrics = new DisplayMetrics();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(metrics);

            density = metrics.density;

            height = metrics.heightPixels;

            width = metrics.widthPixels;
        }
    }

    public static int dp2px(int dp) {
        return (int) (dp * density);
    }
}
