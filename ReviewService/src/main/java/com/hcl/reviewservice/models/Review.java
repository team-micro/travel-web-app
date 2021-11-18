package com.hcl.reviewservice.models;


import javax.persistence.*;

@Entity
@Table(name = "Review")
public class Review {
    @Id
    @Column(name="reviewId", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer reviewId;
    @Column(name="destinationId", unique = false)
    private Integer destId;
    private String author;
    private String subject;
    private String content;

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
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
}
