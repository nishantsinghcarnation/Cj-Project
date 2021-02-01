package com.cts.cj.domain;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ApiResponse<T>  extends ResponseEntity<T>{

    private HttpStatus status;
    private String message;
    private Object result;

    @SuppressWarnings("unchecked")
	public ApiResponse(HttpStatus status, String message, Object result) {
    	super((T)result,null,status);
        //this.status = status;
        this.message = message;
        this.result = result;
    }
    
    public ApiResponse(HttpStatus status, String message) {
    	super(status);
        this.message = message;
     //   this.result = result;
    }
    
    @SuppressWarnings("unchecked")
	public ApiResponse(HttpStatus status, Object result) {
    	super((T) result,status);
       // this.message = message;
        this.result = result;
    }
    

   
    public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
