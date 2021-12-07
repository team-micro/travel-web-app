package com.hcl.springboot.model;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "destination_id")
    @NotNull
    private Integer destId;
    @Column(name = "author")
    @NotNull
    private String author;
    @Column(name = "review_subject")
    @NotNull
    private String subject;
    @Column(name = "content")
    @NotNull
    private String content;

//    @ManyToOne(cascade = {CascadeType.ALL, CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.DETACH})
//    @JoinColumn(name = "reviews_user_id")
//    private User reviews;

//    public User getReviews() {
//        return reviews;
//    }

//    public void setReviews(User reviews) {
//        this.reviews = reviews;
//    }


    public Integer getId() {
        return id;
    }

    public void setId(int reviewId) {
        this.id = reviewId;
    }

    public Integer getDestId() {
        return destId;
    }

    public void setDestId(int destId) {
        this.destId = destId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static Review fromJson(JSONObject jsonpObject) throws JSONException {
        Review review = new Review();
        review.author = jsonpObject.getString("author");
        review.content =  jsonpObject.getString("content");
        review.id =  jsonpObject.getInt("id");
        review.destId =  jsonpObject.getInt("dest_id");
        return review;
    }

    public static List<Review> fromJsonArray(JSONArray jsonArrayReviews) throws  JSONException{
        ArrayList<Review> reviews = new ArrayList<>();
        try {
            for (int i=0, l=jsonArrayReviews.length(); i<l; i++){
                reviews.add(Review.fromJson((JSONObject) jsonArrayReviews.get(i)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reviews;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", destId=" + destId +
                ", author='" + author + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
//                ", reviews=" + reviews +
                '}';
    }
//    public static List<Review> fromJSONArrayString(String jsonArrayString) throws JSONException {
//        List<Review> rv = new ArrayList<>();
//        try {
//            for ()
//        }
//    }

}
