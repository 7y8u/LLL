package com.fm.common.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fm.common.vo.SysResult;

@FeignClient(value="fm-manage")	
//定义当前接口访问的提供者
public interface UserService {

	@RequestMapping("/user/{id}")
	public SysResult test (@PathVariable Long id);
	

}
