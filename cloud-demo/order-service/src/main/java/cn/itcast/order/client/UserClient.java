package cn.itcast.order.client;

import cn.itcast.order.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Description ==> TODO
 * BelongsProject ==> springcloud-father
 * BelongsPackage ==> cn.itcast.order.client
 * Version ==> 1.0
 * CreateTime ==> 2022-12-21 18:38:50
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@FeignClient("userservice")
public interface UserClient {
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id")Long id);
}
