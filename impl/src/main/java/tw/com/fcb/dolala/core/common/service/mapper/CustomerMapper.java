package tw.com.fcb.dolala.core.common.service.mapper;

import org.mapstruct.Mapper;
import tw.com.fcb.dolala.core.common.repository.entity.CustomerAccountEntity;
import tw.com.fcb.dolala.core.common.repository.entity.CustomerEntity;
import tw.com.fcb.dolala.core.common.web.dto.CustomerAccountDto;
import tw.com.fcb.dolala.core.common.web.dto.CustomerDto;

/**
 * Copyright (C),2022,FirstBank
 * FileName: CustomerMapper
 * Author: Han-Ru
 * Date: 2022/4/19 下午 01:04
 * Description: CustomerMapper
 */
@Mapper
public interface CustomerMapper {

    CustomerDto customerToDto( CustomerEntity  customerEntity);
    CustomerAccountDto customerAccountToDto(CustomerAccountEntity customerAccountEntity);
}
