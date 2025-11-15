# 🧸 soloBear – カード風マイクロブログアプリ

🌏 言語切替: [日本語](README.md) | [English](README-en.md)

---

## 🛠️ Technologies Used

<p align="left">
  <!-- Frontend -->
  <img src="https://img.shields.io/badge/HTML5-E34F26.svg?style=for-the-badge&logo=html5&logoColor=white" />
  <img src="https://img.shields.io/badge/CSS3-1572B6.svg?style=for-the-badge&logo=css3&logoColor=white" />
  <img src="https://img.shields.io/badge/JavaScript-F7DF1E.svg?style=for-the-badge&logo=javascript&logoColor=black" />

  <!-- Backend -->
  <img src="https://img.shields.io/badge/Java-007396.svg?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Servlet/JSP-4D4D4D.svg?style=for-the-badge&logo=java&logoColor=white" />

  <!-- Database -->
  <img src="https://img.shields.io/badge/H2%20Database-007AAC.svg?style=for-the-badge&logo=h2&logoColor=white" />

  <!-- Tools -->
  <img src="https://img.shields.io/badge/Apache%20Tomcat-F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black" />
  <img src="https://img.shields.io/badge/Git-F05032.svg?style=for-the-badge&logo=git&logoColor=white" />
  <img src="https://img.shields.io/badge/GitHub-181717.svg?style=for-the-badge&logo=github&logoColor=white" />
</p>

---

## ✨ 概要
soloBearは、Twitter風のシンプルなマイクロブログアプリです。  
授業で作ったプログラムをベースに、自分なりに機能やデザインをアレンジして開発しました。  
カード形式のレイアウトにより、投稿が整理され読みやすく、どの環境でも上品で見やすい表示を提供しています。  
いいねボタンには、ハートの周りに柔らかな円が浮かぶ控えめなアニメーションを実装し、操作に対する優しいフィードバックを演出しています。

---

## 🎯 主な特徴

| 機能 | 説明 |
|----------|-------------|
| 📝 投稿機能 | カード形式で投稿が整理され、視覚的に読みやすいレイアウト |
| 💖 いいね機能 | 優しいアニメーションで、ユーザー操作に心地よい反応を提供 |
| 🎨 UI/UX | 上品で直感的、操作しやすいデザインを意識 |
| 🌓 ダークモードCSS付き | style.css→dark.cssにすることでダークモードも楽しめます |

---

## 🔧 裏側の仕組み

| 項目 | 説明 |
|------|--------------|
| 🗄️ データベース | 3つのテーブル構成で外部キーを管理し、データ整合性を保持 |
| 🔐 セキュリティ | パスワードはBcryptでハッシュ化・ソルト済み、安全に管理 |
| 🧩 キャッシュ・デバッグ | キャッシュ対策やデバッグ確認を行い、安定した動作を実現 |

---

## 💼 プロジェクト構成

- [🪄 プロジェクト構成](PROJECT.md)

  こちらに掲載しております、目を通していただけましたら幸いです。

---

## 🚀 セットアップ

このアプリはダウンロードしてローカルで動作させることができます。
実行にあたり、以下のフォルダと設定が必要です。

- こちらをcloneしてください。
- `h2` フォルダをデスクトップに作成してください。
- ダウンロードした DB ファイル（`soloBear.my.db`）を `h2` フォルダに入れてください。
- eclipse.exeなどで実行すると動作いたします。（2025-11-14 動作確認済み）
- 初期ログイン情報  
  - ID: test  
  - Password: test
 
※ セキュリティは保証されません。開発・動作確認用としてご利用ください。

※ 今後maven化し、こちらがなくとも繋げられるように改善する予定です。

---

## 💻 技術ポイント

| レイヤー | 技術 |
|-------|-------------|
| ⚡ フロントエンド | HTML / CSS / JavaScriptでインタラクティブなUIを構築 |
| 🖥️ バックエンド | シンプルなサーバー処理とデータ管理で基本機能を提供 |
| 🚀 拡張性 | いいねカウントや通知機能など、将来的な機能追加が可能 |

---

## 🔄 改善点・今後の課題

| 項目 | 説明 |
|------|--------------|
| 💖 いいねカウント・状態保存 | 現在は見た目のみ。今後はユーザーごとにDBに保存予定 |
| 🔁 リプライ・リポスト | 投稿に対するやり取りや共有機能の追加を検討中 |
| 🧑‍💻 新規ユーザー登録 | 誰でも登録できるように対応予定 |
| 🔐 パスワードリセット | パスワード忘れ時にメールやSMSでリセット可能に対応予定 |

---

## 📚 設計書一覧

soloBear の各処理やデータベース設計に関する詳細設計書へのリンクです。  
クリックするとそれぞれの設計書が開きます。

- [🔑 ログイン処理設計書](document/LOGIN.md)  
  ユーザーがログインするまでの処理フローと画面構成、セッション管理の詳細

- [📝 ログアウト処理設計書](document/LOGOUT.md)   
  ログイン中のユーザーがログアウトするまでの処理フローと画面構成

- [✏️ 投稿・削除処理設計書](document/MAIN.md)  
  投稿の追加・削除処理のフロー、MVC構成に基づく詳細説明

- [🗄️ SQLテーブル設計書](document/ER.md)    
  USERS / MUTTERS / LIKES のテーブル構成、制約、備考をまとめた設計書

---

## 🚀 動作例

| いいね |   | 投稿・削除 |
|----------------|---|-------------------|
| <img src="assets/like.gif" width="300" /> |   | <img src="assets/post.gif" width="300" /> |

※画像をクリックすると拡大表示されます。

## 🛠 使用したツール

- ✂️ ビデオ編集：CapCut
- 🎞 GIF画像生成：ラッコツール
- 🔄 MP4変換：FreeConvert
- 🗜 GIF軽量化：iLoveIMG

---

## 💡ライセンスと著作権

- このプロジェクトは学習目的で作成したものであり、商用利用は想定しておりません。
- 各種ライブラリ・ツールのライセンスはそれぞれの作者に帰属します。

---

## 📸 引用

イラストの出典: 足跡のイラスト – Pixabay  
https://pixabay.com/ja/illustrations/%E3%82%B7%E3%83%AB%E3%82%A8%E3%83%83%E3%83%88-%E3%82%A4%E3%83%B3%E3%83%97%E3%83%AA%E3%83%B3%E3%83%88-%E8%B6%B3-1314467/

---

## 🗓️最終更新日

2025-11-14

---

## 🌟 Special Thanks 

最後になりましたが、

- 職業訓練校でスキルを授けてくださった講師の皆様
- TengouIwaharu722 様
- このページを見てくださった方

本当にありがとうございます！これからも精進いたします
