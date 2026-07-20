package cube.mysportsmate.domain.entity.user;

import cube.mysportsmate.domain.entity.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserAbility extends BaseEntity {

    @Id
    private Long abilityId;

    private LocalDateTime testedAt;     // 측정일자
    private Integer cardioScore;        // 심폐지구력 점수
    private Integer strengthScore;      // 근력 점수
    private Integer muscularScore;      // 근지구력 점수
    private Integer flexibilityScore;   // 유연성 점수
    private Integer agilityScore;       // 민첩성 점수
    private Integer powerScore;         // 순발력 점수
    private Integer overallScore;       // 종합 점수

    @Enumerated(EnumType.STRING)
    private String grade;


}
