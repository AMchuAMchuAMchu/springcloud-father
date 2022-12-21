package cn.itcast.user.web;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Description ==> TODO
 * BelongsProject ==> springcloud-father
 * BelongsPackage ==> cn.itcast.user.web
 * Version ==> 1.0
 * CreateTime ==> 2022-12-21 18:25:00
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
@Data
@ConfigurationProperties(prefix = "pattern")
public class PatternPropertiesTest01 {

    public String dateformat;

    public String shareConfig;


}
