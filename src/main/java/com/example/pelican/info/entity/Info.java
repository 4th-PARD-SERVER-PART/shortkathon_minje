package com.example.pelican.info.entity;

import com.example.pelican.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String infoType1;
    private String infoType2;
    private String wantType1;
    private String wantType2;

    @ElementCollection
    @CollectionTable(name = "infohobbies", joinColumns = @JoinColumn(name = "infoId"))
    @Column(name = "infoHobby")
    private List<String> infoHobby;

    @ElementCollection
    @CollectionTable(name = "wantHobby", joinColumns = @JoinColumn(name = "wantId"))
    @Column(name = "wantHobby")
    private List<String> wantHobby;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public static Info from(String infoType1, String infoType2, List<String> infoHobby,
                            String wantType1, String wantType2, List<String> wantHobby, User user) {

        if (infoHobby == null) {
            infoHobby = new ArrayList<>();
        }
        if (wantHobby == null) {
            wantHobby = new ArrayList<>();
        }
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }

        return new Info(null, infoType1, infoType2, wantType1, wantType2, infoHobby, wantHobby, user);
    }


    public void setInfoType1(String infoType1){
        this.infoType1 = infoType1;
    }
    public void setInfoType2(String infoType2){
        this.infoType2 = infoType2;
    }
    public void setWantType1(String wantType1){
        this.wantType1 = wantType1;
    }
    public void setWantType2(String wantType2){
        this.wantType2 = wantType2;
    }
    public void setInfoHobby(List<String> infoHobby){
        this.infoHobby = infoHobby;
    }
    public void setWantHobby(List<String> wantHobby){
        this.wantHobby = wantHobby;
    }
    public void setUser(User user){
        this.user = user;
    }
}
