package id.ac.umn.felixferdinand_00000035927_if570_bl_uts;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import javax.xml.namespace.QName;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> SFXName = new ArrayList<>();
    private ArrayList<String> SFXCategory = new ArrayList<>();
    private ArrayList<Integer> SFXSound = new ArrayList<>();

    private Context context;

    public RecyclerViewAdapter(ArrayList<String> SFXName, ArrayList<String> SFXCategory, ArrayList<Integer> SFXSound, Context context) {
        this.SFXName = SFXName;
        this.SFXCategory = SFXCategory;
        this.SFXSound = SFXSound;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_layout_desain, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.name.setText(SFXName.get(position));
        holder.category.setText(SFXCategory.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SFXPlayer.class);
                intent.putExtra("name", SFXName.get(position));
                intent.putExtra("category", SFXCategory.get(position));
                intent.putExtra("sound", SFXSound.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return SFXName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView name, category;
        ImageButton delete;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            category = itemView.findViewById(R.id.category);

            constraintLayout = itemView.findViewById(R.id.constraintLayout);

            delete = itemView.findViewById(R.id.delete);
            delete.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            SFXName.remove(position);
            SFXCategory.remove(position);
            notifyItemRemoved(position);
        }
    }
}
