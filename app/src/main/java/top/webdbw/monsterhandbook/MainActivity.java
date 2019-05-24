package top.webdbw.monsterhandbook;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.add_monster).setOnClickListener(this);
        findViewById(R.id.add_halo).setOnClickListener(this);
        findViewById(R.id.add_feature).setOnClickListener(this);
        findViewById(R.id.add_decent).setOnClickListener(this);
        findViewById(R.id.add_instrument).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final int id = v.getId();
        switch (id) {
            case R.id.add_monster:
                showAddMonsterDialog();
                break;
            case R.id.add_halo:
                showAddHaloDialog();
                break;
            case R.id.add_feature:
                showAddFeatureDialog();
                break;
            case R.id.add_decent:
                showAddDecentDialog();
                break;
            case R.id.add_instrument:
                showAddInstrumentDialog();
                break;
            default:
                break;
        }
    }

    private void showAddMonsterDialog() {
        AddMonsterDialogFragment fragment = new AddMonsterDialogFragment();
        fragment.show(getSupportFragmentManager(), "add_monster");
    }

    private void showAddHaloDialog() {
        Realm realm = Realm.getDefaultInstance();
        new AlertDialog.Builder(this)
                .create();
    }

    private void showAddFeatureDialog() {

    }

    private void showAddDecentDialog() {

    }

    private void showAddInstrumentDialog() {

    }
}
