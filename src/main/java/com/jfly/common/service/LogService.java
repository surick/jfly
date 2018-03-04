package com.jfly.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jfly.common.domain.LogDO;
import com.jfly.common.domain.PageDO;
import com.jfly.common.utils.Query;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
