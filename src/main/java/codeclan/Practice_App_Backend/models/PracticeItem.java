package codeclan.Practice_App_Backend.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="practiceItems")
public class PracticeItem implements Serializable {

    @Column(name="name")
    private String  name;

    @Column(name="priority")
    private int priority;

    @Column(name="time")
    private int time;

    @Column(name="category")
    private String category;

    @Column(name="youtubeLink")
    private String youtubeLink;

    @Column(name="dateLastPlayed")
    private String dateLastPlayed;
    @Column(name="numOfPlays")
    private int numOfPlays;

    @Column(name="bpm")
    private int bpm;
    @Column(name="notes")
    private String notes;

    @Column(name="counter")
    private int counter;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public PracticeItem(String name, int priority, int time, String category, String youtubeLink, String dateLastPlayed, int numOfPlays, int bpm, String notes, int counter) {
        this.name = name;
        this.priority = priority;
        this.time = time;
        this.category = category;
        this.youtubeLink = youtubeLink;
        this.dateLastPlayed = dateLastPlayed;
        this.numOfPlays = numOfPlays;
        this.bpm = bpm;
        this.notes = notes;
        this.counter = counter;
    }

    public PracticeItem() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    public String getDateLastPlayed() {
        return dateLastPlayed;
    }

    public void setDateLastPlayed(String dateLastPlayed) {
        this.dateLastPlayed = dateLastPlayed;
    }

    public int getNumOfPlays() {
        return numOfPlays;
    }

    public void setNumOfPlays(int numOfPlays) {
        this.numOfPlays = numOfPlays;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
