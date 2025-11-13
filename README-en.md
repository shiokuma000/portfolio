# 🧸 soloBear – Card-style Microblogging App

🌏 Language switch: [Japanese](README.md) /[English](README-en.md)

---

## ✨ Overview
soloBear is a simple, Twitter-like microblogging app.  
It was developed by customizing and expanding a program created in class, with additional features and design improvements.  
The card-style layout organizes posts neatly, making them easy to read, and ensures a clean, elegant display on any device.  
The "Like" button features a subtle animation with a soft circle floating around the heart, providing gentle visual feedback for user interactions.

---

## 🎯 Key Features

| Feature | Description |
|---------|-------------|
| 📝 Posting | Posts are organized in cards, providing a visually easy-to-read layout |
| 💖 Likes | Gentle animations provide satisfying feedback to user interactions |
| 🎨 UI/UX | Elegant, intuitive, and easy-to-use interface design |

---

## 🔧 Behind the Scenes

| Item | Description |
|------|-------------|
| 🗄️ Database | Three tables with foreign key constraints to maintain data integrity |
| 🔐 Security | Passwords are hashed and salted with Bcrypt for secure management |
| 🧩 Cache & Debug | Cache handling and debug checks ensure stable operation |

---

## 💻 Technical Highlights

| Layer | Technology |
|-------|------------|
| ⚡ Frontend | HTML / CSS / JavaScript for an interactive UI |
| 🖥️ Backend | Simple server-side logic and data management for core functionality |
| 🚀 Extensibility | Future features such as like counters or notifications can be added |

---

## 🔄 Improvements & Future Plans

| Item | Description |
|------|-------------|
| 💖 Like count & state saving | Currently only visual; will later store likes per user in the database |
| 🔁 Replies & Reposts | Planning to add post interactions and sharing features |
| 🧑‍💻 New user registration | Will allow anyone to register |
| 🔐 Password reset | Will support password resets via email or SMS |

---

## 📚 Design Documents

Links to detailed design documents for soloBear's processes and database.  
Click to view each document.

- [🔑 Login Process Design](document/LOGIN.md)  
  Detailed flow, screen layout, and session management for user login

- [📝 Logout Process Design](document/LOGOUT.md)  
  Flow and screen layout for logging out a logged-in user

- [✏️ Post & Delete Process Design](document/MAIN.md)  
  Detailed explanation of post creation and deletion based on the MVC structure

- [🗄️ SQL Table Design](document/ER.md)  
  Table structures, constraints, and notes for USERS, MUTTERS, and LIKES

---

## 📸 Demo / Screenshots

Illustration source: Footprints illustration – Pixabay  
https://pixabay.com/illustrations/%E3%82%B7%E3%83%AB%E3%82%A8%E3%83%83%E3%83%88-%E3%82%A4%E3%83%B3%E3%83%97%E3%83%AA%E3%83%B3%E3%83%88-%E8%B6%B3-1314467/
