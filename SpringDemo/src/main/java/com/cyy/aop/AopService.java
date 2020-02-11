package main.java.com.cyy.aop;

import java.util.logging.Logger;

/**
 * Created by 12576 on 2020/2/10.
 */
public class AopService {

    private static final Logger log=Logger.getLogger(String.valueOf(AopService.class));

    public void before(){
        log.info("前置增强");
    }

    public void rear(){
        log.info("后置增强");

    }

    public void abnormalEnhancement(RuntimeException e){
        log.info("异常增强"+e);
    }


    public void finalEnhancement(){
        log.info("最终增强");
    }


    public void surroundEnhancement(){
        log.info("环绕增强");
    }
}
