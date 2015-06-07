package com.proevan.androidnanodegree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private Toast mToast;

    @OnClick(R.id.app_button_spotify_streamer)
    public void onSpotifyStreamerButtonClick() {
        showToast(R.string.spotify_streamer_app_button_hint);
    }

    @OnClick(R.id.app_button_football_scores)
    public void onFootballScoresButtonClick() {
        showToast(R.string.football_scores_app_button_hint);
    }

    @OnClick(R.id.app_button_library_app)
    public void onLibraryAppButtonClick() {
        showToast(R.string.library_app_button_hint);
    }

    @OnClick(R.id.app_button_build_it_bigger)
    public void onBuildItBiggerButtonClick() {
        showToast(R.string.build_it_bigger_app_button_hint);
    }

    @OnClick(R.id.app_button_xyz_reader)
    public void onXYZReaderButtonClick() {
        showToast(R.string.xyz_reader_app_button_hint);
    }

    @OnClick(R.id.app_button_my_own_app)
    public void onMyOwnAppButtonClick() {
        showToast(R.string.my_own_app_button_hint);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showToast(int stringResId) {
        if (mToast == null)
            mToast = Toast.makeText(this, stringResId, Toast.LENGTH_SHORT);
        else
            mToast.setText(stringResId);
        mToast.show();
    }

}
