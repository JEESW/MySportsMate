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
public class Qna extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    private String qnaTitle;
    private String qnaContent;
    private String regit;

    private boolean isDeleted;


}
