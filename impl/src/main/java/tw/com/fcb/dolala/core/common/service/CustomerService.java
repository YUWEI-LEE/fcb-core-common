package tw.com.fcb.dolala.core.common.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.com.fcb.dolala.core.common.repository.CustomerRepository;
import tw.com.fcb.dolala.core.common.repository.entity.CustomerEntity;
import tw.com.fcb.dolala.core.common.service.mapper.CustomerMapper;
import tw.com.fcb.dolala.core.common.web.dto.CustomerDto;

@Transactional
@Service
public class CustomerService {
	@Autowired
	CustomerRepository repository;
	@Autowired
	CustomerMapper customerMapper;
	public CustomerDto getCustomer(String customerSeqNo)  throws Exception{
//		CustomerDto customer = new CustomerDto();
		CustomerEntity customerEntity = repository.findByCustomerSeqNo(customerSeqNo).orElseThrow(() -> new Exception("D001"));
		CustomerDto customerDto = customerMapper.customerToDto(customerEntity);
//		BeanUtils.copyProperties(customerEntity, customer);
		return customerDto;
	}

	public CustomerDto getCustomerId(String customerId)  throws Exception{
//		CustomerDto customer = new CustomerDto();
		CustomerEntity customerEntity = repository.findByCustomerId(customerId).orElseThrow(() -> new Exception("D001"));
//		BeanUtils.copyProperties(customerEntity, customer);
		CustomerDto customerDto = customerMapper.customerToDto(customerEntity);
		return customerDto;
	}
}
