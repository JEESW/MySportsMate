package cube.mysportsmate.domain.entity.board.notice;

import cube.mysportsmate.domain.entity.common.BaseEntity;
import jakarta.persistence.Column;
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
