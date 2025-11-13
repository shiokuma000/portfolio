# SQLテーブル設計書

## 1. 概要
本設計書は、ユーザー投稿アプリにおける主要テーブルの構造と制約を整理したものです。  
全テーブルまとめで表示しています。

**制約のルール：**  
- `PRIMARY KEY` → 主キー  
- `UNIQUE` → 一意制約  
- `FOREIGN KEY` → 外部キー制約

---

## 2. テーブル一覧

## 2. テーブル一覧

| テーブル名       | カラム名       | 型/長さ | 制約                       | 備考 |
|-----------------|----------------|---------|----------------------------|------|
| 🧸 USERS        | ID             | INT     | PRIMARY KEY                | 自動採番 |
|                 | LOGIN_NAME     | VARCHAR | UNIQUE                     | ログインID |
|                 | NAME           | VARCHAR |                            | 表示名 |
|                 | PASS           | VARCHAR |                            | ハッシュ化パスワード |
| 📝 MUTTERS      | ID             | INT     | PRIMARY KEY                | 自動採番 |
|                 | USER_ID        | INT     | FOREIGN KEY → USERS(ID)    | 投稿者ID |
|                 | TEXT           | TEXT    |                            | 投稿内容 |
|                 | CREATED_AT     | DATETIME|                            | 投稿日時 |
| ❤️ LIKES        | ID             | INT     | PRIMARY KEY                | 自動採番 |
|                 | TWEET_ID       | INT     | FOREIGN KEY → MUTTERS(ID)  | 対象投稿ID |
|                 | USER_ID        | INT     | FOREIGN KEY → USERS(ID)    | いいねしたユーザーID |


---

## 3. 外部キー関係

- `MUTTERS.USER_ID` → `USERS.ID`  
- `LIKES.TWEET_ID` → `MUTTERS.ID`  
- `LIKES.USER_ID` → `USERS.ID`  

---

## 4. ポイントまとめ

- **一意性:** `USERS.LOGIN_NAME` はユニーク制約により、重複不可。  
- **整合性:** 外部キー制約で投稿やいいねは存在するユーザーや投稿に紐付けられる。  
- **自動採番:** 各テーブルの `ID` は主キーとして自動採番。  
