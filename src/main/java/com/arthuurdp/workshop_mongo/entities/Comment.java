package com.arthuurdp.workshop_mongo.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "comment_id")
    private Post post;

    public Comment() {
    }

    public Comment(String text, LocalDateTime date) {
        this.text = text;
        this.date = date;
    }
}
