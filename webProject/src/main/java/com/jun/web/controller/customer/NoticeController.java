package com.jun.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jun.web.domain.notice.Notice;
import com.jun.web.domain.notice.NoticeView;
import com.jun.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	private final boolean PUBBED = true;

	@RequestMapping("list")
	public String list(@RequestParam(name="p",defaultValue="1") int page) {
		List<NoticeView> list = noticeService.getNoticeViewList(page, PUBBED);
		return "notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		Notice notice = noticeService.getNotice(1);
		return "notice.detail";
	}
}
