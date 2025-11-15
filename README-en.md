# 🧸 soloBear – Card-Style Microblog App

🌏 Language Switch: [Japanese](README.md) | [English](README-en.md)

---

※ I'm sorry if there are parts that are hard to read because I'm using a translator.

---

## 👩‍💻 Technologies Used

<p align="left">
  <!-- Frontend：濃いチャコール -->
  <img src="https://img.shields.io/badge/HTML-3A3A3A.svg?style=for-the-badge&logoColor=white" />
  <img src="https://img.shields.io/badge/CSS-3A3A3A.svg?style=for-the-badge&logoColor=white" />
  <img src="https://img.shields.io/badge/JavaScript-3A3A3A.svg?style=for-the-badge&logoColor=white" />

  <!-- Backend：ほぼ黒のダークグレー -->
  <img src="https://img.shields.io/badge/Java-1E1E1E.svg?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Servlet%2FJSP-1E1E1E.svg?style=for-the-badge&logo=java&logoColor=white" />

  <!-- Tools / DB：完全ブラック -->
  <img src="https://img.shields.io/badge/H2%20Database-000000.svg?style=for-the-badge&logo=h2&logoColor=white" />
  <img src="https://img.shields.io/badge/Apache%20Tomcat-000000.svg?style=for-the-badge&logo=apache-tomcat&logoColor=white" />
  <img src="https://img.shields.io/badge/Git-000000.svg?style=for-the-badge&logo=git&logoColor=white" />
  <img src="https://img.shields.io/badge/GitHub-000000.svg?style=for-the-badge&logo=github&logoColor=white" />
</p>

---

## ✨ Overview
soloBear is a simple, Twitter-style microblogging app.  
It is based on a program created during a vocational training class, which I customized with my own features and design improvements.  
The card-style layout organizes posts for readability and provides a clean, elegant display across different environments.  
The like button features a subtle animation, with a soft circle appearing around the heart, offering gentle feedback to user interactions.

---

## 🎯 Key Features

| Feature | Description |
|---------|-------------|
| 📝 Posting | Posts are organized in a card format, making them visually easy to read |
| 💖 Like Button | Gentle animation provides a pleasant response to user interactions |
| 🎨 UI/UX | Elegant, intuitive, and easy-to-use design |
| 🌓 Dark Mode CSS | Switch from `style.css` to `dark.css` to enjoy dark mode |

---

## 🔧 Backend Details

| Item | Description |
|------|-------------|
| 🗄️ Database | Managed with three tables and foreign keys to maintain data integrity |
| 🔐 Security | Passwords hashed and salted with Bcrypt for secure management |
| 🧩 Caching & Debugging | Cache handling and debug checks ensure stable operation |

---

## 💼 Project Structure

- [🪄 Project Structure](PROJECT.md)

  The structure is provided here; feel free to check it out.

---

## 🚀 Setup

This app can be downloaded and run locally. The following folders and settings are required:

- Clone this repository.
- Create an `h2` folder on your desktop.
- Place the downloaded DB file (`soloBear.my.db`,`soloBear.trace.db`) into the `h2` folder.
- Using eclipse.exe or similar, select the cloned dynamic project, right-click, and select "Run on Server" to run it.
- Initial login credentials:  
  - ID: test  
  - Password: test

※ Security is not guaranteed. Use for development and testing purposes only.  
※ Future updates will migrate to Maven, allowing connection without the DB file.

---

## 💻 Technical Points

| Layer | Technology |
|-------|------------|
| ⚡ Frontend | Interactive UI built with HTML / CSS / JavaScript |
| 🖥️ Backend | Provides basic server processing and data management |
| 🚀 Extensibility | Future enhancements such as like counts and notifications possible |

---

## 🔄 Improvements & Future Tasks

| Item | Description |
|------|-------------|
| 💖 Like Count & State Saving | Currently visual only; future plan to save per user in DB |
| 🔁 Reply & Repost | Considering adding interaction and sharing features for posts |
| 🧑‍💻 New User Registration | Plan to allow anyone to register |
| 🔐 Password Reset | Future support for password reset via email or SMS |

---

## 📚 Design Documents

Links to detailed design documents for soloBear’s processes and database design.  
Click to open each document.

- [🔑 Login Process Design](document/LOGIN.md)  
  Flow, screen layout, and session management until user login

- [📝 Logout Process Design](document/LOGOUT.md)  
  Flow and screen layout for logging out while logged in

- [✏️ Post/Delete Process Design](document/MAIN.md)  
  Flow for adding/deleting posts, detailed MVC explanations

- [🗄️ SQL Table Design](document/ER.md)  
  Structure, constraints, and notes for USERS / MUTTERS / LIKES tables

---

## 🚀 Demo

| Like |   | Post/Delete |
|------|---|-------------|
| <img src="assets/like.gif" width="300" /> |   | <img src="assets/post.gif" width="300" /> |

※ Click images to enlarge.

---

## 🛠 Tools Used

- ✂️ Video Editing: CapCut
- 🎞 GIF Generation: Rakko Tools
- 🔄 MP4 Conversion: FreeConvert
- 🗜 GIF Compression: iLoveIMG

---

## 💡 License & Copyright

- This project was created for learning purposes and is not intended for commercial use.  
- Licenses of libraries and tools belong to their respective authors.

---

## 📸 References

Illustration source: Footprint illustration – Pixabay  
https://pixabay.com/illustrations/%E3%82%B7%E3%83%AB%E3%82%A8%E3%83%83%E3%83%88-%E3%82%A4%E3%83%B3%E3%83%97%E3%83%AA%E3%83%B3%E3%83%88-%E8%B6%B3-1314467/

---

## 🗓️ Last Updated

2025-11-15

---

## 🌟 Special Thanks

Finally, thanks to:

- All instructors who taught skills at the vocational training school  
- TengouIwaharu722  
- Everyone visiting this page  

I sincerely appreciate your support and will continue to improve!