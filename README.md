# Java web Homework

Java web 课程作业仓库

页面挂载在阿里云主机上，域名备案中 <http://123.56.16.42:9999/>

![](https://s2.ax1x.com/2020/02/28/3DqIne.png)

| 文件夹 | 描述                        |
|--------|-----------------------------|
| note   | 笔记                        |
| report | 实验报告                    |
| web    | 网页资源 HTML CSS JS JSP... |
| src    | java 代码                   |

猜数字表

```sql
CREATE TABLE `guess_number` (
  `id` int NOT NULL AUTO_INCREMENT,
  `j_session` varchar(50) NOT NULL,
  `number` smallint NOT NULL,
  PRIMARY KEY (`id`)
);
```
