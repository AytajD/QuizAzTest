package android.tutorial.curvedbottombar.RecyclerView;

import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.tutorial.curvedbottombar.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ThemeAdapter extends RecyclerView.Adapter<ThemeAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<ThemeModel> imageModelArrayList;

    public ThemeAdapter(Context ctx, ArrayList<ThemeModel> imageModelArrayList){

        inflater = LayoutInflater.from(ctx);
        this.imageModelArrayList = imageModelArrayList;
    }

    @Override
    public ThemeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.recycler_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ThemeAdapter.MyViewHolder holder, int position) {

        holder.mThemeImg.setImageResource(imageModelArrayList.get(position).getImage_drawable());
        holder.mThemeText.setText(imageModelArrayList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return imageModelArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView mThemeText;
        ImageView mThemeImg;

        public MyViewHolder(View itemView) {
            super(itemView);

            mThemeText =  itemView.findViewById(R.id.themeText);
            mThemeImg = itemView.findViewById(R.id.themeImg);
        }

    }
}
