package com.spring.test.test2;

public class EncryDTO {
	private String key;
	private String encStr;
	private String decStr;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getEncStr() {
		return encStr;
	}
	public void setEncStr(String encStr) {
		this.encStr = encStr;
	}
	public String getDecStr() {
		return decStr;
	}
	public void setDecStr(String decStr) {
		this.decStr = decStr;
	}
	@Override
	public String toString() {
		return "EncryDTO [key=" + key + ", encStr=" + encStr + ", decStr=" + decStr + "]";
	}
	
	
}
