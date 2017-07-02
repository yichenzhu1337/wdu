package com.whiteboard.models;

public class Profile {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String description;
    private String nationality;
    private String location;
    private boolean status;
    private String imageUrl;
    private String summonerUrl;
    private boolean isPublic;

    public Profile(
            String firstName,
            String lastName,
            String dateOfBirth,
            String description,
            String nationality,
            String location,
            boolean status,
            String imageUrl,
            String summonerUrl,
            boolean isPublic
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.description = description;
        this.nationality = nationality;
        this.location = location;
        this.status = status;
        this.imageUrl = imageUrl;
        this.summonerUrl = summonerUrl;
        this.isPublic = isPublic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSummonerUrl() {
        return summonerUrl;
    }

    public void setSummonerUrl(String summonerUrl) {
        this.summonerUrl = summonerUrl;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }
}
