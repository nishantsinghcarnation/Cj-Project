package com.cts.cj.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.cts.cj.domain.FileUpload;



public interface FileUploaderRepository  extends Neo4jRepository<FileUpload, Serializable>{

	       @Query("MATCH (f:FileUpload) where ID(f)={0} return f ")
	       public FileUpload getUploadedImg(Long ImagId);
	       
	       @Query("MATCH (f:FileUpload) where f.userId={0} and f.uploadType={1}  return f ")
	       public FileUpload getUpload(Long userId,String uploadType);
	       
	     
	       @Query("MATCH (f:FileUpload) where f.userId={0}  return f ")
	       public List<FileUpload> getDocList(Long userId);
	       

}
