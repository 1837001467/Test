package com.xielingwei.pojo;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Relationship {
    private Integer rid;
    private String rname;
    private List<Information> infos;

    @Id
    @Column(name = "rid", nullable = false)
    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "rname", nullable = true, length = 50)
    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Relationship that = (Relationship) o;
        return Objects.equals(rid, that.rid) &&
                Objects.equals(rname, that.rname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rid, rname);
    }


    @OneToMany(mappedBy = "rela")
    public List<Information> getInfos() {
        return infos;
    }

    public void setInfos(List<Information> infos) {
        this.infos = infos;
    }
}
