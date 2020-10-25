package com.hqy.demo.bean;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiParam;

public class tdl implements Serializable {
    private Integer id;

    @JsonIgnore
    private Date creationTime;

    @ApiParam(value = "开始时间")
    private String startingTime;

    @ApiParam(value = "结束时间")
    private String endingTime;

    @ApiParam(value = "优先级")
    private Integer priority;

    @ApiParam(value = "待办事项")//属性required = true 用于提示内容必须填写
    private String details;

    private static final long serialVersionUID = 1L;
    
    public tdl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public tdl(String details, String startingTime, String endingTime, Integer priority) {
		super();
		this.details = details;
		this.startingTime = startingTime;
		this.endingTime = endingTime;
		this.priority = priority;
	}

    public tdl(Integer id, Date creationTime, String startingTime, String endingTime, Integer priority,
			String details) {
		super();
		this.id = id;
		this.creationTime = creationTime;
		this.startingTime = startingTime;
		this.endingTime = endingTime;
		this.priority = priority;
		this.details = details;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(String startingTime) {
        this.startingTime = startingTime == null ? null : startingTime.trim();
    }

    public String getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(String endingTime) {
        this.endingTime = endingTime == null ? null : endingTime.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", startingTime=").append(startingTime);
        sb.append(", endingTime=").append(endingTime);
        sb.append(", priority=").append(priority);
        sb.append(", details=").append(details);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}