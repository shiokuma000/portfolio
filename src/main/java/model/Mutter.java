package model;

import java.io.Serializable;

public class Mutter implements Serializable {
    private int id; 
    private int userId; 
    private String userName;
    private String text;
    private boolean liked;
	private int likeCount;
    private String likedUserIds; 
    
    public Mutter() {}
    
    public Mutter(String userName, String text) {
        this.userName = userName;
        this.text = text;
    }
    
    public Mutter(int id, int userId, String userName, String text,boolean liked, int likeCount, String likedUserIds) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.text = text;
        this.liked = liked;
        this.likeCount = likeCount;
        this.likedUserIds = likedUserIds;
    }
    
    // getter
    public int getId() { return id; }
    public int getUserId() { return userId; }
    public String getUserName() { return userName; }
    public String getText() { return text; }
    public boolean isLiked() {return liked;}
    public int getLikeCount() { return likeCount; }
    public String getLikedUserIds() { return likedUserIds; }

    // setter
    public void setUserId(int userId) { this.userId = userId; }
    public void setText(String text) { this.text = text; }
    public void setLiked(boolean liked) {this.liked = liked;}
    public void setLikeCount(int likeCount) { this.likeCount = likeCount; }
    public void setLikedUserIds(String likedUserIds) { this.likedUserIds = likedUserIds; }

    // ログインユーザーがこの投稿にいいねしているか判定
    public boolean isLikedByUser(int userId) {
        if (likedUserIds == null || likedUserIds.isEmpty()) return false;
        String[] ids = likedUserIds.split(",");
        for (String id : ids) {
            if (id.equals(String.valueOf(userId))) return true;
        }
        return false;
    }
}
