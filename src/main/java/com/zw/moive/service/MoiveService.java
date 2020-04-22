package com.zw.moive.service;

import com.github.pagehelper.PageInfo;
import com.zw.moive.domain.Moive;
import com.zw.moive.domain.MoiveVO;

public interface MoiveService {

	PageInfo<Moive> list(MoiveVO moiveVO, Integer pageNum, Integer pageSize);

}
