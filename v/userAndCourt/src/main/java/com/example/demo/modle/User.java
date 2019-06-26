package com.example.demo.modle;
import javax.persistence.*;
import javax.validation.constraints.NotNull;




    /**
     * Created by WangLei on 18-6-4.
     */
    @Entity
    @Table(name = "user")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @NotNull
        private int id;

        @NotNull
        private int courtId;

        @NotNull
        private int userId;

        public User() {}

        public User(int courtId, int userId) {
            this.courtId = courtId;
            this.userId = userId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getCourtId() {
            return courtId;
        }

        public void setCourtId(int courtId) {
            this.courtId = courtId;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }
    }




