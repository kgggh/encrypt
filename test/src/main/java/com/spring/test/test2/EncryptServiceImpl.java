package com.spring.test.test2;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.salt.StringFixedSaltGenerator;
import org.springframework.stereotype.Service;

@Service
public class EncryptServiceImpl implements EncryptService {
	
	@Override
	//암호화
	public String encStr(String key) {
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("somePassword"); 
		encryptor.setAlgorithm("PBEWithMD5AndDES");
		encryptor.setSaltGenerator(new StringFixedSaltGenerator("someFixedSalt"));
		String encKey = encryptor.encrypt(key);
		return encKey;
	
	}
	@Override 
	//복호화
	public String decStr(String encStr) {
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("somePassword");
		encryptor.setAlgorithm("PBEWithMD5AndDES");
		encryptor.setSaltGenerator(new StringFixedSaltGenerator("someFixedSalt"));
		String decStr = encryptor.decrypt(encStr);
		return decStr;
	}

}
