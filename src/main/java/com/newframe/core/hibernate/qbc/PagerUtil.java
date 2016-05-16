package com.newframe.core.hibernate.qbc;

import com.newframe.core.util.LogUtil;

import java.util.Map;

/**
 * 类描述：分页工具类
 * 
 * @version 1.0
 */
public class PagerUtil {
	public PagerUtil() {

	}

	public static String getBar(String action, String form, int allCounts, int curPageNO, int pageSize,
			Map<String, Object> map) {
		Pager pager = null;
		try {
			if (curPageNO > (int) Math.ceil((double) allCounts / pageSize))
				curPageNO = (int) Math.ceil((double) allCounts / pageSize);
			if (curPageNO <= 1)
				curPageNO = 1;
			// 得到offset
			pager = new Pager(allCounts, curPageNO, pageSize, map);
		} catch (Exception e) {
			LogUtil.info("生成工具条出错!");
		}
		return pager.getToolBar(action, form);
	}

	public static String getBar(String url, int allCounts, int curPageNO, int pageSize, Map<String, Object> map) {
		Pager pager = null;
		try {
			if (curPageNO > (int) Math.ceil((double) allCounts / pageSize))
				curPageNO = (int) Math.ceil((double) allCounts / pageSize);
			if (curPageNO <= 1)
				curPageNO = 1;
			// 得到offset
			// 生成工具条
			pager = new Pager(allCounts, curPageNO, pageSize, map);
		} catch (Exception e) {
			LogUtil.info("生成工具条出错!");
		}
		return pager.getToolBar(url);
	}

	public static int getOffset(int rowCounts, int curPageNO, int pageSize) {
		int offset = 0;
		try {
			if (curPageNO > (int) Math.ceil((double) rowCounts / pageSize))
				curPageNO = (int) Math.ceil((double) rowCounts / pageSize);
			// 得到第几页
			if (curPageNO <= 1)
				curPageNO = 1;
			// 得到offset
			offset = (curPageNO - 1) * pageSize;
		} catch (Exception e) {
			LogUtil.info("getOffset出错!");
		}
		return offset;
	}

	public static int getcurPageNo(int rowCounts, int curPageNO, int pageSize) {
		try {
			// 得到第几页
			if (curPageNO > (int) Math.ceil((double) rowCounts / pageSize))
				curPageNO = (int) Math.ceil((double) rowCounts / pageSize);
			if (curPageNO <= 1)
				curPageNO = 1;
		} catch (Exception e) {
			LogUtil.info("getOffset出错!");
		}
		return curPageNO;
	}
}