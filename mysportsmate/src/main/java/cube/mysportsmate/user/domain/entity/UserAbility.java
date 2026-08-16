package cube.mysportsmate.user.domain.entity;

import cube.mysportsmate.common.domain.entity.BaseEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_ability")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserAbility extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "ability_id")
    private Long abilityId;

    @Column(name = "tested_at")
    private LocalDateTime testedAt;     // 측정일자

    @Column(name = "cardio_score")
    private Integer cardioScore;        // 심폐지구력 점수

    @Column(name = "strength_score")
    private Integer strengthScore;      // 근력 점수

    @Column(name = "muscular_score")
    private Integer muscularScore;      // 근지구력 점수

    @Column(name = "flexibility_score")
    private Integer flexibilityScore;   // 유연성 점수

    @Column(name = "agility_score")
    private Integer agilityScore;       // 민첩성 점수

    @Column(name = "power_score")
    private Integer powerScore;         // 순발력 점수

    @Column(name = "overall_score")
    private Integer overallScore;       // 종합 점수

    @Enumerated(EnumType.STRING)
    private UserGrade grade;

    // user : userAbility -> 1 : 1
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_no")
    private User user;


}
