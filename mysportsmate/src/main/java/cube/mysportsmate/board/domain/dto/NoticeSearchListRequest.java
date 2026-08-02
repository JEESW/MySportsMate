package cube.mysportsmate.board.domain.dto;

import cube.mysportsmate.board.domain.entitiy.Notice;

import java.time.LocalDateTime;

public record NoticeSearchListRequest(
        Long id,
        String noticeTitle,
        String regit,
        boolean isDelete,
        LocalDateTime createAt,
        LocalDateTime updatedAt
) {
    public static NoticeSearchListRequest from(Notice notice) {
        return new NoticeSearchListRequest(
                notice.getId(),
                notice.getNoticeTitle(),
                notice.getRegit(),
                notice.isDeleted(),
                notice.getCreateDate(),
                notice.getLastModifiedDate()
        );
    }
}