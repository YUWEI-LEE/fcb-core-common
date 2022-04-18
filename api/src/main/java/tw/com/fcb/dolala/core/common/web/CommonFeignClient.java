package tw.com.fcb.dolala.core.common.web;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "common-client", url = "http://localhost:8100",path = "/common")
public interface CommonFeignClient extends  CommonApi{
}