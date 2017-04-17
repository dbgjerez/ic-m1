package com.dbg.ic.m1.dto;

import java.io.Serializable;

import com.dbg.ic.m1.model.StatusEnum;

public class StatusDTO implements Serializable {

	private static final long serialVersionUID = -5490685490462885635L;

	private String status = StatusEnum.UP.name();

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
