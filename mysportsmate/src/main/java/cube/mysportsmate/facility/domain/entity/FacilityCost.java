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
public class FacilityCost {

    @Id @GeneratedValue
    private Long costId;

    private int cost;
    private String costType;
    private String costInfo;
}
