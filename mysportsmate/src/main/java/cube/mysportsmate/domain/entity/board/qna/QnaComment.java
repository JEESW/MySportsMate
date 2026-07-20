package cube.mysportsmate.domain.entity.board.qna;

import cube.mysportsmate.domain.entity.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class QnaComment extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    private Long commentParentId;
    private Long depth;
    private String commentContent;
    private String regit;

    private boolean isDeleted;

}
