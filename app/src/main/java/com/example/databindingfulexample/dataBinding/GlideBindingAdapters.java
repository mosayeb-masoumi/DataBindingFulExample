package com.example.databindingfulexample.dataBinding;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.databindingfulexample.R;

public class GlideBindingAdapters {

    @BindingAdapter("imageUrl")
    public static void setImageResource (ImageView view , int imageUrl){

        Context context= view.getContext();

        RequestOptions option = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);

        Glide.with(context)
                .setDefaultRequestOptions(option)
                .load(imageUrl)
                .into(view);

    }


    // get from api
//    public class ProfileViewModel {
//        public String getImageUrl() {
//            // The URL will usually come from a model (i.e Profile)
//            return "https://www.freepngimg.com/thumb/mario/20698-7-mario-transparent-background.png";
//        }
//
//        @BindingAdapter({"bind:imageUrl"})
//        public static void loadImage(ImageView view, String imageUrl) {
//            Picasso.with(view.getContext())
////                .load(imageUrl)
//                    .load("https://www.freepngimg.com/thumb/mario/20698-7-mario-transparent-background.png")
//                    .placeholder(R.drawable.ic_launcher_background)
//                    .into(view);
//        }
//
//    }

}
