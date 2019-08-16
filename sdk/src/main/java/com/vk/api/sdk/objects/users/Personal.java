package com.vk.api.sdk.objects.users;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.List;
import java.util.Objects;

/**
 * Personal object
 */
public class Personal implements Validable {
    /**
     * User's views on alcohol
     */
    @SerializedName("alcohol")
    private Integer alcohol;

    /**
     * User's inspired by
     */
    @SerializedName("inspired_by")
    private String inspiredBy;

    @SerializedName("langs")
    private List<String> langs;

    /**
     * User's personal priority in life
     */
    @SerializedName("life_main")
    private Integer lifeMain;

    /**
     * User's personal priority in people
     */
    @SerializedName("people_main")
    private Integer peopleMain;

    /**
     * User's political views
     */
    @SerializedName("political")
    private Integer political;

    /**
     * User's religion
     */
    @SerializedName("religion")
    private String religion;

    /**
     * User's religion id
     */
    @SerializedName("religion_id")
    private Integer religionId;

    /**
     * User's views on smoking
     */
    @SerializedName("smoking")
    private Integer smoking;

    public Integer getAlcohol() {
        return alcohol;
    }

    public Personal setAlcohol(Integer alcohol) {
        this.alcohol = alcohol;
        return this;
    }

    public String getInspiredBy() {
        return inspiredBy;
    }

    public Personal setInspiredBy(String inspiredBy) {
        this.inspiredBy = inspiredBy;
        return this;
    }

    public List<String> getLangs() {
        return langs;
    }

    public Personal setLangs(List<String> langs) {
        this.langs = langs;
        return this;
    }

    public Integer getLifeMain() {
        return lifeMain;
    }

    public Personal setLifeMain(Integer lifeMain) {
        this.lifeMain = lifeMain;
        return this;
    }

    public Integer getPeopleMain() {
        return peopleMain;
    }

    public Personal setPeopleMain(Integer peopleMain) {
        this.peopleMain = peopleMain;
        return this;
    }

    public Integer getPolitical() {
        return political;
    }

    public Personal setPolitical(Integer political) {
        this.political = political;
        return this;
    }

    public String getReligion() {
        return religion;
    }

    public Personal setReligion(String religion) {
        this.religion = religion;
        return this;
    }

    public Integer getReligionId() {
        return religionId;
    }

    public Personal setReligionId(Integer religionId) {
        this.religionId = religionId;
        return this;
    }

    public Integer getSmoking() {
        return smoking;
    }

    public Personal setSmoking(Integer smoking) {
        this.smoking = smoking;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(alcohol, peopleMain, smoking, political, lifeMain, langs, inspiredBy, religionId, religion);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personal personal = (Personal) o;
        return Objects.equals(alcohol, personal.alcohol) &&
                Objects.equals(religionId, personal.religionId) &&
                Objects.equals(lifeMain, personal.lifeMain) &&
                Objects.equals(peopleMain, personal.peopleMain) &&
                Objects.equals(smoking, personal.smoking) &&
                Objects.equals(political, personal.political) &&
                Objects.equals(langs, personal.langs) &&
                Objects.equals(inspiredBy, personal.inspiredBy) &&
                Objects.equals(religion, personal.religion);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Personal{");
        sb.append("alcohol=").append(alcohol);
        sb.append(", religionId=").append(religionId);
        sb.append(", lifeMain=").append(lifeMain);
        sb.append(", peopleMain=").append(peopleMain);
        sb.append(", smoking=").append(smoking);
        sb.append(", political=").append(political);
        sb.append(", langs='").append(langs).append("'");
        sb.append(", inspiredBy='").append(inspiredBy).append("'");
        sb.append(", religion='").append(religion).append("'");
        sb.append('}');
        return sb.toString();
    }
}
