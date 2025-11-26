# 🧸 soloBear – Card-Style Microblog App

🌏 Language Switch: [日本語](README.md) | [English](README-en.md)

※Some parts may be hard to read due to translation.
---

## 👩‍💻 Technologies Used

<p align="left">
  <!-- Frontend: Dark Charcoal -->
  <img src="https://img.shields.io/badge/HTML-3A3A3A.svg?style=for-the-badge&logoColor=white" />
  <img src="https://img.shields.io/badge/CSS-3A3A3A.svg?style=for-the-badge&logoColor=white" />
  <img src="https://img.shields.io/badge/JavaScript-3A3A3A.svg?style=for-the-badge&logoColor=white" />

  <!-- Backend: Almost Black Dark Gray -->
  <img src="https://img.shields.io/badge/Java-1E1E1E.svg?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Servlet%2FJSP-1E1E1E.svg?style=for-the-badge&logo=java&logoColor=white" />

  <!-- Tools / DB: Pure Black -->
  <img src="https://img.shields.io/badge/H2%20Database-000000.svg?style=for-the-badge&logo=h2&logoColor=white" />
  <img src="https://img.shields.io/badge/Apache%20Tomcat-000000.svg?style=for-the-badge&logo=apache-tomcat&logoColor=white" />
  <img src="https://img.shields.io/badge/Git-000000.svg?style=for-the-badge&logo=git&logoColor=white" />
  <img src="https://img.shields.io/badge/GitHub-000000.svg?style=for-the-badge&logo=github&logoColor=white" />
</p>

---

## ✨ Overview

soloBear is a simple, Twitter-style microblog app with a card-style design that allows you to enjoy short posts and simple interactions.
It is based on a program created during a vocational training class, which I customized with my own features and design improvements.  
Using card layouts and animations, it provides an intuitive and pleasant user experience.

---

## 🎯 Key Features

| Feature | Description |
|---------|-------------|
| 📝 Posting | Posts are organized in a card format, making them visually easy to read |
| 💖 Like Button | Gentle animation provides a pleasant response to user interactions |
| 🎨 UI/UX | Elegant, intuitive, and easy-to-use design |
| 🌓 Dark Mode CSS | Switch from `style.css` to `dark.css` to enjoy dark mode |

---

## 🚀 Setup

This app can be downloaded and run locally. It is intended for development and testing purposes.

The following folders and settings are required to run the app:

1. Clone this repository

- (Example: `git clone https://github.com/shiokuma000/portfolio.git your-folder-name`)

  
2. Import into Eclipse or similar IDE, then select the project.
- → Right-click → "Run on Server"
- Confirmed working (2025-11-25)

3. Initial login credentials  
- ID: test  
- Password: test  
※ Security is not guaranteed. Use for development and testing purposes only.

---

## 🔧 Technical Details

| Layer | Details / Intent |
|-------|----------------|
| 🗄️ DB | Maintains integrity with 3 tables + foreign keys |
| 🔐 Security | Passwords hashed and salted with BCrypt |
| ⚡ Frontend | Posting cards and animations for intuitive UX |
| 🖥️ Backend | Simple post management with PRG pattern |
| 🧩 Debugging | Cache handling and log checks for stable operation and improved development efficiency |

---

## 🔄 Improvements & Future Tasks

| Item | Description |
|------|-------------|
| 💖 Like Count & State Saving | Planned to save per user in the database in the future |
| 🔁 Reply & Repost | Considering adding interaction and sharing features for posts |
| 🧑‍💻 New User Registration | Plan to allow anyone to register |

※ The current Like feature is cosmetic only, but we are retaining the LIKES table and related SQL in preparation for future implementation.

---

## 📚 Project Structure & Design Documents

- [🪄 Project Structure](PROJECT.md)  
- [🔑 Login Process Design](document/LOGIN.md)  
- [📝 Logout Process Design](document/LOGOUT.md)  
- [✏️ Post/Delete Process Design](document/MAIN.md)  
- [🗄️ SQL Table Design](document/ER.md)  
- [🌗 SQL Initialization Design Document](document/DBInit.md)

---

## 🚀 Demo

| Like |   | Post/Delete |
|------|---|-------------|
| <img src="assets/like.gif" width="280" /> |   | <img src="assets/post.gif" width="300" /> |

※ Click images to enlarge.

---

## 💡 License & Copyright

- This project was created for learning purposes and is not intended for commercial use.  
- Licenses of libraries and tools belong to their respective authors.

---

## 📸 References

Illustration credit: Elionas – Pixabay

---

## 🗓️ Last Updated

2025-11-25

---

## 🌟 Special Thanks

Finally, thanks to:

- All instructors who taught skills at the vocational training school  
- TengouIwaharu722  
- Everyone visiting this page  

I sincerely appreciate your support and will continue to improve!
