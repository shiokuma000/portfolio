 # 🧸 soloBear – Card-Style Microblog App

🌏 Language Switch: [Japanese](README.md) | [English](README-en.md)

---

## 👩‍💻 Technologies Used

<p align="left">
  <!-- Frontend: Dark Charcoal -->
  <img src="https://img.shields.io/badge/HTML-3A3A3A.svg?style=for-the-badge&logoColor=white" />
  <img src="https://img.shields.io/badge/CSS-3A3A3A.svg?style=for-the-badge&logoColor=white" />
  <img src="https://img.shields.io/badge/JavaScript-3A3A3A.svg?style=for-the-badge&logoColor=white" />

  <!-- Backend: Almost black dark gray -->
  <img src="https://img.shields.io/badge/Java-1E1E1E.svg?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Servlet%2FJSP-1E1E1E.svg?style=for-the-badge&logo=java&logoColor=white" />

  <!-- Tools / DB: Pure black -->
  <img src="https://img.shields.io/badge/H2%20Database-000000.svg?style=for-the-badge&logo=h2&logoColor=white" />
  <img src="https://img.shields.io/badge/Apache%20Tomcat-000000.svg?style=for-the-badge&logo=apache-tomcat&logoColor=white" />
  <img src="https://img.shields.io/badge/Git-000000.svg?style=for-the-badge&logo=git&logoColor=white" />
  <img src="https://img.shields.io/badge/GitHub-000000.svg?style=for-the-badge&logo=github&logoColor=white" />
</p>

---

## ✨ Overview
soloBear is a simple, Twitter-style microblogging app.  
It is based on a program created during vocational school classes, which I customized by adding my own features and design improvements.  
The card-style layout organizes posts, making them visually clear and easy to read, while offering an elegant display across all environments.  
The like button features a subtle animation with a soft circle floating around the heart, providing gentle feedback for user interactions.

---

## 🎯 Key Features

| Feature | Description |
|----------|-------------|
| 📝 Posting | Posts are organized in card format for a visually readable layout |
| 💖 Like Button | Gentle animation provides a pleasant response to user actions |
| 🎨 UI/UX | Elegant, intuitive, and easy-to-use design |
| 🌓 Dark Mode CSS | You can enjoy dark mode by switching from style.css → dark.css |

---

## 🚀 Setup

You can download and run this app locally.  
The following folders and configurations are required:

- Clone this repository (e.g., `git clone https://github.com/shiokuma000/portfolio.git YourFolderName`)
- Create an `h2` folder on your desktop
- Place the downloaded DB files (`soloBear.my.db`, `soloBear.trace.db`) into the `h2` folder
- Open the cloned dynamic project in Eclipse (or similar), right-click → "Run on Server" to run the app (tested on 2025-11-14)
- Initial login credentials:  
  - ID: test  
  - Password: test

⚠ Security is not guaranteed. This app is intended for development and testing purposes only.

⚡ In the future, the project will be migrated to Maven, allowing it to connect without manual DB setup.

---

## 🔧 Behind the Scenes

| Item | Description |
|------|-------------|
| 🗄️ Database | 3 tables with foreign key management to ensure data integrity |
| 🔐 Security | Passwords are hashed and salted with Bcrypt for safe storage |
| 🧩 Cache & Debug | Cache handling and debugging checks ensure stable operation |

---

## 💼 Project Structure

- [🪄 Project Structure](PROJECT.md)

A document summarizing the folder structure and MVC flow of the app.  
Intended for those who want a deeper understanding of the development details.

---

## 💻 Technical Highlights

| Layer | Technology |
|-------|-------------|
| ⚡ Frontend | Interactive UI built with HTML / CSS / JavaScript |
| 🖥️ Backend | Simple server processing and data management provide core functionality |
| 🚀 Extensibility | Future features like like counts and notifications can be added |

---

## 🔄 Improvements & Future Plans

| Item | Description |
|------|-------------|
| 💖 Like Count & State Saving | Currently visual only; will be stored in DB per user in future |
| 🔁 Replies & Reposts | Considering adding interaction and sharing features for posts |
| 🧑‍💻 New User Registration | Will allow anyone to register in the future |

---

## 📚 Design Documents

Links to detailed design documents for soloBear's processes and database structure.  
Click to open each document.

- [🔑 Login Process Design](document/LOGIN.md)  
  Flow, screen layout, and session management until user login

- [📝 Logout Process Design](document/LOGOUT.md)  
  Flow and screen layout until logged-in users log out

- [✏️ Post & Delete Process Design](document/MAIN.md)  
  Detailed explanation of adding/deleting posts based on MVC structure

- [🗄️ SQL Table Design](document/ER.md)  
  Structure, constraints, and notes for USERS / MUTTERS / LIKES tables

---

## 🚀 Demo

| Like |   | Post / Delete |
|----------------|---|-------------------|
| <img src="assets/like.gif" width="280" /> |   | <img src="assets/post.gif" width="300" /> |

*Click images to enlarge.*

---

## 🛠 Tools Used

- ✂️ Video Editing: CapCut
- 🎞 GIF Generation: Rakko Tools
- 🔄 MP4 Conversion: FreeConvert
- 🗜 GIF Optimization: iLoveIMG

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

Finally, I would like to thank:

- The instructors at vocational school who taught me these skills  
- TengouIwaharu722  
- Everyone who has visited this page

Thank you very much! I will continue to improve my skills.