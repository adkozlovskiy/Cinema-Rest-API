package kozlovskiy.prod.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue
    private int id;
    private String image;
    private String title;
    private String description;
    private int minutesDuration;
    private String language;
    private Date releaseDate;
    private int ageLimit;
    private String category;
    private String director;
    private String actors;

    public Movie(int id, String image, String title, String description, int minutesDuration, String language, Date releaseDate, int ageLimit, String category, String director, String actors) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.description = description;
        this.minutesDuration = minutesDuration;
        this.language = language;
        this.releaseDate = releaseDate;
        this.ageLimit = ageLimit;
        this.category = category;
        this.director = director;
        this.actors = actors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMinutesDuration() {
        return minutesDuration;
    }

    public void setMinutesDuration(int minutesDuration) {
        this.minutesDuration = minutesDuration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
}
