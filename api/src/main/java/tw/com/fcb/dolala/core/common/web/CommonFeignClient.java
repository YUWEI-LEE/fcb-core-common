package tw.com.fcb.dolala.core.common.web;

/**
 * Copyright (C),2022,FirstBank
 * FileName: CommonFeignClient
 * Author: Han-Ru
 * Date: 2022/4/17 下午 02:49
 * Description: CommonFeignClient
 */

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "common", path = "localhost:8100/api/common")
public interface CommonFeignClient extends  CommonApi{
}
