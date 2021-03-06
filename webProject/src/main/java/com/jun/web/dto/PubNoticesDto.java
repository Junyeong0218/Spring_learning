package com.jun.web.dto;

import com.jun.web.domain.notice.Notice;

import lombok.Data;

@Data
public class PubNoticesDto {
	
	private int id;
	private int pub;
	
	public Notice toEntity() {
		return Notice.builder()
				.id(id)
				.pub(pub)
				.build();
	}
}
