package com.tp.BidProject.entities;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Offer {
    private Integer id;
    private Long value;
    private LocalDateTime offerDateTime;
    private User user;
    private Product product;

    public Offer(Integer id, Long value, LocalDateTime offerDateTime, User user, Product product) {
        this.id = id;
        this.value = value;
        this.offerDateTime = offerDateTime;
        this.user = user;
        this.product = product;
    }

    public Offer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public LocalDateTime getOfferDateTime() {
        return offerDateTime;
    }

    public void setOfferDateTime(LocalDateTime offerDateTime) {
        this.offerDateTime = offerDateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Offer{");
        sb.append("id=").append(id);
        sb.append(", value=").append(value);
        sb.append(", offerDateTime=").append(offerDateTime);
        sb.append(", user=").append(user);
        sb.append(", product=").append(product);
        sb.append('}');
        return sb.toString();
    }
}
