# 《编程珠玑》
讲述作者实际开发中解决问题的经验

## 第一章 开篇
- 准确的问题描述，考虑输入输出和约束条件

## 第二章 啊哈！算法
- 二分搜索
- 排序

## 第三章 数据决定程序结构
- 模版编程，提高复用性

## 第四章 编写正确的程序

## 第五章 编程

## 第六章 程序性能分析

## 第七章 粗略估算

## 第八章 算法设计技术
- 问题及简单算法
- 两个平方算法
- 分治算法
- 扫描算法
- 实际运行时间
- 原理

## 第九章 代码调优

## 第十章 节省空间
- 关键在于简单
- 数据空间技术
- 代码空间技术

## 第十一章 排序

## 第十二章 取样问题

## 第十三章 搜索
- 线性结构

## 第十四章 堆

## 第十五章 字符串

## 附录D 代码调优法则
- 空间换时间法则
- 时间换空间法则
- 循环法则，将代码移出循环。
与其在循环的每次迭代都执行一次某种运算，不如将其移到循环体外，只计算一次。
如for(int i=1;i<a.length;i++) 改为for(int i=1,len=a.length;i<len;i++)
避免每次循环都要去计算a.length
- 逻辑法则
- 过程法则
- 表达式法则