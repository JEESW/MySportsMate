package cube.mysportsmate.facility.domain.entity;

import cube.mysportsmate.common.domain.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Facility extends BaseEntity {

    @Id @GeneratedValue
    private Long facilityId;

    private String facilityName;
    private String facilityInfo;

    private String facilityType;

    private Integer maxCapacity;


}
