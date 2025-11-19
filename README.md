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

soloBear は、短文投稿とシンプルなやり取りを楽しめる、カード型デザインの小型ブログアプリです。
職業訓練校の授業で作ったプログラムをベースに、自分なりに機能やデザインをアレンジし、開発しました。
カード形式とアニメーションで、直感的かつ心地よい操作体験を提供しています。

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

このアプリはダウンロードしてローカルで動作させることができます。開発・動作確認用です。

実行にあたり、以下のフォルダと設定が必要です。

1. このリポジトリを clone

- （例：`git clone https://github.com/shiokuma000/portfolio.git 任意のフォルダ名`）

2. フォルダ作成
- `h2` フォルダをデスクトップに作成してください。
- DBファイルを設置
- `soloBear.my.db`
- `soloBear.trace.db`
  
3. Eclipseなどでプロジェクトを選択
- →右クリック → 「サーバーで実行」
- 動作確認済(2025-11-14）

4. 初期ログイン情報  
- ID: test  
- Password: test
 ※ セキュリティは保証されません。開発・動作確認用としてご利用ください。

5. 今後の予定
- 今後maven化し、こちらがなくとも繋げられるように改善する予定です。

---

## 🔧 技術的工夫

| レイヤー | 工夫・意図 |
|----------|------------|
| 🗄️ DB | 3テーブル＋外部キーで整合性を保持 |
| 🔐 セキュリティ | BCryptでハッシュ化・ソルト済み |
| ⚡ フロントエンド | 投稿カード・アニメで直感的UX |
| 🖥️ バックエンド | 投稿管理をシンプルに実現・PRGパターン |
| 🧩 デバッグ | キャッシュ対策でとログ確認で安定動作・開発効率向上 |

---

## 🔄 改善点・今後の課題

| 項目 | 説明 |
|------|--------------|
| 💖 いいね数表示・状態保存 | 今後はユーザーごとにDBに保存予定 |
| 🔁 リプライ・リポスト | 投稿に対するやり取りや共有機能の追加を検討中 |
| 🧑‍💻 新規ユーザー登録 | 誰でも登録できるように対応予定 |

※ 現在のいいね機能は見た目のみですが、将来的な実装に備えて
   LIKESテーブルおよび関連SQLは保持しています。

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

2025-11-16

---

## 🌟 Special Thanks 

最後になりましたが、

- 職業訓練校でスキルを授けてくださった講師の皆様
- TengouIwaharu722 様
- このページを見てくださった皆様

本当にありがとうございます！これからも精進いたします
