##A simple REST api built with Spring Boot.

Sending a GET request to:
```
http://localhost:8080/greeting/
```
Will return:
```
{"id":1,"content":"Hello world!"}
```

Including a name is easy:
```
http://localhost:8080/greeting/foo
```
Will return:
```
{"id":2,"content":"Hello foo!"}
```