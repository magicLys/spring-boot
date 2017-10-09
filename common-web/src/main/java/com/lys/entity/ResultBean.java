package com.lys.entity;
/**
 * Description:用于返回前台的共通实体类
 * @author LIUYANSHUANG
 * @date 2017年9月12日 上午11:09:55
 */
public class ResultBean {
	/**
	 * 返回结果是否正确
	 */
	private boolean status = true;
	/**
	 * 返回结果不正确时的错误码
	 */
	private String errorCode;
	/**
	 * 返回结果不正确时的错误消息
	 */
	private String msg;
	/**
	 * 当前页码
	 */
	private int pageNumber = 1;
	/**
	 * 每页显示多少条记录
	 */
	private int pageSize = 20;
	/**
	 * 一共有多少页
	 */
	private int total = 0;
	/**
	 * 一共有多少条记录
	 */
	private int record = 0;
	/**
	 * 存放数据
	 */
	private Object data;
	
	/**
	 * 构造方法
	 */
	public ResultBean(){
		
	}
	/**
	 * 根据当前对象中属性值计算并设置相关属性值
	 */
	public void count() {
		// 计算总页数
		int totalPageTemp = this.record / this.pageSize;
		int plus = (this.record % this.pageSize) == 0 ? 0 : 1;
		totalPageTemp = totalPageTemp + plus;
		if(totalPageTemp <= 0) {
			totalPageTemp = 1;
		}
		this.total = totalPageTemp;
		
		// 设置当前页数
		// 总页数小于当前页数，应将当前页数设置为总页数
		if(this.total < this.pageNumber) {
			this.pageNumber = this.total;
		}
		// 当前页数小于1设置为1
		if(this.pageNumber < 1) {
			this.pageNumber = 1;
		}
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getRecord() {
		return record;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
	
}
