package com.example.demo.modle;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by WangLei on 18-6-4.
 */
@Entity
@Table(name = "court")
public class Court {

    @Id
    @NotNull
    private int courtId;

    @NotNull
    private int num;

    public Court() {
    }

    public Court(int courtId, int num) {
        this.courtId = courtId;
        this.num = num;
    }

    public int getCourtId() {
        return courtId;
    }

    public void setCourtId(int courtId) {
        this.courtId = courtId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
