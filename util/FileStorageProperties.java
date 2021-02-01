package com.cts.cj.util;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
    
	private String uploadDir;
	
	private String secureContextPath;
	
    public String getSecureContextPath() {
		return secureContextPath;
	}

	public void setSecureContextPath(String secureContextPath) {
		this.secureContextPath = secureContextPath;
	}

	public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}
