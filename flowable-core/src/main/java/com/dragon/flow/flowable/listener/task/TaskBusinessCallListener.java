package com.dragon.flow.flowable.listener.task;

import com.dragon.flow.flowable.listener.BusinessCallListener;
import org.flowable.engine.delegate.TaskListener;
import org.flowable.engine.impl.el.FixedValue;
import org.flowable.task.service.delegate.DelegateTask;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Description: 任务监听回调
 * @Author: Bruce.liu
 * @Since:13:39 2019/12/12
 * 2019 ~ 2030 版权所有
 */
@Scope
@Component(value = "taskBusinessCallListener")
public class TaskBusinessCallListener extends BusinessCallListener implements TaskListener {
    /**
     * rest接口
     */
    private FixedValue restUrl;
    /**
     * 参数 多个的话用分号隔开 实例 userCode:00004737;status:1
     */
    private FixedValue params;

    @Override
    public void notify(DelegateTask delegateTask) {
        String processInstanceId = delegateTask.getProcessInstanceId();
        String restUrlStr = null, paramsStr = null;
        if (restUrl != null) {
            restUrlStr = restUrl.getExpressionText();
        }
        if (params != null) {
            paramsStr = params.getExpressionText();
        }
        //执行回调
        //TODO 临时处理
        restUrlStr = "http://192.168.15.135:8080/rest/leave/updateLeaveStatus";
        paramsStr = "status:1";
        this.callBack(processInstanceId, restUrlStr, paramsStr);
    }
}
