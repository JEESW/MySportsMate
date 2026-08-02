package cube.mysportsmate.user.domain.entity;

import cube.mysportsmate.common.domain.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    private String userId;
    private Long password;
    private String username;
    private int age;
    private String telnum;
    private String email;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private boolean isMerit;
    private boolean isNotification;
    private boolean isDeleted;



}

