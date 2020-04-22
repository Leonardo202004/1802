package com.zw.moive.service.impl;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zw.moive.dao.MoiveDao;
import com.zw.moive.domain.Moive;
import com.zw.moive.domain.MoiveVO;
import com.zw.moive.service.MoiveService;
@Service
public class MoiveServiceImpl implements MoiveService {
	@Resource
	private MoiveDao moiveDao;

	@Override
	public PageInfo<Moive> list(MoiveVO moiveVO, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<Moive> list = moiveDao.list(moiveVO);
		return new PageInfo<Moive>(list);
		
	}
}
