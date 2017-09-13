package com.example.swu.music;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final int WHOLE_NOTE = 1000;

    private Button lgsButton, bButton, AsButton, aButton, cButton, csButton, dButton, dsButton, eButton, fButton, fsButton, gButton, gsButton, haButton, hbButton, hcButton, hasButton, escaleButton, starButton, challenge2Button, yeeButton, wiiButton;
    private MediaPlayer lgsNote, aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote, haNote, hasNote, hbNote, hcNote, hcsNote, hdNote, hdsNote, heNote, hfNote, hfsNote, hgNote, hgsNote, yee, wii;
    private NumberPicker numberPicker1, numberPicker2;

    MediaPlayer p[];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        createMediaPlayers();


    }
    private void delayPlaying(int delay) throws InterruptedException{
        try {
            Thread.sleep(delay);
        }
        catch(InterruptedException e) {
            Log.e("MainActivity", "Audio playback interrupted");
        }

    }


    private void createMediaPlayers() {
        lgsNote = MediaPlayer.create(this, R.raw.scalehighgs);
        aNote = MediaPlayer.create(this, R.raw.scalea);
        asNote = MediaPlayer.create(this, R.raw.scalebb);
        bNote = MediaPlayer.create(this, R.raw.scaleb);
        cNote = MediaPlayer.create(this, R.raw.scalec);
        csNote = MediaPlayer.create(this, R.raw.scalecs);
        dNote = MediaPlayer.create(this, R.raw.scaled);
        dsNote = MediaPlayer.create(this, R.raw.scaleds);
        eNote = MediaPlayer.create(this, R.raw.scalee);
        fNote = MediaPlayer.create(this, R.raw.scalef);
        fsNote = MediaPlayer.create(this, R.raw.scalefs);
        gNote = MediaPlayer.create(this, R.raw.scaleg);
        gsNote = MediaPlayer.create(this, R.raw.scalegs);
        haNote = MediaPlayer.create(this, R.raw.scalehigha);
        hasNote = MediaPlayer.create(this, R.raw.scalehighbb);
        hbNote = MediaPlayer.create(this, R.raw.scalehighb);
        hcNote = MediaPlayer.create(this, R.raw.scalehighc);
        hcsNote = MediaPlayer.create(this, R.raw.scalehighcs);
        hdNote = MediaPlayer.create(this, R.raw.scalehighd);
        hdsNote = MediaPlayer.create(this, R.raw.scalehighds);
        heNote = MediaPlayer.create(this, R.raw.scalehighe);
        hfNote  = MediaPlayer.create(this, R.raw.scalehighf);
        hfsNote = MediaPlayer.create(this, R.raw.scalehighfs);
        hgNote = MediaPlayer.create(this, R.raw.scalehighg);
        hgsNote = MediaPlayer.create(this, R.raw.scalehighgs);
        yee = MediaPlayer.create(this, R.raw.yee);
        wii = MediaPlayer.create(this, R.raw.wii);
        p = new MediaPlayer[]{lgsNote, aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote, haNote, hasNote, hbNote, hcNote, hcsNote, hdNote, hdsNote, heNote, hfNote, hfsNote, hgNote, hgsNote};
   /*                            0       1       2       3     4       5      6       7      8       9      10     11     12      13       14      15      16       17       18      19      20      21      22        23      24
     */
    }

    private void wireWidgets() {
        lgsButton = (Button) findViewById(R.id.button_lgs);
        aButton = (Button) findViewById(R.id.button_A);
        AsButton = (Button) findViewById(R.id.button_As);
        bButton = (Button) findViewById(R.id.button_b);
        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_cs);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_ds);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_fs);
        gButton = (Button) findViewById(R.id.button_g);
        gsButton = (Button) findViewById(R.id.button_gs);
        haButton = (Button) findViewById(R.id.button_ha);
        hasButton = (Button) findViewById(R.id.button_has);
        hbButton = (Button) findViewById(R.id.button_hb);
        hcButton = (Button) findViewById(R.id.button_hc);
        escaleButton = (Button) findViewById(R.id.button_escale);
        starButton = (Button) findViewById(R.id.button_star);
        yeeButton = (Button) findViewById(R.id.button_yee);
        wiiButton = (Button) findViewById(R.id.button_wii);



        numberPicker1 = (NumberPicker) findViewById(R.id.numberPicker1);
        numberPicker1.setMinValue(0);
        numberPicker1.setMaxValue(24);
        numberPicker1.setDisplayedValues(new String[] {"lgsNote", "aNote", "asNote", "bNote", "cNote", "csNote", "dNote", "dsNote", "eNote", "fNote", "fsNote", "gNote", "gsNote", "haNote", "hasNote", "hbNote", "hcNote", "hcsNote", "hdNote", "hdsNote", "heNote", "hfNote", "hfsNote", "hgNote", "hgsNote"});

        numberPicker2 = (NumberPicker) findViewById(R.id.numberPicker2);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(9);
        numberPicker2.setDisplayedValues(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"});


        challenge2Button = (Button) findViewById(R.id.button_challenge2);

    }

    private void setListeners() {
        lgsButton.setOnClickListener(this);
        aButton.setOnClickListener(this);
        AsButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
        haButton.setOnClickListener(this);
        hbButton.setOnClickListener(this);
        hcButton.setOnClickListener(this);
        hasButton.setOnClickListener(this);
        escaleButton.setOnClickListener(this);
        starButton.setOnClickListener(this);
        challenge2Button.setOnClickListener(this);
        yeeButton.setOnClickListener(this);
        wiiButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button_lgs:
                lgsNote.seekTo(0);
                lgsNote.start();
                break;
            case R.id.button_A:
                aNote.seekTo(0);
                aNote.start();
                break;
            case R.id.button_As:
                asNote.seekTo(0);
                asNote.start();
                break;
            case R.id.button_b:
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.button_c:
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_cs:
                csNote.seekTo(0);
                csNote.start();
                break;
            case R.id.button_d:
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.button_ds:
                dsNote.seekTo(0);
                dsNote.start();
                break;
            case R.id.button_e:
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.button_f:
                fNote.seekTo(0);
                fNote.start();
                break;
            case R.id.button_fs:
                fsNote.seekTo(0);
                fsNote.start();
                break;
            case R.id.button_g:
                gNote.seekTo(0);
                gNote.start();
                break;
            case R.id.button_gs:
                gsNote.seekTo(0);
                gsNote.start();
                break;
            case R.id.button_ha:
                haNote.seekTo(0);
                haNote.start();
                break;
            case R.id.button_hb:
                hbNote.seekTo(0);
                hbNote.start();
                break;
            case R.id.button_hc:
                hcNote.seekTo(0);
                hcNote.start();
                break;
            case R.id.button_has:
                hasNote.seekTo(0);
                hasNote.start();
                break;
            case R.id.button_wii:
                wii.seekTo(0);
                wii.start();
                break;
 /*         case R.id.button_escale:
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fsNote.seekTo(0);
                fsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gsNote.seekTo(0);
                gsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                haNote.seekTo(0);
                haNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hbNote.seekTo(0);
                hbNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hcsNote.seekTo(0);
                hcsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hdsNote.seekTo(0);
                hdsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                heNote.seekTo(0);
                heNote.start();
                break;
*/
            case R.id.button_escale:
                p[8].seekTo(0);
                p[8].start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                p[10].seekTo(0);
                p[10].start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                p[12].seekTo(0);
                p[12].start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                p[13].seekTo(0);
                p[13].start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                p[15].seekTo(0);
                p[15].start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                p[17].seekTo(0);
                p[17].start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                p[19].seekTo(0);
                p[19].start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                p[20].seekTo(0);
                p[20].start();
                break;


            case R.id.button_star:
                haNote.seekTo(0);
                haNote.start();
                aNote.seekTo(0);
                aNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                haNote.seekTo(0);
                haNote.start();

                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                heNote.seekTo(0);
                heNote.start();
                csNote.seekTo(0);
                csNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                haNote.seekTo(0);
                haNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                heNote.seekTo(0);
                heNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hfsNote.seekTo(0);
                hfsNote.start();
                dNote.seekTo(0);
                dNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                haNote.seekTo(0);
                haNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hfsNote.seekTo(0);
                hfsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                heNote.seekTo(0);
                heNote.start();
                csNote.seekTo(0);
                csNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                haNote.seekTo(0);
                haNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hdNote.seekTo(0);
                hdNote.start();
                bNote.seekTo(0);
                bNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fsNote.seekTo(0);
                fsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hdNote.seekTo(0);
                hdNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hcsNote.seekTo(0);
                hcsNote.start();
                aNote.seekTo(0);
                aNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hcsNote.seekTo(0);
                hcsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hbNote.seekTo(0);
                hbNote.start();
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gsNote.seekTo(0);
                gsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hbNote.seekTo(0);
                hbNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                haNote.seekTo(0);
                haNote.start();
                aNote.seekTo(0);
                aNote.start();
                csNote.seekTo(0);
                csNote.start();
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying((WHOLE_NOTE));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                heNote.seekTo(0);
                heNote.start();
                csNote.seekTo(0);
                csNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                haNote.seekTo(0);
                haNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                heNote.seekTo(0);
                heNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hdNote.seekTo(0);
                hdNote.start();
                bNote.seekTo(0);
                bNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fsNote.seekTo(0);
                fsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hdNote.seekTo(0);
                hdNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hcsNote.seekTo(0);
                hcsNote.start();
                aNote.seekTo(0);
                aNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hcsNote.seekTo(0);
                hcsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hbNote.seekTo(0);
                hbNote.start();
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gsNote.seekTo(0);
                gsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                heNote.seekTo(0);
                heNote.start();
                csNote.seekTo(0);
                csNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                haNote.seekTo(0);
                haNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                heNote.seekTo(0);
                heNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hdNote.seekTo(0);
                hdNote.start();
                bNote.seekTo(0);
                bNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fsNote.seekTo(0);
                fsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hdNote.seekTo(0);
                hdNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hcsNote.seekTo(0);
                hcsNote.start();
                aNote.seekTo(0);
                aNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hcsNote.seekTo(0);
                hcsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hbNote.seekTo(0);
                hbNote.start();
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gsNote.seekTo(0);
                gsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                haNote.seekTo(0);
                haNote.start();
                aNote.seekTo(0);
                aNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                haNote.seekTo(0);
                haNote.start();

                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                heNote.seekTo(0);
                heNote.start();
                csNote.seekTo(0);
                csNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                haNote.seekTo(0);
                haNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                heNote.seekTo(0);
                heNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hfsNote.seekTo(0);
                hfsNote.start();
                dNote.seekTo(0);
                dNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                haNote.seekTo(0);
                haNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hfsNote.seekTo(0);
                hfsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                heNote.seekTo(0);
                heNote.start();
                csNote.seekTo(0);
                csNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                haNote.seekTo(0);
                haNote.start();
                try {
                    delayPlaying((WHOLE_NOTE)/2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hdNote.seekTo(0);
                hdNote.start();
                bNote.seekTo(0);
                bNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fsNote.seekTo(0);
                fsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hdNote.seekTo(0);
                hdNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hcsNote.seekTo(0);
                hcsNote.start();
                aNote.seekTo(0);
                aNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hcsNote.seekTo(0);
                hcsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hbNote.seekTo(0);
                hbNote.start();
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gsNote.seekTo(0);
                gsNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hbNote.seekTo(0);
                hbNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                haNote.seekTo(0);
                haNote.start();
                aNote.seekTo(0);
                aNote.start();
                csNote.seekTo(0);
                csNote.start();
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying((WHOLE_NOTE));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                break;


            case R.id.button_challenge2:


                for( int i=0; i<=numberPicker2.getValue(); i++) {
                    p[numberPicker1.getValue()].seekTo(0);
                    p[numberPicker1.getValue()].start();
                    try {
                        delayPlaying((WHOLE_NOTE / 2));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case R.id.button_yee:
                cNote.seekTo(0);
                cNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dNote.seekTo(0);
                dNote.start();

                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cNote.seekTo(0);
                cNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dNote.seekTo(0);
                dNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cNote.seekTo(0);
                cNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dNote.seekTo(0);
                dNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gNote.seekTo(0);
                gNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gNote.seekTo(0);
                gNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dNote.seekTo(0);
                dNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eNote.seekTo(0);
                eNote.start();

                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dNote.seekTo(0);
                dNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fNote.seekTo(0);
                fNote.start();

                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fNote.seekTo(0);
                fNote.start();

                try {
                    delayPlaying((WHOLE_NOTE/2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gNote.seekTo(0);
                gNote.start();
                try {
                    delayPlaying((WHOLE_NOTE/4));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                haNote.seekTo(0);
                haNote.start();

                try {
                    delayPlaying((WHOLE_NOTE));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                yee.seekTo(0);
                yee.start();
                try {
                    delayPlaying((WHOLE_NOTE));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;


            default:

        }
    }
}
