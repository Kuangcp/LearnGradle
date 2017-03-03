## 关于task的入门
```
	task startSession<<{
		chant()
	}
	def chant(){
		printf 'print ant info '
	}
	3.times {
		task "yayGradle$it" << {
			printf 'Gradle rocks'
		}
	}
	yayGradle0.dependsOn startSession
	yayGradle2.dependsOn yayGradle1, yayGradle0
	task groupTherapy(dependsOn:yayGradle2)
```

****
### 测试构建一个基本的Java项目，编译得到jar
手动创建的目录结构是 src.main.java.com.myth.test
```
	apply plugin: 'java'
	version = 0.1
	sourceCompatibility = 1.8
	jar{
		manifest{
			attributes 'Main-Class' : 'com.myth.test.TestEntry'
		}
	}
	sourceSets{
		main{
			java {
				srcDirs = ['src']
			}
		}
	}
	test {
		java {
			srcDirs = ['test']
		}
	}
	buildDir = 'out'
	repositories {
		mavenCentral()
	}
```

### 构建web项目
- 内置jetty的war项目，没有main方法，也就不能直接java运行
- gradle jettyRun 运行 只要最后一行是 jettyRun： 没有报错，就可以打开浏览器访问了

```
	apply plugin: 'war' 
	apply plugin : 'jetty'
	webAppDirName  = 'webfiles'
	war {
		from 'static'
	}
	jettyRun{
		httpPort = 9090
		contextPath = 'myth'
	}
```

***





