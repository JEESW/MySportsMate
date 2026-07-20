package cube.mysportsmate.domain.entity.user;

import cube.mysportsmate.domain.entity.common.BaseEntity;
import jakarta.persistence.*;

@Entity
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
    private String gender;

    private boolean isMerit;
    private boolean isNotification;
    private boolean isDeleted;



}

