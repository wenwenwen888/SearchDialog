# SearchDialog
仿bilibili搜索框效果(只需要三句话即可实现)

先看预览图(转换后有一点点失真):

<img src="https://github.com/wenwenwen888/SearchDialog/blob/master/preview/1.gif" width="30%" height="30%">

前言
-------
1,支持搜索历史(已经做了数据库存储了)

2,基本与bilibili的搜索效果差不多了

3,需要修改更多内容可以下载library自己修改

4,本人非大牛,有不妥之处请Issues指出,谢谢

5,参考了该po的[文章](http://lhunter.org/2016/08/06/%E4%BB%BF%20Bilibili%20%E6%90%9C%E7%B4%A2%E6%95%88%E6%9E%9C/) ,感谢


Usage
--------

With Gradle:
```groovy
  compile 'com.wenwenwen888:searchbox:1.0.0'
```


How to use
--------
第一句 , 实例化:
```java
 SearchFragment searchFragment = SearchFragment.newInstance();
```
第二句 , 设置回调:
```java
 searchFragment.setOnSearchClickListener(new IOnSearchClickListener() {
            @Override
            public void OnSearchClick(String keyword) {
                //这里处理逻辑
                Toast.makeText(ToolBarActivity.this, keyword, Toast.LENGTH_SHORT).show();
            }
        });
```
第三句 , 显示搜索框:
```java
  searchFragment.show(getSupportFragmentManager(),SearchFragment.TAG);
```
 
# License

    Copyright 2016 wenwenwen888

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
