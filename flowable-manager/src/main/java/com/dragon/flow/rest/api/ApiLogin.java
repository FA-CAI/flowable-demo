package com.dragon.flow.rest.api;


import com.dragon.tools.pager.PagerModel;
import com.dragon.tools.pager.Query;
import org.flowable.idm.api.Group;
import org.flowable.idm.api.GroupQuery;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/server/app")
public class ApiLogin {

    /**
     * 登录
     * @return
     */
    @GetMapping("/authentication")
    public Map login(@RequestBody LoginVo vo) {
        HashMap map =new HashMap(16);
         map.put("msg","status");
         return map;
    }

}
