package cube.mysportsmate.region.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Region {

    @Id @GeneratedValue
    private Long id;

    private String regionCd;
    private String parentRegionCd;
    private String regionName;
    private String fullRegionName;
    private Integer regionLevel;
    private String roadAddress;


}
