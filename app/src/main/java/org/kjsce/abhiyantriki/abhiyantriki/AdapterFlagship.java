package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.startActivity;

//For ImageSlider in HomeActivity
public class AdapterFlagship extends PagerAdapter {
    public Context c;
    public ArrayList<ModelFlagship> flagshipEvents;

    public AdapterFlagship(Context c, ArrayList<ModelFlagship> flagshipEvents) {
        this.c = c;
        this.flagshipEvents = flagshipEvents;
    }

    @Override
    public int getCount() {
        return flagshipEvents.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        View itemView = LayoutInflater.from(c).inflate(R.layout.model_flagship, container, false);

        final ModelFlagship f = (ModelFlagship) flagshipEvents.get(position);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.image);
        TextView title = (TextView) itemView.findViewById(R.id.title);
        TextView subtitle = (TextView) itemView.findViewById(R.id.subtitle);

        imageView.setImageResource(f.getImage());
        title.setText(f.getTitle());
        subtitle.setText(f.getSubtitle());

        container.addView(itemView);

        //For handling click events
        imageView.setOnClickListener(new View.OnClickListener() {
            Intent intent;

            @Override
            public void onClick(View v) {
                switch (f.getTitle()) {
                    case "Indian Army":
                        intent = new Intent(c, ExposActivity.class);
                        startActivity(c, intent, null);
                        break;
                    case "Speakers":
                        intent = new Intent(c, SpeakersActivity.class);
                        startActivity(c, intent, null);
                        break;
                    case "Hackathon":
                        intent = new Intent(c, Hackathon.class);
                        startActivity(c, intent, null);
                        break;
                    case "Technical Paper":
                        intent = new Intent(c,TPP.class);
                        startActivity(c, intent, null);
                        break;
                    case "PUBG Mobile":
                        intent = new Intent(c, Pubg.class);
                        startActivity(c, intent, null);
                        break;

                }
            }
        });
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }


}

