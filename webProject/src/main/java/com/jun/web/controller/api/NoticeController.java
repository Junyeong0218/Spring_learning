package com.jun.web.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jun.web.domain.notice.NoticeView;
import com.jun.web.service.NoticeService;

@RestController("apiNoticeController")
@RequestMapping("/api/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	private final boolean PUBBED = true;
	
	@RequestMapping("list")
	public List<NoticeView> list() {
		
		List<NoticeView> list = noticeService.getNoticeViewList(1, PUBBED);
		
		return list;
	}
}
