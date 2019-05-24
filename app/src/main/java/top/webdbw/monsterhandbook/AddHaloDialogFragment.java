package top.webdbw.monsterhandbook;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import top.webdbw.monsterhandbook.util.DeviceUtil;

public class AddHaloDialogFragment extends BaseDialogFragment {

    @Override
    protected View createView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_halo_layout, container);
    }

    @Override
    protected int getDialogHeight() {
        return DeviceUtil.dp2px(300);
    }
}
