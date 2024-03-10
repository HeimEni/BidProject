package com.tp.BidProject.entities;

public class Product {
    private Integer id;
    private String name;
    private String description;
    private Long startingvalue;
    private String pathToImg;

    public Product(Integer id, String name, String description, Long startingvalue, String pathToImg) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startingvalue = startingvalue;
        this.pathToImg = pathToImg;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getStartingvalue() {
        return startingvalue;
    }

    public void setStartingvalue(Long startingvalue) {
        this.startingvalue = startingvalue;
    }

    public String getPathToImg() {
        return pathToImg;
    }

    public void setPathToImg(String pathToImg) {
        this.pathToImg = pathToImg;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", startingvalue=").append(startingvalue);
        sb.append('}');
        return sb.toString();
    }
}
