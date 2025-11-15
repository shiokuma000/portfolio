# 🧸 soloBear – Card-Style Microblog App

🌏 Language Switch: [日本語](README.md) / [English](README-en.md)

---

## 👩‍💻 Technologies Used

<p align="left">
  <!-- Frontend -->
  <img src="https://img.shields.io/badge/HTML-000000.svg?style=for-the-badge&logoColor=white" />
  <img src="https://img.shields.io/badge/CSS-000000.svg?style=for-the-badge&logoColor=white" />
  <img src="https://img.shields.io/badge/JavaScript-000000.svg?style=for-the-badge&logoColor=white" />

  <!-- Backend -->
  <img src="https://img.shields.io/badge/Java-000000.svg?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Servlet%2FJSP-000000.svg?style=for-the-badge&logo=java&logoColor=white" />

  <!-- Database -->
  <img src="https://img.shields.io/badge/H2%20Database-000000.svg?style=for-the-badge&logo=h2&logoColor=white" />

  <!-- Tools -->
  <img src="https://img.shields.io/badge/Apache%20Tomcat-000000.svg?style=for-the-badge&logo=apache-tomcat&logoColor=white" />
  <img src="https://img.shields.io/badge/Git-000000.svg?style=for-the-badge&logo=git&logoColor=white" />
  <img src="https://img.shields.io/badge/GitHub-000000.svg?style=for-the-badge&logo=github&logoColor=white" />
</p>

---

## ✨ Overview
soloBear is a simple, Twitter-style microblogging app.  
It is based on a program created during class, which I customized by adding my own features and design improvements.  
The card-style layout organizes posts for better readability and provides a clean, visually pleasing display across all devices.  
The like button features a subtle animation with a soft circle floating around the heart, giving gentle feedback for user interactions.

---

## 🎯 Key Features

| Feature | Description |
|---------|-------------|
| 📝 Posting | Posts are organized in a card layout, making them visually easy to read |
| 💖 Likes | Gentle animations provide pleasant feedback for user actions |
| 🎨 UI/UX | Elegant, intuitive, and easy-to-use interface design |
| 🌓 Dark mode CSS included | Enjoy dark mode by changing style.css to dark.css |

---

## 🔧 Under the Hood

| Item | Description |
|------|-------------|
| 🗄️ Database | 3-table structure with foreign key management to maintain data integrity |
| 🔐 Security | Passwords are hashed and salted using Bcrypt for safe storage |
| 🧩 Caching & Debug | Cache handling and debugging checks ensure stable operation |

---

## 💼 Project Structure

- [🪄 Project Structure](PROJECT.md)

It's posted here. I'd appreciate it if you could take a look.

---

## 🚀 Setup

This application can be downloaded and run locally.  
To run it, the following folder and settings are required:

- Clone this.
- Create an `h2` folder on your desktop.
- Place the downloaded DB file (`soloBear.my.db`) in the `h2` folder.
- Run it with eclipse.exe or similar and it will work. (Operation confirmed as of 2025-11-14)
- Default login credentials:
  - ID: test
  - Password: test

※ Security is not guaranteed. Please use this for development and testing purposes only.

※ We plan to convert it to Maven in the future and improve it so that it can be connected even without this.


---

## 💻 Technical Highlights

| Layer | Technology |
|-------|------------|
| ⚡ Frontend | HTML / CSS / JavaScript to build an interactive UI |
| 🖥️ Backend | Simple server processing and data management for core functionality |
| 🚀 Extensibility | Future additions such as like counts and notifications are possible |

---

## 🔄 Improvements & Future Tasks

| Item | Description |
|------|-------------|
| 💖 Like count & state saving | Currently visual only; will store per-user data in the database in the future |
| 🔁 Replies & Reposts | Planning to add interactions and sharing features for posts |
| 🧑‍💻 New user registration | Will support registration for any user |
| 🔐 Password reset | Will support email/SMS-based password reset for forgotten passwords |

---

## 🎬 Demo

| Like |   | Post & Delete |
|------|---|---------------|
| <img src="assets/like.gif" width="300" /> |   | <img src="assets/post.gif" width="300" /> |

*Click on the GIFs to enlarge*

## 🛠 Tools Used

- ✂️ Video Editing: CapCut
- 🎞 GIF Generation: Rakko Tool
- 🔄 MP4 Conversion: FreeConvert
- 🗜 GIF Compression: iLoveIMG

---

## 📚 Design Documents

Links to detailed design documents for soloBear's processes and database structure.  
Click to view each document.

- [🔑 Login Process Design](document/LOGIN.md)  
  Details of the user login flow, screen structure, and session management

- [📝 Logout Process Design](document/LOGOUT.md)  
  Details of the logout flow for logged-in users

- [✏️ Posting & Deleting Process Design](document/MAIN.md)  
  Detailed flow for adding and deleting posts, based on MVC structure

- [🗄️ SQL Table Design](document/ER.md)  
  Structure, constraints, and notes for USERS / MUTTERS / LIKES tables

---

## 💡 License and Copyright

- This project was created for educational purposes and is not intended for commercial use.
- Licenses for various libraries and tools belong to their respective authors.

---

## 📸 Illustration Credits

Illustration source: Footprints – Pixabay  
https://pixabay.com/ja/illustrations/%E3%82%B7%E3%83%AB%E3%82%A8%E3%83%83%E3%83%88-%E3%82%A4%E3%83%B3%E3%83%97%E3%83%AA%E3%83%B3%E3%83%88-%E8%B6%B3-1314467/

---

## 🗓️Last ​​updated

2025-11-15

---

## 🌟 Special Thanks

Lastly,

- All the instructors at the vocational training school who taught me valuable skills  
- TengouIwaharu722  
- Everyone who has visited this page  

Thank you very much! I will continue to do my best.

