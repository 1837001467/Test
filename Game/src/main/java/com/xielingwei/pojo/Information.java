package com.xielingwei.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Information {
    private Integer id;
    private String iname;
    private String isex;
    private Integer iage;
    private Integer ibian;
    private String igong;
    private String iphone;
    private String ihome;
    private Timestamp itime;
    private String izhen;
    private String ihao;
    private String iguo;
    private String iuser;
    private String iyong;
    private Relationship rela;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "iname", nullable = true, length = 50)
    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    @Basic
    @Column(name = "isex", nullable = true, length = 50)
    public String getIsex() {
        return isex;
    }

    public void setIsex(String isex) {
        this.isex = isex;
    }

    @Basic
    @Column(name = "iage", nullable = true)
    public Integer getIage() {
        return iage;
    }

    public void setIage(Integer iage) {
        this.iage = iage;
    }

    @Basic
    @Column(name = "ibian", nullable = true)
    public Integer getIbian() {
        return ibian;
    }

    public void setIbian(Integer ibian) {
        this.ibian = ibian;
    }

    @Basic
    @Column(name = "igong", nullable = true, length = 50)
    public String getIgong() {
        return igong;
    }

    public void setIgong(String igong) {
        this.igong = igong;
    }

    @Basic
    @Column(name = "iphone", nullable = true, length = 50)
    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    @Basic
    @Column(name = "ihome", nullable = true, length = 50)
    public String getIhome() {
        return ihome;
    }

    public void setIhome(String ihome) {
        this.ihome = ihome;
    }

    @Basic
    @Column(name = "itime", nullable = false)
    public Timestamp getItime() {
        return itime;
    }

    public void setItime(Timestamp itime) {
        this.itime = itime;
    }

    @Basic
    @Column(name = "izhen", nullable = true, length = 50)
    public String getIzhen() {
        return izhen;
    }

    public void setIzhen(String izhen) {
        this.izhen = izhen;
    }

    @Basic
    @Column(name = "ihao", nullable = true, length = 50)
    public String getIhao() {
        return ihao;
    }

    public void setIhao(String ihao) {
        this.ihao = ihao;
    }

    @Basic
    @Column(name = "iguo", nullable = true, length = 50)
    public String getIguo() {
        return iguo;
    }

    public void setIguo(String iguo) {
        this.iguo = iguo;
    }

    @Basic
    @Column(name = "iuser", nullable = true, length = 50)
    public String getIuser() {
        return iuser;
    }

    public void setIuser(String iuser) {
        this.iuser = iuser;
    }

    @Basic
    @Column(name = "iyong", nullable = true, length = 50)
    public String getIyong() {
        return iyong;
    }

    public void setIyong(String iyong) {
        this.iyong = iyong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Information that = (Information) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(iname, that.iname) &&
                Objects.equals(isex, that.isex) &&
                Objects.equals(iage, that.iage) &&
                Objects.equals(ibian, that.ibian) &&
                Objects.equals(igong, that.igong) &&
                Objects.equals(iphone, that.iphone) &&
                Objects.equals(ihome, that.ihome) &&
                Objects.equals(itime, that.itime) &&
                Objects.equals(izhen, that.izhen) &&
                Objects.equals(ihao, that.ihao) &&
                Objects.equals(iguo, that.iguo) &&
                Objects.equals(iuser, that.iuser) &&
                Objects.equals(iyong, that.iyong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, iname, isex, iage, ibian, igong, iphone, ihome, itime, izhen, ihao, iguo, iuser, iyong);
    }

    @ManyToOne
    @JoinColumn(name = "rid", referencedColumnName = "rid")
    public Relationship getRela() {
        return rela;
    }

    public void setRela(Relationship rela) {
        this.rela = rela;
    }
}
