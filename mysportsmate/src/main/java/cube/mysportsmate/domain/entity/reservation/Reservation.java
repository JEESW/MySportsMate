package cube.mysportsmate.domain.entity.reservation;

import cube.mysportsmate.domain.entity.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Reservation extends BaseEntity {

    @Id @GeneratedValue
    private Long reservationId;

}
