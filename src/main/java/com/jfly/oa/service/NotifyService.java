package com.jfly.oa.service;

import com.jfly.common.utils.PageUtils;
import com.jfly.oa.domain.NotifyDO;

import java.util.List;
import java.util.Map;

/**
 * 通知通告
 *
 */
public interface NotifyService {

	NotifyDO get(Long id);

	List<NotifyDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(NotifyDO notify);

	int update(NotifyDO notify);

	int remove(Long id);

	int batchRemove(Long[] ids);

//	Map<String, Object> message(Long userId);

	PageUtils selfList(Map<String, Object> map);
}
