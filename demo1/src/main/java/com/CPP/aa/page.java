package com.CPP.aa;
/**
 * 分页的方法
 * @author 崔子君
 * @createDate 2019-04-09
 */
public class page {
	/**
	 * 页面大小
	 */
	private Integer pageSize;
	
	/**
	 * 当前页码
	 */
	private Integer currentPage;
	
	
	/**
	 * 封装方法
	 */
	public Integer getPageSize() {
		return pageSize;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	
	
}
