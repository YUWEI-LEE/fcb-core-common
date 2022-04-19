package tw.com.fcb.dolala.core.common.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.com.fcb.dolala.core.common.repository.CustomerAccountRepository;
import tw.com.fcb.dolala.core.common.repository.entity.CustomerAccountEntity;
import tw.com.fcb.dolala.core.common.service.mapper.CustomerMapper;
import tw.com.fcb.dolala.core.common.web.dto.CustomerAccountDto;
import tw.com.fcb.dolala.core.common.web.dto.CustomerDto;


@Transactional
@Service
public class CustomerAccountService {
	@Autowired
	CustomerAccountRepository repository;
	@Autowired
	CustomerMapper customerMapper;
	public CustomerAccountDto getCustomerAccount(String accountNumber)  throws Exception {
//		CustomerAccountDto customerAccount = new CustomerAccountDto();
		CustomerAccountEntity customerAccountEntity = repository.findByAccountNumber(accountNumber).orElseThrow(() -> new Exception("D001"));
//		BeanUtils.copyProperties(customerAccountEntity, customerAccount);
		CustomerAccountDto customerAccountDto = customerMapper.customerAccountToDto(customerAccountEntity);

		return customerAccountDto;
	}
}
