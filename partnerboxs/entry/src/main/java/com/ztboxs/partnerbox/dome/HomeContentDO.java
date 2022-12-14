package com.ztboxs.partnerbox.dome;

import java.io.Serializable;

/**
 * 每天一点点,天天进步
 *
 * @Author: ztbox
 * @Date: 2022/10/12/22:43
 * @Description:
 */
public class HomeContentDO implements Serializable {

    private  String title;
    private  String type;
    private  String imgUrl;
    private  String reads;
    private  String likes;
    private  String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getReads() {
        return reads;
    }

    public void setReads(String reads) {
        this.reads = reads;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
