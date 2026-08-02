package cube.mysportsmate.board.controller;

import cube.mysportsmate.board.domain.dto.NoticeSearchListRequest;
import cube.mysportsmate.board.domain.entitiy.Notice;
import cube.mysportsmate.board.repository.NoticeRepository;
import cube.mysportsmate.board.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/board/notice")
@RequiredArgsConstructor
public class NoticeController {

    private final NoticeService noticeService;

    @GetMapping("/list")
    public String noticeList(Model model) {
        List<NoticeSearchListRequest> list = noticeService.findAll();
        model.addAttribute("list", list);
        return "/board/notice/list";
    }

    @GetMapping("/{id}")
    public String findNotice(@PathVariable("id") Notice notice, Model model) {
        Notice result = noticeService.findNotice(notice.getId());
        model.addAttribute("result", result);
        return "/board/notice/detail";

    }

}
