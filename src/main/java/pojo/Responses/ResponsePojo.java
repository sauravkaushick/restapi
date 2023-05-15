package pojo.Responses;

import java.util.LinkedHashMap;
import java.util.Map;

public class ResponsePojo {


    private String category;
    private Integer id;
    private String name;
    private String rating;
    private String releaseDate;
    private Integer reviewScore;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    
    public String getCategory() {
    return category;
    }
    
    public void setCategory(String category) {
    this.category = category;
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
    
    public String getRating() {
    return rating;
    }
    
    public void setRating(String rating) {
    this.rating = rating;
    }
    
    public String getReleaseDate() {
    return releaseDate;
    }
    
    public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    }
    
    public Integer getReviewScore() {
    return reviewScore;
    }
    
    public void setReviewScore(Integer reviewScore) {
    this.reviewScore = reviewScore;
    }
    
    public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
    }
    
    public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    }
    
}
