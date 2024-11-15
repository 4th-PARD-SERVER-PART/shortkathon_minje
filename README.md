# 💻 간단한 블로그 플렛폼 API

## 기능:

1. **[유저 관리](#1-user-feature-testing)**
  - **유저 추가**
  - **유저 및 정보 조회**

2. **[정보 관리](#2-info-feature-testing)**
  - **정보 작성**

### Swagger 화룡앟여 test 하기
'http://localhost:8080/swagger-ui/index.html#/'

---

## 1. **User Feature Testing**

<table>
<tr>
<td>
  
#### a. **유저 추가하기r**
- **Endpoint**: `POST /user`
- **Try it out json**:
 
     ```json 
     {
       "name": "String",
       "context" : "String"
     }
     ```
  - **Results 👉👉👉**

</td>
<td>

![image](https://github.com/user-attachments/assets/93db0afb-6ad3-4acf-8bfd-112c878a14b3)

</td>
</tr>

<tr>
<td>

#### b. **유저 및및 조회하기 by ID**

- **Endpoint**: `GET /user/{userId}`
- **Results 👉👉👉**

</td>
<td>

![image](https://github.com/user-attachments/assets/e4136cce-e7ee-4aab-af60-5e56751d9e9b)

</td>
</tr>
</table>

---

## 2. **Info Feature Testing**

<table>
<tr>
<td>

#### a. **Create a Post**

- **Endpoint**: `Post /info/{userId}`
- **Try it out json**.
     ```json
     {
      "infoType1": "string",
      "infoType2": "string",
      "infoHobby": [
        "string"
      ],
      "wantType1": "string",
      "wantType2": "string",
    }
     ```
- **Results 👉👉👉**

</td>
<td>

![image](https://github.com/user-attachments/assets/3f7dadbc-a4bf-4a9c-9542-5e23ee10db57)

</td>
</tr>
</table>

---
