# flowable

#### 介绍


#### 软件架构
本系统采用微服务的架构设计


## 安装教程
### 一、 服务端初始化
#### 1、创建数据库表
```
  参考docs/sql/flowable.sql
```
#### 2、启动服务端
```
  启动FlowManagerApplication.java
```
### 二、 前端初始化
#### 1、安装Node(V12.x.x以上)和NPM(V6.x.x以上)
#### 2、安装淘宝镜像
```
  npm install -g cnpm --registry=https://registry.npm.taobao.org
```

#### 3、初始化前端项目
进入目录【/flowable/flowable-manager-ui】运行
``` 
  cnpm install
```

#### 4、启动项目
```
  npm run start:no-mock
```

### 三、登录账号密码
admin/test



#### 使用说明

## 原项目地址：https://gitee.com/lwj/flowable.git
1、导入数据库  所有的密码都是test  账号是00000001到0000004
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191128112800979.png)
2、运行rest 服务
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191128112843709.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2xpdXdlbmp1bjA1MTAx,size_16,color_FFFFFF,t_70)
3、运行前端页面 npm run start:no-mock
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191128112935187.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2xpdXdlbmp1bjA1MTAx,size_16,color_FFFFFF,t_70)
4、效果如下
4.1、模板管理
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191128113038267.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2xpdXdlbmp1bjA1MTAx,size_16,color_FFFFFF,t_70)
4.2、流程定义管理
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191128113205374.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2xpdXdlbmp1bjA1MTAx,size_16,color_FFFFFF,t_70)
4.3、任务管理
4.3.1、待办列表
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191128113356425.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2xpdXdlbmp1bjA1MTAx,size_16,color_FFFFFF,t_70)
4.3.2、办理任务
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191128113456305.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2xpdXdlbmp1bjA1MTAx,size_16,color_FFFFFF,t_70)
4.3.3、已办任务列表
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191128113526767.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2xpdXdlbmp1bjA1MTAx,size_16,color_FFFFFF,t_70)
4.3.4、我发起流程
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191128113559735.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2xpdXdlbmp1bjA1MTAx,size_16,color_FFFFFF,t_70)
5、请假表单绑定流程
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191128113646402.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2xpdXdlbmp1bjA1MTAx,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191128113702634.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2xpdXdlbmp1bjA1MTAx,size_16,color_FFFFFF,t_70)
*由于水平有限，如果有什么写的有问题的地方，请及时联系我，我会一步步的把这些年的经验都分享出来*



缺省的包在  flowable/docs/缺省的tools包/tools-1.0-SNAPSHOT.jar
