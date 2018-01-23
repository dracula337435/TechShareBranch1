# TechShareBranch1
技术分享，模式探险，外传1，黑客松见闻与思考

## 要说明的点

### linux建文件夹，笛卡尔积

使用如下命令可直接做出黑客松项目的目录结构  
```mkdir -p {portal,servicei,service}/src/{main,test}/{java,kotlin,resources}```  
然后可使用如下命令查看目录结构  
```tree```  
可以发现已有按上述集合的笛卡尔积的目录结构

### docker --link

有点像dns，实际上是添加了hosts  
先跑一个容器，取名“1st-nginx”  
```docker run -d --name 1st-nginx nginx```  
再跑一个容器，用参数“--link 1st-nginx:在新容器中的名字”  
```docker run -d --name 2nd-nginx --link 1st-nginx:another-nginx nginx```  
查看第二个容器的hosts文件  
```docker exec -it 2nd-nginx cat /etc/hosts```  
可以发现其中有“在新容器中的名字”的记录

### java启动命令中"-cp lib\\*"的用法

项目各模块说明
* root打包后含有suba和subb两个jar
* suba中有A类
* subb中有B类

zip包下bin\start脚本。  
* 完整cp，可以发现A类
* 完整cp，可以发现B类
* 仅有root，和lib\a*，无法发现B类