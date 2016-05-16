package com.newframe.core.pojo.pojoimpl.impl;

import com.newframe.core.pojo.basepojo.SortableAndManageableEntity;
import com.newframe.core.pojo.basepojo.SortableEntityIfc;
import com.newframe.core.pojo.pojoimpl.TimeTaskIfc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "core_time_task")
public class TimeTask extends SortableAndManageableEntity implements TimeTaskIfc, SortableEntityIfc {
	/**任务ID*/
	private java.lang.String taskId;
	/**任务描述*/
	private java.lang.String taskDescribe;
	/**cron表达式*/
	private java.lang.String cronExpression;
	/**是否生效了0未生效,1生效了*/
	private java.lang.String isEffect;
	/**是否运行0停止,1运行*/
	private java.lang.String isStart;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  任务ID
	 */
	@Column(name ="TASK_ID",nullable=false,length=100)
	public java.lang.String getTaskId(){
		return this.taskId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  任务ID
	 */
	public void setTaskId(java.lang.String taskId){
		this.taskId = taskId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  任务描述
	 */
	@Column(name ="TASK_DESCRIBE",nullable=false,length=50)
	public java.lang.String getTaskDescribe(){
		return this.taskDescribe;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  任务描述
	 */
	public void setTaskDescribe(java.lang.String taskDescribe){
		this.taskDescribe = taskDescribe;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  cron表达式
	 */
	@Column(name ="CRON_EXPRESSION",nullable=false,length=100)
	public java.lang.String getCronExpression(){
		return this.cronExpression;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  cron表达式
	 */
	public void setCronExpression(java.lang.String cronExpression){
		this.cronExpression = cronExpression;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否生效了0未生效,1生效了
	 */
	@Column(name ="IS_EFFECT",nullable=false,length=1)
	public java.lang.String getIsEffect(){
		return this.isEffect;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否生效了0未生效,1生效了
	 */
	public void setIsEffect(java.lang.String isEffect){
		this.isEffect = isEffect;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String 是否运行0停止,1运行
	 */
	@Column(name ="IS_START",nullable=false,length=1)
	public java.lang.String getIsStart(){
		return this.isStart;
	}
	
	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否运行0停止,1运行
	 */
	public void setIsStart(java.lang.String isStart){
		this.isStart = isStart;
	}
}
