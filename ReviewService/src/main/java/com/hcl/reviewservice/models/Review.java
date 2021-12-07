package com.hcl.reviewservice.models;


import com.sun.istack.NotNull;

import javax.persistence.*;

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
}
