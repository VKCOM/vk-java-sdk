package com.vk.api.sdk.objects.account;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * UserSettingsInterests object
 */
public class UserSettingsInterests implements Validable {
    @SerializedName("activities")
    private UserSettingsInterest activities;

    @SerializedName("interests")
    private UserSettingsInterest interests;

    @SerializedName("music")
    private UserSettingsInterest music;

    @SerializedName("tv")
    private UserSettingsInterest tv;

    @SerializedName("movies")
    private UserSettingsInterest movies;

    @SerializedName("books")
    private UserSettingsInterest books;

    @SerializedName("games")
    private UserSettingsInterest games;

    @SerializedName("quotes")
    private UserSettingsInterest quotes;

    @SerializedName("about")
    private UserSettingsInterest about;

    public UserSettingsInterest getActivities() {
        return activities;
    }

    public UserSettingsInterests setActivities(UserSettingsInterest activities) {
        this.activities = activities;
        return this;
    }

    public UserSettingsInterest getInterests() {
        return interests;
    }

    public UserSettingsInterests setInterests(UserSettingsInterest interests) {
        this.interests = interests;
        return this;
    }

    public UserSettingsInterest getMusic() {
        return music;
    }

    public UserSettingsInterests setMusic(UserSettingsInterest music) {
        this.music = music;
        return this;
    }

    public UserSettingsInterest getTv() {
        return tv;
    }

    public UserSettingsInterests setTv(UserSettingsInterest tv) {
        this.tv = tv;
        return this;
    }

    public UserSettingsInterest getMovies() {
        return movies;
    }

    public UserSettingsInterests setMovies(UserSettingsInterest movies) {
        this.movies = movies;
        return this;
    }

    public UserSettingsInterest getBooks() {
        return books;
    }

    public UserSettingsInterests setBooks(UserSettingsInterest books) {
        this.books = books;
        return this;
    }

    public UserSettingsInterest getGames() {
        return games;
    }

    public UserSettingsInterests setGames(UserSettingsInterest games) {
        this.games = games;
        return this;
    }

    public UserSettingsInterest getQuotes() {
        return quotes;
    }

    public UserSettingsInterests setQuotes(UserSettingsInterest quotes) {
        this.quotes = quotes;
        return this;
    }

    public UserSettingsInterest getAbout() {
        return about;
    }

    public UserSettingsInterests setAbout(UserSettingsInterest about) {
        this.about = about;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(movies, tv, music, books, activities, games, about, interests, quotes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSettingsInterests userSettingsInterests = (UserSettingsInterests) o;
        return Objects.equals(movies, userSettingsInterests.movies) &&
                Objects.equals(tv, userSettingsInterests.tv) &&
                Objects.equals(music, userSettingsInterests.music) &&
                Objects.equals(books, userSettingsInterests.books) &&
                Objects.equals(activities, userSettingsInterests.activities) &&
                Objects.equals(games, userSettingsInterests.games) &&
                Objects.equals(about, userSettingsInterests.about) &&
                Objects.equals(interests, userSettingsInterests.interests) &&
                Objects.equals(quotes, userSettingsInterests.quotes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UserSettingsInterests{");
        sb.append("movies=").append(movies);
        sb.append(", tv=").append(tv);
        sb.append(", music=").append(music);
        sb.append(", books=").append(books);
        sb.append(", activities=").append(activities);
        sb.append(", games=").append(games);
        sb.append(", about=").append(about);
        sb.append(", interests=").append(interests);
        sb.append(", quotes=").append(quotes);
        sb.append('}');
        return sb.toString();
    }
}
