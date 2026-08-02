package cube.mysportsmate.board.domain.entitiy;

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
public class Notice extends BaseEntity {

    @Id @GeneratedValue
    private String id;

    private String noticeContent;
    private String regit;
    private boolean isDeleted;

}
