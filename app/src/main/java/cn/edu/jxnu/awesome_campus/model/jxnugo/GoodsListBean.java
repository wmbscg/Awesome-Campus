package cn.edu.jxnu.awesome_campus.model.jxnugo;

/**
 * Created by KevinWu on 16-5-11.
 */
public class GoodsListBean {
    private String count;
    private String next;
    private String prev;
    private GoodsModel[] posts;

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public GoodsModel[] getPosts() {
        return posts;
    }

    public void setPosts(GoodsModel[] posts) {
        this.posts = posts;
    }



}
