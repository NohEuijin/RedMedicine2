package com.example.redmedicine.controller;

import com.example.redmedicine.domain.dto.NoticeDto;
import com.example.redmedicine.domain.vo.Criteria;
import com.example.redmedicine.domain.vo.NoticeVo;
import com.example.redmedicine.domain.vo.PageVo;
import com.example.redmedicine.service.NoticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = {"/notice/*","/board/*"})
@RequiredArgsConstructor
@Slf4j
public class NoticeController {

    private final NoticeService noticeService;

    //글쓰기
    @GetMapping("/write")
    public String showWritePage(HttpServletRequest req){
        Long userNumber= (Long)req.getSession().getAttribute("userNumber");

        return userNumber == null ? "user/login" : "board/writingNotice";
    }

    @PostMapping("/write")
    public RedirectView noticeWrite(NoticeDto noticeDto, HttpServletRequest req, RedirectAttributes redirectAttributes){
        Long userNumber = (Long)req.getSession().getAttribute("userNumber");

        noticeDto.setUserNumber(userNumber);
        log.info(String.valueOf(noticeDto));
        noticeService.register(noticeDto);

        Long noticeNumber = noticeDto.getNoticeNumber();

//        쿼리스트링으로 데이터를 전송한다. -> 다시 요청을 보내는 메소드에서 데이터를 사용할 때
        redirectAttributes.addAttribute("noticeNumber", noticeNumber);

//        플래쉬로 데이터를 전송 -> 화면에 데이터를 전송할 때 주로 사용
//        redirectAttributes.addFlashAttribute("noticeNumber", noticeNumber);

        return new RedirectView("/notice/detail");
    }

    @GetMapping("/detail")
    public String showDetailPage(Long noticeNumber, Model model) {
        log.info(String.valueOf(noticeNumber));
        NoticeVo noticeVo = noticeService.find(noticeNumber);
        log.info(noticeVo.toString());
        model.addAttribute("notice", noticeVo);
        return "board/readingNotice";
    }

    @GetMapping(value = {"/list","/notice"})
    public String showListPage(Criteria criteria, Model model){
        model.addAttribute("noticeList", noticeService.findAll(criteria));
        model.addAttribute("pageInfo", new PageVo(noticeService.getTotal(), criteria));
        return "board/notice";
    }

    @GetMapping("/remove")
    public RedirectView remove(Long noticeNumber){
        noticeService.remove(noticeNumber);
        return new RedirectView("/notice/list");
    }

    @GetMapping( "/modify")
    public String showModifyPage(Long noticeNumber, Model model){
        NoticeVo noticeVo = noticeService.find(noticeNumber);
        model.addAttribute("notice", noticeVo);
        return "board/modifyNotice";
    }

    @PostMapping("/modify")
    public RedirectView modify(NoticeDto noticeDto, RedirectAttributes redirectAttributes){
        noticeService.modify(noticeDto);

        redirectAttributes.addAttribute("noticeNumber", noticeDto.getNoticeNumber());

        return new RedirectView("/notice/detail");
    }
}
