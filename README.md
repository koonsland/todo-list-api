# ToDo List 애플리케이션

## 목차
1. [소개](#소개)
2. [기능](#기능)
3. [데모](#데모)
4. [시작하기](#시작하기)
    - [필수 조건](#필수-조건)
    - [설치](#설치)
5. [사용 방법](#사용-방법)
6. [프로젝트 구조](#프로젝트-구조)
7. [기여](#기여)
8. [라이선스](#라이선스)
9. [문의](#문의)

## 소개
이 프로젝트는 Spring Boot 3.2 사용하여 만든 간단한 ToDo List 애플리케이션입니다.
이 애플리케이션은 사용자가 할 일을 추가, 수정, 삭제할 수 있도록 도와줍니다.

## 기능
- 할 일 전체 조회
- 할 일 상세 조회
- 할 일 추가
- 할 일 수정
- 할 일 삭제
- 할 일 완료 상태 표시


## 시작하기

### 필수 조건
- Spring Boot 3.2
- Java 21 이상
- H2 Database

### 설치

레포지토리를 클론합니다.<br/>

```bash
$ git clone https://github.com/koonsland/todo-list-api.git
$ cd todo-list-api
```

## 사용 방법
1. 브라우저에서 `http://localhost:8080`에 접속합니다.
2. 할 일을 추가, 수정 및 삭제합니다.

## 프로젝트 구조
todo/<br/>
│ src/<br/>
│ ├── main/<br/>
│ │ ├── java/ <br/>
│ │ │ ├── com.koonsland.todo/<br/>
│ │ │ │ ├── controller/<br/>
│ │ │ │ ├── dto/<br/>
│ │ │ │ ├── model/<br/>
│ │ │ │ ├── repository/<br/>
│ │ │ │ └── service/<br/>
│ │ │ ├── TodoApplication.java<br/>
│ └── build.gradle<br/>
└── README.md<br/>

## 문의
질문이 있으시면 [nicegsp@gmail.com](mailto:nicegsp@gmail.com)으로 연락주세요.
