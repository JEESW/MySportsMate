package cube.mysportsmate.facility.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Center {

    @Id @GeneratedValue
    private Long id;

    private String centerName;
    private String centerTel;
    private String centerMail;
    private String centerInfo;
}
