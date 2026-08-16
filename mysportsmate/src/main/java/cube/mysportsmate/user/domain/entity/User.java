package cube.mysportsmate.user.domain.entity;

import cube.mysportsmate.common.domain.entity.BaseEntity;
import cube.mysportsmate.reservation.domain.entity.Reservation;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "user_no")
    private Long id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "password")
    private Long password;

    @Column(name = "username")
    private String username;

    @Column(name = "userage")
    private int age;

    @Column(name = "telnum")
    private String telnum;

    @Column(name = "email")
    private String email;

    @Column(name = "sex")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "is_merit")
    private boolean isMerit;

    @Column(name = "notification_yn")
    private boolean isNotification;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    // user : userAbility -> 1 : 1
    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    private UserAbility userAbility;

    // user : reservation -> 1:N
    @OneToMany(mappedBy = "user")
    private List<Reservation> reservations = new ArrayList<>();



}

