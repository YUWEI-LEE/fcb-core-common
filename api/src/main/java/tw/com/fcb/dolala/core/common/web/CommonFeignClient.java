package tw.com.fcb.dolala.core.common.web;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "common-client", url = "${common.url}",path = "/common")
public interface CommonFeignClient extends  CommonApi{
}