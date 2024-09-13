package com.JinjH.Huaojcodesandbox;


import com.JinjH.Huaojcodesandbox.model.ExecuteCodeRequest;
import com.JinjH.Huaojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
