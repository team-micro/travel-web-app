package com.hcl.springboot.model;

import org.hibernate.mapping.Set;

import javax.persistence.*;

//@Entity
public class Reviews {

    @OneToMany
    @JoinColumn(name="id")
    private Set reviews;
//    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Review")
//    @TableGenerator(name = "Review", allocationSize = 5)
//    @Column(name = "review", nullable = false)  // foreign key?
//    private Long review;
//
//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name="id")
//    private List<Integer> reviews = new ArrayList<>();
//
//    public Long getReview() {
//        return review;
//    }
//
//    public void setReview(Long review) {
//        this.review = review;
//    }
}
