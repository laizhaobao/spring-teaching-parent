# 什么是跨域
https://www.ruanyifeng.com/blog/2016/04/cors.html

## 域(domain)
域名:www.sina.com,www.baidu.com
image.baidu.com
file.baidu.com
baidu.com顶级域名(一级域名)
image和file是baidu.com下的二级域名
## 不同的域名
协议,名称和端口号不同就表示是不同的域名

下面2个是不同的
http://www.baidu.com
https:www.baidu.com

不同的域名
http://www.baidu.com:8080
https:www.baidu.com:80


## 跨域访问
在a域名下访问b域名下的资源就叫做跨域访问
由于安全的原因,""浏览器"限定了跨域访问的能力
潜台词是:不在浏览器运行的程序是没有跨域问题的

以下常见的3种情况,浏览器是不进行跨域限制
1.image src ="
2.script src"
3.link  (css)

今天学习跨域,主要针对ajax跨域请求时该怎么处理


## 如何解决跨域的问题
常见的解决办法有如下几种
1. jsonp
2.cors

## cors
cross(跨) origin(源头) r resource(资源) s:share(共享)

## 简单请求和非简单请求
简单请求直接发送请求数据
非简单请求在发起真正请求之前会发起"预请求",预请求通过之后
才发起真正的请求
预请求一般用的请求方法是OPTIONS,英文名叫preflight


## 绕过跨域
因为cors的处理,需要服务端的配合,比如访问网易新闻的api,是无法配合的
所以的一般解决办法:
1.在服务端直接用java代码获取网易这种第三方的数据
    1.RestTemplate去请求第三方数据
    2.HttpClient (apache)
    3.OkHttp()
2.自己的服务端在需要的时候设置跨域

# 跨域访问下的会话管理

## 会话失效原因
1. 因为跨域ajax访问,安全的原因,客户端的浏览器不会默认传递
给服务端一些敏感信息,比如cookie
2. 每次跨域请求都不会带入session id这个cookie
3. 服务端就认为是一个新的用户,所以每次服务端都会生成一个新的sesssion id
给客户端
4.导致会话数据虽然存在,但是客户端对应不起来,所以就取不到数据.

默认情况下,跨域访问就变成是一个无状态的访问(stateless)

## 解决办法,就是
1. 后端设置CrossOrigin的allowCredentials = "true"
2.前端发起ajax请求时设置带上凭证 withCredentials:true
```js
$.ajax({
					url:"http://localhost:8080/sw",
					type:"GET",
					xhrFields:{
						withCredentials: true
					},
					success:function(result){
						alert(result.data);
						console.log(result);
					}
				});
```

> 注意: ajax设置避免每个请求都设置带上凭证,可以进行全局的设定

作业:
1.用post请求插入一条数据
2.用get请求获取列表数据
3.必须用跨域的方式实现
4. 插入的时候,在方法上直接设置跨域
5.获取数据的方法,在全局配置类中进行跨域设置



