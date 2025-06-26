package com.lsj.notes.aspect;

import com.lsj.notes.annotation.NeedLogin;
import com.lsj.notes.scope.RequestScopeData;
import com.lsj.notes.utils.ApiResponseUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NeedLoginAspect {

    @Autowired
    private RequestScopeData requestScopeData;

    @Around("@annotation(needLogin)")
    public Object around(ProceedingJoinPoint joinPoint, NeedLogin needLogin) throws Throwable {

        if (!requestScopeData.isLogin()) {
            return ApiResponseUtil.error("用户未登录");
        }

        if (requestScopeData.getUserId() == null) {
            return ApiResponseUtil.error("用户 ID 异常");
        }
        return joinPoint.proceed();
    }
}
