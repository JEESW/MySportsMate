insert into notice(
    id,
    notice_title,
    notice_content,
    regit,
    is_deleted,
    create_date,
    last_modified_date
)
values (
           2,
           '두 번째 공지',
           '테스트 공지 내용입니다222.',
           'user02',
           false,
           CURRENT_TIMESTAMP,
           CURRENT_TIMESTAMP
       );