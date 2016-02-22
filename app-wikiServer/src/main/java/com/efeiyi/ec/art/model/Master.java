package com.efeiyi.ec.art.model;

import com.efeiyi.ec.art.organization.model.AddressProvince;
import com.efeiyi.ec.art.organization.model.BigUser;
import com.efeiyi.ec.art.organization.model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * Created by IntelliJ IDEA.
 * User: ming
 * Date: 12-10-15
 * Time: 上午11:06
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "app_master")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Master extends User implements Serializable {

    private String brief; // 简介(短)
    private String title; // 头衔/称号
    private String favicon; //网站头像
    private String birthday; //出生年月
    private String level; //等级
    private String content; // 简介(长)
    private String presentAddress; //现居地
    private String backgroundUrl;
    private String provinceName;//籍贯
    private AddressProvince originProvince; //籍贯（省）
    private String theStatus;         // 正常，删除，停止，隐藏
    private String logoUrl;
    private String masterSpeech;
    private List<Artwork> artworks;
    @Column(name = "master_speech")
    public String getMasterSpeech() {
        return masterSpeech;
    }

    public void setMasterSpeech(String masterSpeech) {
        this.masterSpeech = masterSpeech;
    }

    @Column(name = "the_status")
    public String getTheStatus() {
        return theStatus;
    }

    public void setTheStatus(String theStatus) {
        this.theStatus = theStatus;
    }

    @Column(name = "brief")
    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "favicon")
    public String getFavicon() {
        return favicon;
    }

    public void setFavicon(String favicon) {
        this.favicon = favicon;
    }

    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Column(name = "birthday")
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Column(name = "level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Column(name = "present_address")
    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "origin_province_id")
    public AddressProvince getOriginProvince() {
        return originProvince;
    }

    public void setOriginProvince(AddressProvince originProvince) {
        this.originProvince = originProvince;
    }

    @Column(name = "background_url")
    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }

    @Column(name = "province_name")
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Column(name = "logo_url")
    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    public List<Artwork> getArtworks() {
        return artworks;
    }
    public void setArtworks(List<Artwork> artworks) {
        this.artworks = artworks;
    }



}
