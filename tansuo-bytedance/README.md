[探索字节跳动](https://leetcode-cn.com/explore/interview/card/bytedance/)

# 01   
- Set集合不能存储相同的元素，其是一个抽象接口，不能直接实例化一个set对象
- 常见方法  

|method|description|
|-|-|
|add()||
|clear()|去掉集合中的所有元素|
|contains|是否包含某一个元素|
|isEmpty()||
|iterator()|递归集合,返回一个iterator对象|
|remove()||
|size()||

- Set最常用的两大实现： HashSet、TreeSet
- TreeSet会将元素默认排序

# 02
- 数组长度的length不需要加括号，String.length()要加括号

# 05
- 翻转字符串等之类的问题，可以考虑双指针

# 16
- `Ayyays.sort(intervals,(v1,v2)->v1[0]-v2(0))`,假设传来两个值，v1和v2,那么他们的先后顺序以v1[0]比v2[0]的结果为准。若 v1[0] < v2[0] 则 v1 < v2，若 = 则 =，若 > 则 >
- `Arrays.copyOf()`功能是实现数组的复制，返回复制后的数组。参数是被复制的数组和复制的长度
