package org.bg.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//Setter 주입
// 생성자 주입
// 필드 주입


@Component
@ToString
@AllArgsConstructor // 롬복으로 생성자만드는거임
public class Restaurant {

	/* @Autowired */
	/* @Setter(onMethod_ = {@Autowired}) */
	private Chef chef;
}
