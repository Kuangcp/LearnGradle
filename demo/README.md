## ��������Ĵ�������
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


## ���Թ���һ��������Java��Ŀ������õ�jar
�ֶ�������Ŀ¼�ṹ�� src.main.java.com.myth.test
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

## ����web��Ŀ
- ����jetty��war��Ŀ��û��main������Ҳ�Ͳ���ֱ��java����
- gradle jettyRun ���� ֻҪ���һ���� jettyRun�� û�б����Ϳ��Դ������������

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