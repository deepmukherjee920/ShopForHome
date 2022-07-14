package com.capstonegroupsix.api.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.capstonegroupsix.api.entity.ProductInfo;
import com.capstonegroupsix.api.repository.ProductInfoRepository;
import com.capstonegroupsix.api.vo.helpersection.CSVHelper;

@Service
public class CSVService {
	
	@Autowired
	ProductInfoRepository repository;
	
	public void save(MultipartFile file) {
	    try {
	      List<ProductInfo> tutorials = CSVHelper.csvToTutorials(file.getInputStream());
	      repository.saveAll(tutorials);
	    } catch (IOException e) {
	      throw new RuntimeException("fail to store csv data: " + e.getMessage());
	    }
	  }
	
	  public List<ProductInfo> getAllTutorials() {
	    return repository.findAll();
	  }

}
