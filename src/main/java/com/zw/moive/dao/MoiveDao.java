package com.zw.moive.dao;

import java.util.List;

import com.zw.moive.domain.Moive;
import com.zw.moive.domain.MoiveVO;

public interface MoiveDao {

	List<Moive> list(MoiveVO moiveVO);

}
