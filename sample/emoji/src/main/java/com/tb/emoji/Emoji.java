package com.tb.emoji;

import java.io.Serializable;

/**
 * Created by teambition on 15/8/27.
 */
public class Emoji implements Serializable {
    int imageUri;
    String content;

    public int getImageUri() {
        return imageUri;
    }

    public void setImageUri(int imageUri) {
        this.imageUri = imageUri;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
