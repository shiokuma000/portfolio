# 🧸 soloBear – カード風マイクロブログアプリ

🌏 言語切替: [日本語](README.md) | [English](README-en.md)

---

## 👩‍💻 使用技術


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

## ✨ 概要

soloBearは、Twitter風のシンプルなマイクロブログアプリです。
職業訓練校の授業で作ったプログラムをベースに、自分なりに機能やデザインをアレンジし、読みやすく直感的に操作できるUXを意識して開発しました。

---

## 🎯 主な特徴

| 機能 | 説明 |
|----------|-------------|
| 📝 投稿機能 | カード形式で投稿が整理され、視覚的に読みやすいレイアウト |
| 💖 いいね機能 | 優しいアニメーションで、ユーザー操作に心地よい反応を提供 |
| 🎨 UI/UX | 上品で直感的、操作しやすいデザインを意識 |
| 🌓 ダークモードCSS付き | style.css→dark.cssにすることでダークモードも楽しめます |

---

## 🚀 セットアップ

このアプリはダウンロードしてローカルで動作させることができます。
実行にあたり、以下のフォルダと設定が必要です。

- このリポジトリを clone してください。（例：`git clone https://github.com/shiokuma000/portfolio.git 任意のフォルダ名`）
- `h2` フォルダをデスクトップに作成してください。
- DBファイル（`soloBear.my.db`,`soloBear.trace.db`)を `h2` フォルダに入れてください。
- Eclipseなどでプロジェクトを選択 → 右クリック → 「サーバーで実行」(2025-11-14 動作確認済）
- 初期ログイン情報  
  - ID: test  
  - Password: test
 
※ セキュリティは保証されません。開発・動作確認用としてご利用ください。

※ 今後maven化し、こちらがなくとも繋げられるように改善する予定です。

---

## 🔧 特に工夫したポイント

| 項目 | 説明 |
|------|--------------|
| 🗄️ データベース | 3つのテーブル構成で外部キーを管理し、データ整合性を保持|
| 🔐 セキュリティ | パスワードはBcryptでハッシュ化・ソルト済み、安全に管理 |
| 🧩 キャッシュ・デバッグ | キャッシュ対策やデバッグ確認を行い、安定した動作を実現 |

---

## 💻 技術ポイント

| レイヤー | 技術 |
|-------|-------------|
| ⚡ フロントエンド | 投稿カードやアニメーションでUX向上、直感的操作が可能 |
| 🖥️ バックエンド | シンプルなサーバー処理とデータ管理で基本機能を提供・拡張性の確保 |

---

## 🔄 改善点・今後の課題

| 項目 | 説明 |
|------|--------------|
| 💖 いいね数表示・状態保存 | 現在は見た目のみ。今後はユーザーごとにDBに保存予定 |
| 🔁 リプライ・リポスト | 投稿に対するやり取りや共有機能の追加を検討中 |
| 🧑‍💻 新規ユーザー登録 | 誰でも登録できるように対応予定 |

---

## 📚 プロジェクト構成・設計書一覧

- [🪄 プロジェクト構成](PROJECT.md)
- [🔑 ログイン処理設計書](document/LOGIN.md)  
- [📝 ログアウト処理設計書](document/LOGOUT.md)   
- [✏️ 投稿・削除処理設計書](document/MAIN.md)  
- [🗄️ SQLテーブル設計書](document/ER.md)    

---

## 🚀 動作例

| いいね |   | 投稿・削除 |
|----------------|---|-------------------|
| <img src="assets/like.gif" width="280" /> |   | <img src="assets/post.gif" width="300" /> |

※画像をクリックすると拡大表示されます。

---

## 💡ライセンスと著作権

- このプロジェクトは学習目的で作成したものであり、商用利用は想定しておりません。
- 各種ライブラリ・ツールのライセンスはそれぞれの作者に帰属します。

---

## 📸 引用

イラストの出典: 足跡のイラスト – Pixabay  

---

## 🗓️最終更新日

2025-11-15

---

## 🌟 Special Thanks 

最後になりましたが、

- 職業訓練校でスキルを授けてくださった講師の皆様
- TengouIwaharu722 様
- このページを見てくださった方

本当にありがとうございます！これからも精進いたします
