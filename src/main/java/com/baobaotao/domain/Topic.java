package com.baobaotao.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wwh on 16-7-2.
 */

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Topic extends BaseDomain {
    public static final int DIGEST_TOPIC = 1;

    public static final int NOT_DISEST_TOPIC = 0;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topic_id")
    private int topicId;

    @Column(name = "topic_title")
    private String topicTitle;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "board_id")
    private int boardId;

    @Transient
    private MainPost mainPost = new MainPost();

    @Column(name = "last_post")
    private Date lastPost = new Date();

    @Column(name = "create_time")
    private Date createTime = new Date();

    @Column(name = "topic_views")
    private int views;

    @Column(name = "topic_replies")
    private int replies;

    private int digest = NOT_DISEST_TOPIC;

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public void setMainPost(MainPost mainPost) {
        this.mainPost = mainPost;
    }

    public void setLastPost(Date lastPost) {
        this.lastPost = lastPost;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setReplies(int replies) {
        this.replies = replies;
    }

    public void setDigest(int digest) {
        this.digest = digest;
    }

    public int getTopicId() {
        return topicId;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public User getUser() {
        return user;
    }

    public int getBoardId() {
        return boardId;
    }

    public MainPost getMainPost() {
        return mainPost;
    }

    public Date getLastPost() {
        return lastPost;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public int getViews() {
        return views;
    }

    public int getReplies() {
        return replies;
    }

    public int getDigest() {
        return digest;
    }
}