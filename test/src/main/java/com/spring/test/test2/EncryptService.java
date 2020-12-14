package com.spring.test.test2;


public interface EncryptService {
	
	public String encStr(String key)throws Exception; //암호화
	public String decStr(String encStr)throws Exception; //복호화
	public String  PBEWithMD5AndDES(String key, String encStr) throws Exception;
	

}
