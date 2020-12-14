package com.spring.test.test2;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.salt.StringFixedSaltGenerator;
import org.springframework.stereotype.Service;

@Service
public class EncryptServiceImpl implements EncryptService {
	
	@Override
	//암호화
	public String encStr(String key)throws Exception {
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("test"); 
		encryptor.setAlgorithm("PBEWithMD5AndDES");
		String encKey = encryptor.encrypt(key);
		return encKey;
		
	}
	@Override 
	//복호화
	public String decStr(String encStr)throws Exception {
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("test");
		encryptor.setAlgorithm("PBEWithMD5AndDES");
		String decStr = encryptor.decrypt(encStr);
		return decStr;
	}
	@Override
	public String PBEWithMD5AndDES(String key, String encStr) throws Exception {
		
		
		return null;
	}

}
