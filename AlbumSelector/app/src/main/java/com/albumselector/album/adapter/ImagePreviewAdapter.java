package com.albumselector.album.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.albumselector.R;
import com.albumselector.album.entity.ImageBean;
import com.albumselector.album.widget.photoview.PhotoView;
import com.bumptech.glide.Glide;

import java.io.File;
import java.util.List;

/**
 * Desction:
 * Author:pengjianbo
 * Date:16/7/21 下午10:12
 */
public class ImagePreviewAdapter extends RecyclingPagerAdapter {

    private Context context;
    private LayoutInflater mInflater;
    private List<ImageBean> mMediaList;

    public ImagePreviewAdapter(Context context, List<ImageBean> list) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.mMediaList = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup container) {
        ImageBean imageBean = mMediaList.get(position);
        View view = mInflater.inflate(R.layout.item_image_preview_list, null);
        PhotoView ivImage = (PhotoView) view.findViewById(R.id.iv_media_image);
        String path = imageBean.getImagePath();

        Glide.with(context).load(new File(path)).asBitmap().into(ivImage);
        return view;
    }

    @Override
    public int getCount() {
        return mMediaList.size();
    }
}
