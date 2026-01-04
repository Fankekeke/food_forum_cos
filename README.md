### 基于SpringBoot + Vue的美食论坛系统

美食社区平台、餐饮交流论坛、吃货互动系统、菜品分享社区、美食点评与讨论平台

#### 管理员功能模块介绍：
###### 公告管理：发布平台通知、活动信息或重要规则公告。用户管理：审核、编辑或封禁用户账号及权限设置。消息管理：统一处理系统内私信、通知与互动消息。敏感词管理：维护违禁词库，自动过滤不当内容。模块管理：配置论坛板块，如菜系、烘焙、探店等分类。消息回复：代表官方回复用户留言或社区提问。生鲜百科：维护食材、产地、储存等知识性内容库。留言板：查看并管理全站公开留言与反馈内容。首页管理：自定义首页轮播图、推荐帖、热门话题等展示。


#### 用户功能模块介绍：
###### 用户登录注册：通过手机号或邮箱完成账号创建与登录。发布贴子：在美食板块分享食谱、探店体验或烹饪心得。发布留言：在留言板或百科页面提交简短评论或建议。贴子回复：对他人帖子进行评论、点赞或互动交流。贴子收藏：将优质内容加入收藏夹，便于日后查阅。用户关注：关注感兴趣的美食达人，获取其新帖提醒。消息通知：接收系统提醒、回复通知或关注动态消息。

#### 安装环境

JAVA 环境 

Node.js环境 [https://nodejs.org/en/] 选择14.17

Yarn 打开cmd， 输入npm install -g yarn !!!必须安装完毕nodejs

Mysql 数据库 [https://blog.csdn.net/qq_40303031/article/details/88935262] 一定要把账户和密码记住

redis

Idea 编译器 [https://blog.csdn.net/weixin_44505194/article/details/104452880]

WebStorm OR VScode 编译器 [https://www.jianshu.com/p/d63b5bae9dff]

#### 采用技术及功能

后端：SpringBoot、MybatisPlus、MySQL、Redis、
前端：Vue、Apex、Antd、Axios

平台后台：springboot(框架) + redis(缓存中间件) + shiro(权限中间件) + mybatisplus(orm) + restful风格接口 + mysql(数据库)

开发环境：windows10 or windows7 ， vscode or webstorm ， idea + lambok

#### 前台启动方式

安装所需文件 yarn install 
运行 yarn run dev

#### 后端启动方式

1.首先启动redis，进入redis目录终端。输入redis-server回车
2.导入sql文件，修改数据库与redis连接配置
3.idea中启动后端项目

### 管理员
公告管理，用户管理，消息管理，公告管理，敏感词管理，模块管理，消息回复，生鲜百科，留言板，首页管理

### 用户
用户登录注册，发布贴子，发布留言，发布贴子，贴子回复，贴子收藏，用户关注，消息通知

#### 默认后台账户密码

[管理员]
admin
1234qwer

[用户]
fank
1234qwer



#### 项目截图
|  |  |
|---------------------|---------------------|
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733400844129.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733401021156.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733400820246.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733401013100.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733401124820.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733400942472.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733401114923.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733400926662.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733401102668.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733400917183.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733401062664.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733400887620.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733401051563.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733400878537.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733401040012.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733400866409.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733401030388.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1733400856557.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/work/936e9baf53eb9a217af4f89c616dc19.png) |

#### 演示视频

暂无

#### 获取方式

Email: fan1ke2ke@gmail.com

WeChat: `Storm_Berserker`

`附带部署与讲解服务，因为要恰饭资源非免费，伸手党勿扰，谢谢理解😭`

> 1.项目纯原创，不做二手贩子 2.一次购买终身有效 3.项目讲解持续到答辩结束 4.非常负责的答辩指导 5.**黑奴价格**

> 项目部署调试不好包退！功能逻辑没讲明白包退！

#### 其它资源

[2025年-答辩顺利通过-客户评价🍜](https://berserker287.github.io/2025/06/18/2025%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2024年-答辩顺利通过-客户评价👻](https://berserker287.github.io/2024/06/06/2024%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2023年-答辩顺利通过-客户评价🐢](https://berserker287.github.io/2023/06/14/2023%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2022年-答辩通过率100%-客户评价🐣](https://berserker287.github.io/2022/05/25/%E9%A1%B9%E7%9B%AE%E4%BA%A4%E6%98%93%E8%AE%B0%E5%BD%95/)

[毕业答辩导师提问的高频问题](https://berserker287.github.io/2023/06/13/%E6%AF%95%E4%B8%9A%E7%AD%94%E8%BE%A9%E5%AF%BC%E5%B8%88%E6%8F%90%E9%97%AE%E7%9A%84%E9%AB%98%E9%A2%91%E9%97%AE%E9%A2%98/)

[50个高频答辩问题-技术篇](https://berserker287.github.io/2023/06/13/50%E4%B8%AA%E9%AB%98%E9%A2%91%E7%AD%94%E8%BE%A9%E9%97%AE%E9%A2%98-%E6%8A%80%E6%9C%AF%E7%AF%87/)

[计算机毕设答辩时都会问到哪些问题？](https://www.zhihu.com/question/31020988)

[计算机专业毕业答辩小tips](https://zhuanlan.zhihu.com/p/145911029)


#### 接JAVAWEB毕设，纯原创，价格公道，诚信第一

`网站建设、小程序、H5、APP、各种系统 选题+开题报告+任务书+程序定制+安装调试+项目讲解+论文+答辩PPT`

More info: [悲伤的橘子树](https://berserker287.github.io/)
****
<p><img align="center" src="https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/%E5%90%88%E4%BD%9C%E7%89%A9%E6%96%99%E6%A0%B7%E5%BC%8F%20(3).png" alt="fankekeke" /></p>
