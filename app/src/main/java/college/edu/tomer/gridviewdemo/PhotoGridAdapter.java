package college.edu.tomer.gridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class PhotoGridAdapter extends BaseAdapter {
    private ArrayList<Photo> data;
    private Context context;

    //Constructor
    public PhotoGridAdapter(ArrayList<Photo> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position,
                        View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View v = inflater.inflate(
                R.layout.photo_grid_item, parent, false);

        ImageView ivPhoto = (ImageView)v.findViewById(R.id.ivPhoto);
        RatingBar rb_photo = (RatingBar)v.findViewById(R.id.rb_photo);


        Photo current = data.get(position);

        Picasso.with(context).
                load(current.getUrl())
                .placeholder(R.drawable.ic_progress)
                .error(R.drawable.ic_error)
                .into(ivPhoto);


        rb_photo.setRating(current.getRating());

        return v;
    }
}
