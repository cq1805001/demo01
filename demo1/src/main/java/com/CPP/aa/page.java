package com.CPP.aa;
/**
 * ��ҳ�ķ���
 * @author ���Ӿ�
 * @createDate 2019-04-09
 */
public class page {
	/**
	 * ҳ���С
	 */
	private Integer pageSize;
	
	/**
	 * ��ǰҳ��
	 */
	private Integer currentPage;
	
	
	/**
	 * ��װ����
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
