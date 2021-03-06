package com.albumselector.album.entity;

import java.util.ArrayList;

/**
  * @desc:         相册实体类
  * @author:       Leo
  * @date:         2016/10/27
  */
public class FolderBean
{
    private String folderId;          //相册ID
    private String folderName;        //相册标题
    private String folderCover;       //相册封面
    private String folderParentPath;  //相册绝对路径
    private int folderSize;           //相册文件大小
    private boolean isCheck;          //相册文件选中状态

    private ArrayList<String> mImages = new ArrayList<>();
    private boolean mTakePhotoEnabled;

    public FolderBean(String folderId, String folderName, String folderCover, int folderSize) {
        this.folderId = folderId;
        this.folderName = folderName;
        this.folderCover = folderCover;
        this.folderSize = folderSize;
    }

    public FolderBean(String folderName, String folderCover) {
        this.folderName = folderName;
        this.folderCover = folderCover;
    }

    public FolderBean(boolean takePhotoEnabled) {
        mTakePhotoEnabled = takePhotoEnabled;
        if (takePhotoEnabled) {
            // 拍照
            mImages.add("");
        }
    }

    public FolderBean() {
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }

    public boolean isTakePhotoEnabled() {
        return mTakePhotoEnabled;
    }

    public void addLastImage(String imagePath) {
        mImages.add(imagePath);
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public int getCount() {
        return mTakePhotoEnabled ? mImages.size() - 1 : mImages.size();
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getFolderCover() {
        return folderCover;
    }

    public void setFolderCover(String folderCover) {
        this.folderCover = folderCover;
    }

    public String getFolderParentPath() {
        return folderParentPath;
    }

    public void setFolderParentPath(String folderParentPath) {
        this.folderParentPath = folderParentPath;
    }

    public int getFolderSize() {
        return folderSize;
    }

    public void setFolderSize(int folderSize) {
        this.folderSize = folderSize;
    }
}
